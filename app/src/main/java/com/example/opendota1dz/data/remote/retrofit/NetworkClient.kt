package com.example.opendota1dz.data.remote.retrofit

import com.example.opendota1dz.data.remote.apiservices.HeroesApiServices
import javax.inject.Inject

class NetworkClient @Inject constructor(
    retrofitClient: RetrofitClient,
    okHttp: OkHttp
) {

    private val provideRetrofit = retrofitClient.provideRetrofit(okHttp.provideOkHttpClient())

    fun provideCharacterApiService() = provideRetrofit.create(HeroesApiServices::class.java)
}
