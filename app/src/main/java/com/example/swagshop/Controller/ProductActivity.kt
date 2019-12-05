package com.example.swagshop.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swagshop.R
import com.example.swagshop.Utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
    }
}
