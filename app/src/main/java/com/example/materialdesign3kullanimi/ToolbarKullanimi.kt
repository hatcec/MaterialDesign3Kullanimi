package com.example.materialdesign3kullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import com.example.materialdesign3kullanimi.databinding.ActivityToolbarKullanimiBinding

class ToolbarKullanimi : AppCompatActivity(),SearchView.OnQueryTextListener {
    lateinit var binding: ActivityToolbarKullanimiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityToolbarKullanimiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.title="Arama"
        binding.toolbar.setLogo(R.drawable.resim)
        binding.toolbar.setTitleTextColor(resources.getColor(R.color.renk1))
        setSupportActionBar(binding.toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {//? işsreti sildi
        //menuInflater.inflate(R.menu.toolbar_menu,menu)
        menuInflater.inflate(R.menu.arama_menu,menu)
        val item=menu.findItem(R.id.action_ara)
        val searchView=item.actionView as SearchView
        searchView.setOnQueryTextListener(this)
        return  true
    }


    override fun onQueryTextSubmit(query: String): Boolean {
        Log.e("onQueryTextSubmşt",query)
        return true
    }

    override fun onQueryTextChange(newText: String): Boolean {//arama kısmına basınca
        Log.e("onQueryTextChange",newText)
        return true
    }


    /* override fun onOptionsItemSelected(item: MenuItem): Boolean {
         when(item.itemId){
             R.id.action_bilgi->{
                 Toast.makeText(applicationContext,"bilgi tıklandı", Toast.LENGTH_SHORT).show()
                 return true
             }
             R.id.action_ayarlar->{
                 Toast.makeText(applicationContext,"ayarlar tıklandı", Toast.LENGTH_SHORT).show()
                 return true
             }
             R.id.action_ekle->{
                 Toast.makeText(applicationContext,"ekle tıklandı", Toast.LENGTH_SHORT).show()
                 return true
             }
             R.id.action_cikis->{
                 Toast.makeText(applicationContext,"çıkış tıklandı", Toast.LENGTH_SHORT).show()
                 return true
             }
             else ->  return super.onOptionsItemSelected(item)
         }

     }*/
}