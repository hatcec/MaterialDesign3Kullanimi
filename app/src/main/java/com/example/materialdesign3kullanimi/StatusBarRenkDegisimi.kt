package com.example.materialdesign3kullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesign3kullanimi.databinding.ActivityStatusBarRenkDegisimiBinding

class StatusBarRenkDegisimi : AppCompatActivity() {
    lateinit var binding:ActivityStatusBarRenkDegisimiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityStatusBarRenkDegisimiBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}