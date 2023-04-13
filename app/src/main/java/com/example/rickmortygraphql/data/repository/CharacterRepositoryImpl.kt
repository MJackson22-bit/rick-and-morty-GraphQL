package com.example.rickmortygraphql.data.repository

import com.apollographql.apollo3.ApolloClient
import com.example.rickmortygraphql.CharactersQuery
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val apolloClient: ApolloClient
) : CharacterRepository {

    override suspend fun getCharacter(): List<CharactersQuery.Result?>? {
        val response = apolloClient.query(CharactersQuery()).execute()
        return response.data?.characters?.results
    }
}