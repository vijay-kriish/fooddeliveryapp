package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.diceroller.databinding.ActivitySecondBinding

class second : AppCompatActivity() {
    private val binding:ActivitySecondBinding by lazy{
        ActivitySecondBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.button3.setOnClickListener{
            val intent=Intent(this,login::class.java)
            startActivity(intent)
        }
    }
}