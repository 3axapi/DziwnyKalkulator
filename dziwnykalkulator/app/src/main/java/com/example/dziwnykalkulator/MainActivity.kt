package com.example.dziwnykalkulator

import android.icu.util.LocaleData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import org.w3c.dom.Text
import java.util.Calendar
import java.util.Date

class MainActivity : AppCompatActivity() {
    lateinit var colorr: TextView
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

        colorr = findViewById(R.id.color)
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
        val date : String = dataInput.text.toString()
        val year = Integer.parseInt(date.subSequence(4, 7).toString())
        val month = Integer.parseInt(date.subSequence(2, 3).toString())
        val day = Integer.parseInt(date.subSequence(0, 1).toString())
        val calendarr = Calendar.getInstance()
        val aaa = calendarr.set(year, month, day).toString()
        //val fullDate = Date("${year}/${month}/${day}")

        colorr.text = aaa //LocalDate.of(year, month, day)



        val calendar = Calendar.getInstance()
        val cyear = calendar.get(Calendar.YEAR) // c — current
        val cmonth = calendar.get(Calendar.MONTH) // c — current
        val cday = calendar.get(Calendar.DAY_OF_MONTH) // c — current
    }
}