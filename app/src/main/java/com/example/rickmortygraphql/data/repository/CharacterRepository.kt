package com.example.rickmortygraphql.data.repository

import com.example.rickmortygraphql.CharactersQuery

interface CharacterRepository {
    suspend fun getCharacter(): List<CharactersQuery.Result?>?
}