package com.example.testing

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.ArrayAdapter
import java.util.*


class AddCustomer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add__customer)

        val gender: Spinner = findViewById(R.id.gender)
        ArrayAdapter.createFromResource(
                this,
                R.array.gender,
                android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
            gender.adapter = adapter
        }

        val memberType: Spinner = findViewById(R.id.memberTypeSpinner)
        ArrayAdapter.createFromResource(
                this,
                R.array.membertype,
                android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
            gender.adapter = adapter
        }

        val dateOfBirth = Calendar.getInstance()
        val dateOfBirthYear = dateOfBirth.get(Calendar.YEAR)
        val dateOfBirthMonth = dateOfBirth.get(Calendar.MONTH)
        val dateOfBirthDate = dateOfBirth.get(Calendar.DAY_OF_MONTH)
        val btnPickDate: Button = findViewById(R.id.pickDateBtn)
        val viewDOB: TextView = findViewById(R.id.dateTv)

        btnPickDate.setOnClickListener{
            val dob = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{view, year, month, dayOfMonth ->
                viewDOB.setText("" + dayOfMonth +"/"+ month +"/"+ year)
            }, dateOfBirthYear, dateOfBirthMonth, dateOfBirthDate)

            dob.show()
        }



        val spinnerGender: Spinner = findViewById(R.id.gender)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
                this,
                R.array.gender,
                android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinnerGender.adapter = adapter
        }

        val spinnerMemberType: Spinner = findViewById(R.id.memberTypeSpinner)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
                this,
                R.array.membertype,
                android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinnerMemberType.adapter = adapter
        }

    }

}





