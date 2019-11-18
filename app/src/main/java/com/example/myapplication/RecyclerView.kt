package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class RecyclerView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val frinends= mutableListOf(
            Friend("Sarah",R.drawable.ic_f,"hello"),
            Friend("Kayla",R.drawable.ic_f2,"world"),
            Friend("Mytle",R.drawable.ic_f3,"hello world")
        )
        frinends.addAll(frinends)
        frinends.addAll(frinends)
        frinends.addAll(frinends)
        friendRecyclerView.layoutManager= LinearLayoutManager(this)
        friendRecyclerView.adapter=Adapter(frinends)

    }
}