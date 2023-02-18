package com.example.recyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.R
import com.example.recyclerview.data.BoardItem
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        val itemList = ArrayList<BoardItem>()
        for (i in 1..20) {
            itemList.add(BoardItem("$i:00", "제목 $i", "작성자 $i"))
        }

        val boardAdapter = BoardAdapter(itemList)
        boardAdapter.notifyDataSetChanged()

        mainBinding.rvBoard.adapter = boardAdapter
        mainBinding.rvBoard.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


    }
}