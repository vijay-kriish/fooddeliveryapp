package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.diceroller.databinding.ActivityLoginBinding
import com.example.diceroller.databinding.ActivitySecondBinding

@Suppress("DEPRECATION")
class login : AppCompatActivity() {
    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.button2.setOnClickListener{
            val intent=Intent(this,signup::class.java)
            startActivity(intent)
        }
    }
}