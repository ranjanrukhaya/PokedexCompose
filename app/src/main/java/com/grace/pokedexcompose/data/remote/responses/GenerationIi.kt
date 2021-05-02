package com.grace.pokedexcompose.data.remote.responses


import com.google.gson.annotations.SerializedName
import com.grace.pokedexcompose.data.remote.responses.Gold

data class GenerationIi(
    val crystal: Crystal,
    val gold: Gold,
    val silver: Silver
)