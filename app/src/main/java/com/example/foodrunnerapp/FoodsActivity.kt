package com.example.foodrunnerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.foodrunnerapp.R

class FoodsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foods)

        // Populate the list of foods with images in the ScrollView.
    }
}
