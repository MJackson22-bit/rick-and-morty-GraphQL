package com.example.rickmortygraphql.data.model

import com.example.rickmortygraphql.CharactersQuery

data class CharacterState(
    val characters: CharactersQuery.Data? = null
)