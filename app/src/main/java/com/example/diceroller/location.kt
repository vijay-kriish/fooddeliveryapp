package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.example.diceroller.databinding.ActivityLocationBinding
import com.example.diceroller.databinding.ActivityLoginBinding

class location : AppCompatActivity() {
    private val binding: ActivityLocationBinding by lazy {
        ActivityLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val location= arrayOf("chennai","mumbai")
        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,location)
        val autoCompleteTextView=binding.listt
        autoCompleteTextView.setAdapter(adapter)

    }
}