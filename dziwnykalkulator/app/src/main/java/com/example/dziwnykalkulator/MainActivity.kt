package com.example.dziwnykalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import java.util.Date

class MainActivity : AppCompatActivity() {
    lateinit var imieInput: EditText
    lateinit var dataInput: EditText
    lateinit var plecInput: Spinner
    lateinit var serceAlert: TextView
    lateinit var plucaAlert: TextView
    lateinit var oczyAlert: TextView
    lateinit var lykiAlert: TextView
    lateinit var buttoner: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imieInput = findViewById(R.id.imieinput)
        dataInput = findViewById(R.id.dateinput)
        plecInput = findViewById(R.id.spinnerinput)
        serceAlert = findViewById(R.id.sercealert)
        plucaAlert = findViewById(R.id.plucaalert)
        oczyAlert = findViewById(R.id.oczyalert)
        lykiAlert = findViewById(R.id.lykialert)
        buttoner = findViewById(R.id.button)
        buttoner.setOnClickListener {
            _ -> countLife()
        }
    }

    private fun countLife() {
        serceAlert.text = dataInput.text
    }
}