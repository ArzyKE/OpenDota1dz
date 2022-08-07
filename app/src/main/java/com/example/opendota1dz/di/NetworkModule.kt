package com.example.opendota1dz.di

import com.example.opendota1dz.data.remote.retrofit.NetworkClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideHeroesApiServices(networkClient: NetworkClient) =
        networkClient.provideCharacterApiService()
}