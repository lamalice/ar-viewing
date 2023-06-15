package com.example.arviewing


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.arviewing.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var productViewAdapter: ProductViewAdapter? = null
    private var productList: ArrayList<ProductModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        productList = Constants.defaultProductList()
        setupExerciseStatusRecyclerView()

    }

    private fun setupExerciseStatusRecyclerView(){
        binding.productViewRecycler.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        productViewAdapter = ProductViewAdapter(productList!!)
        binding.productViewRecycler.adapter = productViewAdapter
    }


}


