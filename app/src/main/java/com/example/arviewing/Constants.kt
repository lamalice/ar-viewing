package com.example.arviewing

object Constants {

    fun defaultProductList(): ArrayList<ProductModel> {
        val productList = ArrayList<ProductModel>()


        val paintedStrawberryCake = ProductModel(
            productName = "Hand-painted Strawberry Cake",
            productDescr = "Fresh stawberries with icing",
            productImage = R.drawable.ic_hand_painted_strawberry,
            productModelUrl = "models/handpainted_watercolor_cake.glb"
        )
        productList.add(paintedStrawberryCake)

        val strawberryCake = ProductModel(
            productName = "Strawberry Cake",
            productDescr = "Layered cake with icing",
            productImage = R.drawable.ic_strawberry_cake,
            productModelUrl = "models/strawberry_cake.glb"
        )
        productList.add(strawberryCake)

        val cupcake = ProductModel(
            productName = "Strawberry Cupcake",
            productDescr = "Basically a smaller version of the Strawberry Cake!",
            productImage = R.drawable.ic_cupcake,
            productModelUrl = "models/hand_painted_cupcake.glb"
        )
        productList.add(cupcake)

        val sushi = ProductModel(
            productName = "Fresh Three-piece Sushi Platter",
            productDescr = "Simple Sashimi Dinner",
            productImage = R.drawable.ic_sushi,
            productModelUrl = "models/sushi.glb"
        )
        productList.add(sushi)

        val ramen = ProductModel(
            productName = "Steamy Ramen with Crab",
            productDescr = "Egg noodles with various garnishing",
            productImage = R.drawable.ic_ramen,
            productModelUrl = "models/ramen.glb"
        )
        productList.add(ramen)

        val chef = ProductModel(
            productName = "Personal Blue Piglet Chef",
            productDescr = "Will personally cater to your needs as a main chef of your kitcken",
            productImage = R.drawable.ic_chef,
            productModelUrl = "models/chef.glb"
        )
        productList.add(chef)

        return productList
    }
}