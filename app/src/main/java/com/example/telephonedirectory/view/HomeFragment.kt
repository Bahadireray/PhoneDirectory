package com.example.telephonedirectory.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.telephonedirectory.R
import com.example.telephonedirectory.adapter.UserListAdapter
import com.example.telephonedirectory.data.model.User
import com.example.telephonedirectory.data.roomdb.UserDao
import com.example.telephonedirectory.data.roomdb.UserDataBase
import com.example.telephonedirectory.databinding.FragmentHomeBinding
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers


class HomeFragment : Fragment() {

    private lateinit var userListAdapter: UserListAdapter
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val mDisposable = CompositeDisposable()
    private lateinit var userDao: UserDao
    private lateinit var userDataBase: UserDataBase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getFromSQL()
        binding.userPlus.setOnClickListener() {
            Navigation.findNavController(view)
                .navigate(R.id.action_homeFragment_to_userAddFragment, Bundle().apply {
                    putString("info", "new")
                })
        }
    }

    fun getFromSQL() {
        mDisposable.add(
            userDao.getUserWithNameAndId()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::handleResponse)
        )
    }

    private fun handleResponse(userList: List<User>) {
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        userListAdapter = UserListAdapter(userList)
        binding.recyclerView.adapter = userListAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun handleResponse() {
        view?.let {
            Navigation.findNavController(it).navigate(R.id.homeFragment)
        }


    }

}