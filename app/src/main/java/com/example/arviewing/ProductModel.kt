package com.example.arviewing

import android.os.Parcelable

class ProductModel(
    private var productName: String,
    private var productDescr: String,
    private var productImage: Int,
    private var productModelUrl: String
) {

    fun getProductName(): String {
        return productName
    }

    fun setProductName(productName : String){
        this.productName = productName
    }

    fun getProductDesc(): String {
        return productDescr
    }

    fun setProductImage(image : Int){
        this.productImage = productImage
    }

    fun getProductImage(): Int {
        return productImage
    }

    fun setProductModelUrl(modelUrl : String){
        this.productModelUrl = productModelUrl
    }

    fun getProductModelUrl(): String {
        return productModelUrl
    }



}