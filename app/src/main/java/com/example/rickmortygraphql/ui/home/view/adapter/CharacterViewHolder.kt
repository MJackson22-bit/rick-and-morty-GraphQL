package com.example.rickmortygraphql.ui.home.view.adapter

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rickmortygraphql.CharactersQuery
import com.example.rickmortygraphql.R
import com.example.rickmortygraphql.databinding.ItemCharacterBinding

class CharacterViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemCharacterBinding.bind(view)
    private lateinit var context: Context

    fun render(character: CharactersQuery.Result?) {
        context = binding.root.context
        binding.itemCharacterName.text = context.getString(R.string.name_character, character?.name)
        binding.itemCharacterSpecie.text = context.getString(R.string.specie, character?.species)
        binding.itemCharacterStatus.text = context.getString(R.string.status, character?.status)

        Glide.with(binding.itemCharacterImage)
            .load(character?.image)
            .centerCrop()
            .into(binding.itemCharacterImage)
    }

}