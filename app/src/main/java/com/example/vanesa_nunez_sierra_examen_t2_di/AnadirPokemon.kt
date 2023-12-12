package com.example.vanesa_nunez_sierra_examen_t2_di

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class AnadirPokemon : AppCompatActivity() {

    private lateinit var spinner: Spinner

    lateinit var noml: TextInputLayout
    lateinit var entl: TextInputLayout
    lateinit var estl: TextInputLayout
    lateinit var fecl: TextInputLayout

    lateinit var bo: Button

    lateinit var intento: Intent

    lateinit var nomt: TextInputEditText
    lateinit var entt: TextInputEditText
    lateinit var estt: TextInputEditText
    lateinit var fect: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anadir_pokemon)

        spinner= findViewById<Spinner>(R.id.spinner)

        val adapter =
            ArrayAdapter.createFromResource(this, R.array.tipos, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)

        spinner.adapter = adapter

        noml= findViewById<TextInputLayout>(R.id.textinputlayoutnom)
        entl= findViewById<TextInputLayout>(R.id.textinputlayoutent)
        estl= findViewById<TextInputLayout>(R.id.textinputlayoutesta)
        fecl= findViewById<TextInputLayout>(R.id.textinputlayoutfec)

        bo= findViewById<Button>(R.id.button)

        nomt= findViewById<TextInputEditText>(R.id.textinputedittextnom)
        entt= findViewById<TextInputEditText>(R.id.textinputedittextent)
        estt= findViewById<TextInputEditText>(R.id.textinputedittexesta)
        fect= findViewById<TextInputEditText>(R.id.textinputedittexfec)


        bo.setOnClickListener {
            validacion(noml, entl, estl, fecl, nomt, entt, fect)
        }

        intento = Intent(this, MainActivity::class.java)

        val materialDatePicker = MaterialDatePicker.Builder.datePicker().setTitleText("Seleccionar fecha").build()

        materialDatePicker.addOnPositiveButtonClickListener {
            fect.setText(materialDatePicker.headerText)
        }
        fect.setOnClickListener {
            materialDatePicker.show(supportFragmentManager, materialDatePicker.toString())
        }

    }

    fun validacion(nomml:TextInputLayout, enttl:TextInputLayout, esttl:TextInputLayout, feccl:TextInputLayout, nommt:TextInputEditText, enttt:TextInputEditText, fecct:TextInputEditText) {

        if(nommt.text.toString().length>=3){

        }
    }

}