package com.example.rickmortygraphql.ui.home.view.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rickmortygraphql.CharactersQuery
import com.example.rickmortygraphql.databinding.ItemCharacterBinding

class CharacterViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemCharacterBinding.bind(view)

    fun render(character: CharactersQuery.Result?) {
        binding.itemCharacterName.text = character?.name
        binding.itemCharacterSpecie.text = character?.species
        binding.itemCharacterStatus.text = character?.status

        Glide.with(binding.itemCharacterImage)
            .load(character?.image)
            .centerCrop()
            .into(binding.itemCharacterImage)
    }

}