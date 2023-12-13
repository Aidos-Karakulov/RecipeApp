package com.example.easyfood.data.retrofit

import com.example.easyfood.data.pojo.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface FoodApi {


    @GET ("random.php")
    fun getRandomMeal()


}