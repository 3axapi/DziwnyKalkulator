package com.example.dziwnykalkulator

import android.app.DatePickerDialog
import android.icu.util.LocaleData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import org.w3c.dom.Text
import java.lang.Math.round
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class MainActivity : AppCompatActivity() {
    lateinit var imieInput: EditText
    lateinit var dataInput: EditText
    lateinit var plecInput: Spinner
    lateinit var imieAlert: TextView
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
        imieAlert = findViewById(R.id.imiealert)
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
        val date : String = dataInput.text.toString()
        val year = Integer.parseInt(date.subSequence(4, 8).toString())
        val month = Integer.parseInt(date.subSequence(2, 4).toString())
        val day = Integer.parseInt(date.subSequence(0, 2).toString())
        val sel_date = Date("${year}/${month}/${day}")
        val cur_date = Date()

        var diff_time = (cur_date.time - sel_date.time) / 1000
        var uderzenia : Double = diff_time * 1.3
        var oddechy : Double = diff_time * 0.2662037
        var mrgniecia : Double = diff_time * 0.1273148
        var lyki : Double = diff_time * 0.02893518

        if (plecInput.selectedItem == "kobieta") {
            uderzenia = uderzenia * 0.95
            oddechy = oddechy * 0.95
            mrgniecia = mrgniecia * 0.95
            lyki = lyki * 0.95
        }



        imieAlert.text = "${imieInput.text}(y/a) charaktystyka"
        serceAlert.text = round(uderzenia).toString()
        plucaAlert.text = round(oddechy).toString()
        oczyAlert.text = round(mrgniecia).toString()
        lykiAlert.text = round(lyki).toString()
    }
}