package com.example.rickmortygraphql.ui.home.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rickmortygraphql.CharactersQuery
import com.example.rickmortygraphql.R

class CharacterAdapter : RecyclerView.Adapter<CharacterViewHolder>() {

    private var characters = mutableListOf<CharactersQuery>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        CharacterViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_character, parent, false)
        )

    override fun getItemCount() = characters.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.render(characters[position])
    }

    fun updateDataSet(charactersUpdated: MutableList<CharactersQuery>) {
        characters = charactersUpdated
        notifyDataSetChanged()
    }
}