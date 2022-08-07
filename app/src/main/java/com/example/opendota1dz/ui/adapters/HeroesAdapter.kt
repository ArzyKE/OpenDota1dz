package com.example.opendota1dz.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.opendota1dz.data.models.HeroesModel
import com.example.opendota1dz.databinding.ItemHeroesBinding
import com.example.opendota1dz.ui.base.BaseDiffUtilCallback

class HeroesAdapter : ListAdapter<HeroesModel, HeroesAdapter.HeroesViewHolder>(
    BaseDiffUtilCallback()
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroesViewHolder {
        return HeroesViewHolder(
            ItemHeroesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: HeroesViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class HeroesViewHolder(
        private val binding: ItemHeroesBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: HeroesModel) = with(binding) {
            nameTv.text = model.name
        }
    }
}
