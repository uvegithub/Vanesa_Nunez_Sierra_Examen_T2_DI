package com.example.vanesa_nunez_sierra_examen_t2_di

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun iniciarActividadanadir (view : View){
        val intent = Intent(this, AnadirPokemon::class.java)
        startActivity(intent)
    }

    fun iniciarActividadlistado (view : View){
        val intent = Intent(this, Listado_Pokemon::class.java)
        startActivity(intent)
    }
}