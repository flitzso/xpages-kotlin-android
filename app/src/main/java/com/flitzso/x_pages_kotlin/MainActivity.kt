package com.flitzso.x_pages_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flitzso.x_pages_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Rota das paginas

        // Standard_Page
        binding.imgStandard.setOnClickListener {

            val navegarStandardpage = Intent(this,Standard_page::class.java)
            startActivity(navegarStandardpage)
        }

        // Ken_block_page
        binding.kenCar.setOnClickListener {

            val navegarKenBlockPage = Intent(this,Ken_block_page::class.java)
            startActivity(navegarKenBlockPage)
        }
    }
}