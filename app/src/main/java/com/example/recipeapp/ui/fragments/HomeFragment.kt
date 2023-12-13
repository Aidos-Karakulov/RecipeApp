package com.example.easyfood.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowInsetsAnimation
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.easyfood.R
import com.example.easyfood.data.pojo.*
import com.example.easyfood.data.retrofit.RetrofitInstance
import com.example.easyfood.databinding.FragmentHomeBinding



class HomeFragment : Fragment() {


    lateinit var binding: FragmentHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentHomeBinding.inflate(layoutInflater)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

//        RetrofitInstance.api.getRandomMeal().enqueue(object :
//            WindowInsetsAnimation.Callback<MealList> {
//            override fun onResponse(call:<MealList>,response:Response<MealList>)
//            {
//                if (response.body() != null) {
//                    val randomMeal: Meal = response.body()!! meals [0]
//                    Glide.with(this@HomeFragment)
//                        .load(randomMeal.strMealThumb)
//                        .into(binding.toString())
//                } else {
//                    return
//                }
//            }
//            override fun onFailure(call:Call<MealList>,t:Throwable){
//                Log.d("MealFragment",t.message.toString())
//            }
//
//        })
//    }
}






























}
