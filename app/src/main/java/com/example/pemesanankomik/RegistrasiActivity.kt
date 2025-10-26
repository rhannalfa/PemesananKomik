package com.example.pemesanankomik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.content.Intent

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val registerButton: Button = findViewById(R.id.btn_register)

        registerButton.setOnClickListener {
            Toast.makeText(this, "Registrasi berhasil!", Toast.LENGTH_SHORT).show()

             val intent = Intent(this, HomeActivity::class.java)
             startActivity(intent)
             finish()
        }
    }
}