package com.example.rickmortygraphql.core.di

import com.example.rickmortygraphql.data.repository.CharacterRepository
import com.example.rickmortygraphql.data.repository.CharacterRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class CharacterModule {

    @Binds
    abstract fun bindCharacterModule(characterRepositoryImpl: CharacterRepositoryImpl): CharacterRepository
}