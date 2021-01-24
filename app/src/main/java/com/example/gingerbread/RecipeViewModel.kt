package com.example.gingerbread

import android.app.Application
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.AndroidViewModel
import com.example.gingerbread.util.Constants
import com.example.gingerbread.util.Constants.Companion.API_KEY
import com.example.gingerbread.util.Constants.Companion.QUERY_ADD_RECIPE_INFORMATION
import com.example.gingerbread.util.Constants.Companion.QUERY_API_KEY
import com.example.gingerbread.util.Constants.Companion.QUERY_DIET
import com.example.gingerbread.util.Constants.Companion.QUERY_FILL_INGREDIENTS
import com.example.gingerbread.util.Constants.Companion.QUERY_NUMBER
import com.example.gingerbread.util.Constants.Companion.QUERY_TYPE

class RecipeViewModel @ViewModelInject constructor(application: Application): AndroidViewModel(application) {

    fun applyQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()
        queries[QUERY_NUMBER] = "50"
        queries[QUERY_API_KEY] = API_KEY
        queries[QUERY_TYPE] = "snack"
        queries[QUERY_DIET] = "vegan"
        queries[QUERY_ADD_RECIPE_INFORMATION] = "true"
        queries[QUERY_FILL_INGREDIENTS] = "true"

        return queries
    }

}