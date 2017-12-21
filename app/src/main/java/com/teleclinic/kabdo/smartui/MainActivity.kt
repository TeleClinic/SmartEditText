package com.teleclinic.kabdo.smartui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            Toast.makeText(this, emailSmartEditText.check().toString(), Toast.LENGTH_LONG).show()
            Toast.makeText(this, passwordSmartEditText.check().toString(), Toast.LENGTH_LONG).show()
            Toast.makeText(this, ageSmartEditText.check().toString(), Toast.LENGTH_LONG).show()
        }
    }
}
