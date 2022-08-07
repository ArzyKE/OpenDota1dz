package com.example.opendota1dz.ui.fragments

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.opendota1dz.R
import com.example.opendota1dz.databinding.FragmentHeroesBinding
import com.example.opendota1dz.ui.adapters.HeroesAdapter
import com.example.opendota1dz.ui.base.BaseFragment
import com.example.opendota1dz.ui.fragments.viewModel.HeroesViewModel
import com.example.opendota1dz.utils.Either
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HeroesFragment : BaseFragment<HeroesViewModel, FragmentHeroesBinding>(
    R.layout.fragment_heroes
) {
    override val viewModel by viewModels<HeroesViewModel>()
    override val binding by viewBinding(FragmentHeroesBinding::bind)
    private val heroesAdapter = HeroesAdapter()

    override fun initialize() {
        setupAdapter()
    }

    private fun setupAdapter() = with(binding.recycler) {
        layoutManager = LinearLayoutManager(requireContext())
        adapter = heroesAdapter
    }

    override fun setupSubscribe() {
        viewModel.fetchHeroes().observe(viewLifecycleOwner){
            when(it){
                is Either.Left -> {
                    Log.e("son", it.value)
                }
                is Either.Right -> {
                    Log.e("son", it.value.toString())
                    heroesAdapter.submitList(it.value)
                }
            }
        }
    }
}