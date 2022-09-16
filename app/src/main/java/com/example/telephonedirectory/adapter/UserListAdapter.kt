package com.example.telephonedirectory.adapter

import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.telephonedirectory.R
import com.example.telephonedirectory.adapter.UserListAdapter.UserHolder
import com.example.telephonedirectory.data.model.User
import com.example.telephonedirectory.databinding.RoxRecyclerBinding

class UserListAdapter(val userList: List<User>) :
    RecyclerView.Adapter<UserHolder>() {

    class UserHolder(val binding: RoxRecyclerBinding) : RecyclerView.ViewHolder(binding.root) {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {

        val binding = RoxRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }


    override fun onBindViewHolder(holder: UserHolder, position: Int) {


        val byteArray = userList[position].userImage
        val bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray!!.size)


        holder.binding.recyclerViewUser.text = userList[position].userName
        holder.binding.recyclerViewNumber.text = userList[position].userNumber
        holder.binding.recyclerImageView.setImageBitmap(bitmap)
        holder.itemView.setOnClickListener {
            it?.let {
                Navigation.findNavController(it)
                    .navigate(R.id.action_homeFragment_to_userAddFragment, Bundle().apply {
                        putString("userName", userList[position].userName)
                        putString("userNumber", userList[position].userNumber)
                        putByteArray("userImage", userList[position].userImage)

                    })
            }
        }

    }
}