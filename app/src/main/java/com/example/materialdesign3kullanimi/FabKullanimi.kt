package com.example.materialdesign3kullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.materialdesign3kullanimi.databinding.ActivityFabKullanimiBinding

class FabKullanimi : AppCompatActivity() {
    lateinit var  binding:ActivityFabKullanimiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFabKullanimiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.fab.setOnClickListener{
            Toast.makeText(this,"merhaba",Toast.LENGTH_LONG).show()
        }

    }
}