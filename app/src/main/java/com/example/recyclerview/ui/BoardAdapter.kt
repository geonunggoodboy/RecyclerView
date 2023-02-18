package com.example.recyclerview.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recyclerview.data.BoardItem
import com.example.recyclerview.databinding.ItmeRecyclerBinding


class BoardAdapter(private val itemList: ArrayList<BoardItem>): RecyclerView.Adapter<BoardAdapter.BoardViewHolder>() {
    inner class BoardViewHolder(private val binding: ItmeRecyclerBinding): ViewHolder(binding.root) {
        fun bind(item:BoardItem){
            binding.tvTime.text = item.time
            binding.tvTitle.text = item.title
            binding.tvName.text = item.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        val binding = ItmeRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BoardViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        val item = itemList[position]
        holder.bind(item)
    }


}