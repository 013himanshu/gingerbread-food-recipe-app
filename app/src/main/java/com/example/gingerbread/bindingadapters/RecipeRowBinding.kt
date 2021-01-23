package com.example.gingerbread.bindingadapters

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.example.gingerbread.R
import javax.inject.Singleton

class RecipeRowBinding {
    companion object {

        @BindingAdapter("setNumberOfLikes")
        @JvmStatic
        fun setNumberOfLike(textView: TextView, likes: Int) {
            textView.text = likes.toString()
        }

        @BindingAdapter("setRecipeTime")
        @JvmStatic
        fun setRecipeTime(textView: TextView, recipeTime: Int) {
            textView.text = recipeTime.toString()
        }

        @BindingAdapter("setVeganColor")
        @JvmStatic
        fun setVeganColor(view: View, vegan: Boolean) {
            if(vegan) {
                when(view) {
                    is TextView -> {
                        view.setTextColor(ContextCompat.getColor(view.context, R.color.green))
                    }
                    is ImageView -> {
                        view.setColorFilter(ContextCompat.getColor(view.context, R.color.green))
                    }
                }
            }
        }
    }
}