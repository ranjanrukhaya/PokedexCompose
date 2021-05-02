package com.grace.pokedexcompose.data.remote.responses


import com.google.gson.annotations.SerializedName
import com.grace.pokedexcompose.data.remote.responses.AbilityX

data class Ability(
    val ability: AbilityX,
    @SerializedName("is_hidden")
    val isHidden: Boolean,
    val slot: Int
)