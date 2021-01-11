package com.example.gingerbread.data

import com.example.gingerbread.data.network.FoodRecipeApi
import com.example.gingerbread.model.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val foodRecipeApi: FoodRecipeApi) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipeApi.getRecipes(queries)
    }

}