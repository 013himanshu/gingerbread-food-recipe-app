package com.example.gingerbread.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.gingerbread.databinding.RecipeRowLayoutBinding
import com.example.gingerbread.model.FoodRecipe
import com.example.gingerbread.model.Result
import com.example.gingerbread.util.RecipeDiffUtil


class RecipesAdapter: RecyclerView.Adapter<RecipesAdapter.MyViewHolder>() {
    private var recipe = emptyList<Result>()

    class MyViewHolder(private val binding: RecipeRowLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(result: Result) {
            binding.result = result
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): MyViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = RecipeRowLayoutBinding.inflate(layoutInflater, parent, false)
                return MyViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentResult = recipe[position]
        holder.bind(currentResult)
    }

    override fun getItemCount(): Int {
        return recipe.size
    }

    fun setData(newData: FoodRecipe) {
        val recipeDiffUtil = RecipeDiffUtil(recipe, newData.results)
        val diffUtilResult = DiffUtil.calculateDiff(recipeDiffUtil)
        recipe = newData.results
//        notifyDataSetChanged()
        diffUtilResult.dispatchUpdatesTo(this)
    }
}