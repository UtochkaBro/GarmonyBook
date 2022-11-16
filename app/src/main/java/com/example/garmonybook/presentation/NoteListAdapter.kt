package com.example.garmonybook.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.garmonybook.R
import com.example.garmonybook.domain.NoteItem

class NoteListAdapter: RecyclerView.Adapter<NoteListAdapter.NoteItemViewHolder>() {

    val list = listOf<NoteItem>()

    override fun onCreateViewHolder(parent: ViewGroup , viewType: Int): NoteItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_note_disabled, parent, false)
        return NoteItemViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: NoteItemViewHolder , position: Int) {
        val noteItem = list[position]
        viewHolder.tvName.text = noteItem.name
        viewHolder.tvDescription.text = noteItem.description
        viewHolder.tvScore.text = noteItem.score.toString()
        viewHolder.view.setOnLongClickListener {
            true
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class NoteItemViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvName = view.findViewById<TextView>(R.id.tv_name)
        val tvDescription = view.findViewById<TextView>(R.id.tv_description)
        val tvScore = view.findViewById<TextView>(R.id.sb_score)
    }
}