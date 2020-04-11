package com.example.snsd

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class MyCustomAdapter(val items: List<Person>, private val clickListener: (Person) -> Unit) :
    RecyclerView.Adapter<MyCustomAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(items[position], clickListener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(person: Person, clickListener: (Person) -> Unit) {
            itemView.name.text = person.name
            itemView.birth.text= person.birth
            itemView.hinhanh.setImageResource(person.image)
            itemView.setOnClickListener { clickListener(person)}
        }
    }
}