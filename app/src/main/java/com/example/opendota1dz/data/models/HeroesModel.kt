package com.example.opendota1dz.data.models

import com.example.opendota1dz.ui.base.IBaseDiffModel
import com.google.gson.annotations.SerializedName

data class HeroesModel(
    @SerializedName("primary_attr")
    val primaryAttr: String,
    @SerializedName("attack_type")
    val attackType: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("id")
    override val id: Int,
    @SerializedName("localized_name")
    val localizedName: String
) : IBaseDiffModel