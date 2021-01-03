package com.example.gingerbread.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.gingerbread.R
import com.example.gingerbread.databinding.FragmentRecipeBinding
import org.jsoup.helper.DataUtil

class RecipeFragment : Fragment() {
    private lateinit var binding: FragmentRecipeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_recipe, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_recipe, container, false)

        binding.shimmerRecyclerView.showShimmer()

        return binding.root
    }

}