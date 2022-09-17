package com.example.telephonedirectory.view

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.room.Room
import com.example.telephonedirectory.R
import com.example.telephonedirectory.data.model.User
import com.example.telephonedirectory.data.roomdb.UserDao
import com.example.telephonedirectory.data.roomdb.UserDataBase
import com.example.telephonedirectory.databinding.FragmentUserAddBinding
import com.google.android.material.snackbar.Snackbar
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import java.io.ByteArrayOutputStream
import java.io.IOException


class UserAddFragment : Fragment() {

    //View Binding
    private val binding get() = _binding!!
    private var _binding: FragmentUserAddBinding? = null

    //Data Transmission
    var userFromMain: User? = null
    var selectedPicture: Uri? = null
    var selectedBitmap: Bitmap? = null

    //Room
    private lateinit var userDao: UserDao
    private lateinit var userDataBase: UserDataBase
    private val mDisposable = CompositeDisposable()

    //Android Permission
    private lateinit var activityResultLauncher: ActivityResultLauncher<Intent>
    private lateinit var permissionLauncher: ActivityResultLauncher<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerLauncher()

        //Room initialize
        userDataBase =
            Room.databaseBuilder(requireContext(), UserDataBase::class.java, "Users")
                .allowMainThreadQueries()
                .build()
        userDao = userDataBase.userDao()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //View initialize
        _binding = FragmentUserAddBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageView.setOnClickListener { selectedImg(view) }
        binding.userSaveButton.setOnClickListener {
            save(view)
        }

        val info = requireArguments().getString("info")
        if (info == "new") {
            binding.edtUserPhone.setText("")
            binding.edtUserName.setText("")
            val selectedImageBackground =
                BitmapFactory.decodeResource(context?.resources, R.drawable.image)
            binding.imageView.setImageBitmap(selectedImageBackground)
        } else {

            binding.userSaveButton.visibility = View.INVISIBLE
            binding.edtUserName.setText(requireArguments().getString("userName"))
            binding.edtUserPhone.setText(requireArguments().getString("userNumber"))
            val byteArray = requireArguments().getByteArray("userImage")
            val bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray!!.size)
            binding.imageView.setImageBitmap(bitmap)

        }
    }

    private fun handleResponseWithOldUser(user: User) {
        userFromMain = user
        binding.edtUserName.setText(requireArguments().getString("userName"))
        binding.edtUserPhone.setText(requireArguments().getString("userNumber"))

    }

    fun save(view: View) {
        println("save View")
        val userName = binding.edtUserName.text.toString()
        val userNumber = binding.edtUserPhone.text.toString()
        if (selectedBitmap != null) {
            val smallBitmap = makeSmallerBitmap(selectedBitmap!!, 300)
            val outputStream = ByteArrayOutputStream()
            smallBitmap.compress(Bitmap.CompressFormat.PNG, 50, outputStream)
            val byteArray = outputStream.toByteArray()
            val user = User(userName, userNumber, byteArray)

            mDisposable.add(
                userDao.insert(user)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(this::handleResponse)
            )
        }
    }

    private fun handleResponse() {
        view?.let {
            Navigation.findNavController(it).navigate(R.id.action_userAddFragment_to_homeFragment)
        }
    }


    fun makeSmallerBitmap(image: Bitmap, maximumSize: Int): Bitmap {
        var width = image.width
        var height = image.height

        val bitmapRatio: Double = width.toDouble() / height.toDouble()
        if (bitmapRatio > 1) {
            width = maximumSize
            val scaledHeight = width / bitmapRatio
            height = scaledHeight.toInt()
        } else {
            height = maximumSize
            val scaledWidth = height * bitmapRatio
            width = scaledWidth.toInt()
        }

        return Bitmap.createScaledBitmap(image, width, height, true)

    }

    fun selectedImg(view: View) {
        activity?.let {
            if (ContextCompat.checkSelfPermission(
                    requireActivity().applicationContext,
                    Manifest.permission.READ_EXTERNAL_STORAGE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(
                        requireActivity(),
                        Manifest.permission.READ_EXTERNAL_STORAGE
                    )
                ) {
                    Snackbar.make(view, "Permission needed for gallery", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Give Permission",
                            View.OnClickListener {
                                permissionLauncher.launch(Manifest.permission.READ_EXTERNAL_STORAGE)
                            }).show()
                } else {
                    permissionLauncher.launch(Manifest.permission.READ_EXTERNAL_STORAGE)
                }
            } else {
                val intentToGallery =
                    Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
                activityResultLauncher.launch(intentToGallery)

            }

        }
    }

    private fun registerLauncher() {
        activityResultLauncher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result ->
            if (result.resultCode == AppCompatActivity.RESULT_OK) {
                val intentFromResult = result.data
                if (intentFromResult != null) {
                    selectedPicture = intentFromResult.data
                    try {
                        if (Build.VERSION.SDK_INT >= 28) {
                            val source = ImageDecoder.createSource(
                                requireActivity().contentResolver,
                                selectedPicture!!
                            )
                            selectedBitmap = ImageDecoder.decodeBitmap(source)
                            binding.imageView.setImageBitmap(selectedBitmap)
                        } else {
                            selectedBitmap = MediaStore.Images.Media.getBitmap(
                                requireActivity().contentResolver,
                                selectedPicture
                            )
                            binding.imageView.setImageBitmap(selectedBitmap)
                        }
                    } catch (e: IOException) {
                        e.printStackTrace()
                    }
                }
            }
        }
        permissionLauncher = registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { result ->
            if (result) {
                //permission granted
                val intentToGallery =
                    Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
                activityResultLauncher.launch(intentToGallery)
            } else {
                //permission denied
                Toast.makeText(requireContext(), "Permisson needed!", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        mDisposable.clear()
    }
}