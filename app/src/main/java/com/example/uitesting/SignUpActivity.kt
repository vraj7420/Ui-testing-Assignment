package com.example.uitesting

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*
import kotlinx.android.synthetic.main.activity_sign_up.btnActivitySignup
import java.text.SimpleDateFormat
import java.util.*

class SignUpActivity : AppCompatActivity() {
    private var cal: Calendar = Calendar.getInstance()
    private val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    private lateinit var tvSignUpSuccessfully:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        init()
        setListener()
    }
    @SuppressLint("SetTextI18n")
    private fun setListener() {
        val dateSetListener =
            DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, month)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                val myFormat = "MM/dd/yyyy" // mention the format you need
                val sdf = SimpleDateFormat(myFormat, Locale.US)
                val tempDate = sdf.format(cal.time).toString()
                tetBirthDate.setText(tempDate)
            }
        tetBirthDate.setOnClickListener {
            DatePickerDialog(
                this,
                dateSetListener,
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH)
            ).show()
        }
        btnActivitySignup.setOnClickListener {
            if (tetFullName.text.toString()=="") {
                tetFullName.error =getString(R.string.error_full_name)
                tetFullName.requestFocus()
            }else if (tetPhoneNumber.text.toString().trim().isEmpty()) {
                tetPhoneNumber.error = getString(R.string.error_phone_number_is_empty)
                tetPhoneNumber.requestFocus()
            } else if (tetPhoneNumber.text.toString().length != 10) {
                tetPhoneNumber.error = getString(R.string.error_phone_number_valid)
                tetPhoneNumber.requestFocus()

            } else if (tetEmailAddress.text.toString().trim().isEmpty()) {
                tetEmailAddress.error = getString(R.string.error_email_is_empty)
                tetEmailAddress.requestFocus()
            } else if (!tetEmailAddress.text.toString().trim().matches(emailPattern.toRegex())) {
                tetEmailAddress.error = getString(R.string.error_email_valid)
                tetEmailAddress.requestFocus()
            } else if (tetAddress.text.toString().trim().isEmpty()) {
                tetAddress.error = getString(R.string.error_address)
                tetAddress.requestFocus()
            }else{
                Toast.makeText(this,"Sign up Successfully",Toast.LENGTH_SHORT).show()
                tvSignUpSuccessfully.text = "Sign up Successfully"
            }
        }
    }


        private fun init() {
        val dataOfSpinner=resources.getStringArray(R.array.country)
        val adapterSpinnerCountry=ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,dataOfSpinner)
         spCountry.adapter=adapterSpinnerCountry

    }

 }

