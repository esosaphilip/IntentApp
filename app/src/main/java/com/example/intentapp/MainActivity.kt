package com.example.intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.intentapp.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root


//binding the TextView
        binding.AndroidIntent
        binding.BIntent
        binding.CIntent


//use buton1 to set up explict Activity
        binding.buton1.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)

        }
        binding.buon2.setOnClickListener {  }
        binding.bon3.setOnClickListener {  }
        binding.bn4.setOnClickListener {  }

        startActivity(intent)


    }

}