package com.example.gingerbread.data.network

import com.example.gingerbread.model.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecipeApi {

    @GET("/recipes/complexSearch")
    suspend fun getRecipes(
            @QueryMap queries: Map<String, String>
    ): Response<FoodRecipe>

}