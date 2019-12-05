package com.example.swagshop.Services

import com.example.swagshop.Model.Category
import com.example.swagshop.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Graphic Beanie","$18","hat1"),
        Product("Hat Black","$28","hat2"),
        Product("Hat White","$19","hat3"),
        Product("Graphic Beanie","$18","hat1"),
        Product("Hat Black","$28","hat2"),
        Product("Hat White","$19","hat3"),
        Product("Graphic Beanie","$18","hat1"),
        Product("Hat Black","$28","hat2"),
        Product("Hat White","$19","hat3"),
        Product("Graphic Beanie","$18","hat1"),
        Product("Hat Black","$28","hat2"),
        Product("Hat White","$19","hat3"),
        Product("Hat Snapback","$12","hat3")
    )

    val hoodies = listOf(
        Product("Hoodie1","$10","hoodie1"),
        Product("Hoodie2","$11","hoodie2"),
        Product("Hoodie3","$20","hoodie3"),
        Product("Hoodie1","$10","hoodie1"),
        Product("Hoodie2","$11","hoodie2"),
        Product("Hoodie3","$20","hoodie3"),
        Product("Hoodie1","$10","hoodie1"),
        Product("Hoodie2","$11","hoodie2"),
        Product("Hoodie3","$20","hoodie3"),
        Product("Hoodie1","$10","hoodie1"),
        Product("Hoodie2","$11","hoodie2"),
        Product("Hoodie3","$20","hoodie3"),
        Product("Hoodie4","$14","hoodie4")
    )

    val shirts = listOf(
        Product("Shirt1","$11","shirt1"),
        Product("Shirt2","$12","shirt2"),
        Product("Shirt3","$13","shirt3"),
        Product("Shirt4","$14","shirt4"),
        Product("Shirt1","$11","shirt1"),
        Product("Shirt2","$12","shirt2"),
        Product("Shirt3","$13","shirt3"),
        Product("Shirt4","$14","shirt4"),
        Product("Shirt1","$11","shirt1"),
        Product("Shirt2","$12","shirt2"),
        Product("Shirt3","$13","shirt3"),
        Product("Shirt4","$14","shirt4"),
        Product("Shirt1","$11","shirt1"),
        Product("Shirt2","$12","shirt2"),
        Product("Shirt3","$13","shirt3"),
        Product("Shirt4","$14","shirt4"),
        Product("Shirt5","$15","shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}

