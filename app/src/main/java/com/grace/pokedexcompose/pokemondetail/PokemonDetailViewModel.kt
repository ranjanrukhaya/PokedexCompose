package com.grace.pokedexcompose.pokemondetail

import androidx.lifecycle.ViewModel
import com.grace.pokedexcompose.data.remote.responses.Pokemon
import com.grace.pokedexcompose.repository.PokemonRepository
import com.grace.pokedexcompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}