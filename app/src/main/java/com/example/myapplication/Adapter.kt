package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*


class Adapter(private var friends: List<Friend>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = if (viewType != 0) {
            LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        }else SearchView(parent.context)
        return ViewHolder(view)
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) 0 else 1
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        if (position != 0) {
            holder.view.name.text = friends[position - 1].name
            holder.view.message.text = friends[position - 1].message
            holder.view.head.setImageResource(friends[position - 1].head)
        }

    }

    override fun getItemCount(): Int = friends.size + 1
    class ViewHolder(var view: View) : RecyclerView.ViewHolder(view)
}
