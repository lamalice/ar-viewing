package com.example.arviewing


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.arviewing.databinding.ActivityMainBinding

const val PRODUCT_NAME = "PRODUCT_NAME"
const val PRODUCT_DESCRIPTION = "PRODUCT_DESCRIPTION"
const val PRODUCT_GLB_URL = "PRODUCT_GLB_URL"
const val PRODUCT_IMAGE_URL = "PRODUCT_IMAGE_URL"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var productViewAdapter: ProductViewAdapter? = null
    private var productList: ArrayList<ProductModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setStatusBarColor(ContextCompat.getColor(this, io.github.sceneview.ar.R.color.material_grey_300))

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        productList = Constants.defaultProductList()
        setupExerciseStatusRecyclerView()

       productViewAdapter?.onItemClick =  {
            val intent = Intent(this, ProductViewActivity::class.java)
           intent.putExtra(PRODUCT_GLB_URL, it.getProductModelUrl())
           startActivity(intent)
        }
    }

    private fun setupExerciseStatusRecyclerView(){
        binding.productViewRecycler.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        productViewAdapter = ProductViewAdapter(productList!!)
        binding.productViewRecycler.adapter = productViewAdapter
        binding.productViewRecycler.isNestedScrollingEnabled = false;
    }



}


