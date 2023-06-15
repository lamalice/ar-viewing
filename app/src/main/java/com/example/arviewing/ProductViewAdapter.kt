package com.example.arviewing

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.get
import androidx.recyclerview.widget.RecyclerView
import com.example.arviewing.databinding.ItemProductCardBinding

class ProductViewAdapter (val products: ArrayList<ProductModel>) :
    RecyclerView.Adapter<ProductViewAdapter.ViewHolder>() {

    class ViewHolder(binding: ItemProductCardBinding) : RecyclerView.ViewHolder(binding.root) {
        var productViewCard = binding.productViewCard
        var productName = binding.productName
        var productImage = binding.productImage
        var productDesc = binding.productDescription
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemProductCardBinding.inflate(
            LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model: ProductModel = products[position]
        holder.productName.text = model.getProductName()
        holder.productDesc.text = model.getProductDesc()
        holder.productImage.setImageResource(model.getProductImage())
        //holder.productImage.setImageResource(model.getProductImage())
    }
}