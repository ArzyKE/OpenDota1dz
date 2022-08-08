package com.example.opendota1dz.data.repository

import com.example.opendota1dz.data.remote.apiservices.HeroesApiServices
import com.example.opendota1dz.data.repository.base.BaseRepository
import javax.inject.Inject

class HeroesRepository @Inject constructor(private val apiServices: HeroesApiServices) :
    BaseRepository() {

    fun fetchHeroes() = doRequest { apiServices.fetchHeroes() }


}