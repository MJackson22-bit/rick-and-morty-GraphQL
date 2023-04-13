package com.example.rickmortygraphql.ui.home.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickmortygraphql.CharactersQuery
import com.example.rickmortygraphql.data.repository.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val characterRepository: CharacterRepository
) : ViewModel() {

    private val _characters = MutableLiveData<List<CharactersQuery.Result?>>()
    val characters get() = _characters

    fun getCharacters() {
        viewModelScope.launch {
            _characters.postValue(characterRepository.getCharacter())
        }
    }


}