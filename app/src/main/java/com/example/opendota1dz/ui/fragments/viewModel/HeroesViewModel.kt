package com.example.opendota1dz.ui.fragments.viewModel

import com.example.opendota1dz.data.repository.HeroesRepository
import com.example.opendota1dz.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HeroesViewModel @Inject constructor(
    private val repository: HeroesRepository
): BaseViewModel(){

    fun fetchHeroes() = repository.fetchHeroes()
}