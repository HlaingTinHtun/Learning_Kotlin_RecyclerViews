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
        Product("Graphic Beanie","$18","hat01"),
        Product("Hat Black","$28","hat02"),
        Product("Hat White","$19","hat03"),
        Product("Hat Snapback","$12","hat03")
    )

    val hoodies = listOf(
        Product("Hoodie1","$10","hoodie01"),
        Product("Hoodie2","$11","hoodie02"),
        Product("Hoodie3","$20","hoodie03"),
        Product("Hoodie4","$14","hoodie04")
    )

    val shirt = listOf(
        Product("Shirt1","$11","shirt01"),
        Product("Shirt2","$12","shirt02"),
        Product("Shirt3","$13","shirt03"),
        Product("Shirt4","$14","shirt04"),
        Product("Shirt5","$15","shirt05")
    )
}