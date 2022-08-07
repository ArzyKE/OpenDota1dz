package com.example.opendota1dz.data.remote.apiservices

import com.example.opendota1dz.data.models.HeroesModel
import retrofit2.http.GET

interface HeroesApiServices {
    @GET("heroes")
    suspend fun fetchHeroes(): List<HeroesModel>
}