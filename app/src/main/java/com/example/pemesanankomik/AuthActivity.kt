package com.example.pemesanankomik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth) // Menghubungkan ke activity_auth.xml

        // 1. Cari tombol berdasarkan ID
        val registerButton: Button = findViewById(R.id.btn_register)
        val loginButton: Button = findViewById(R.id.btn_login)

        // 2. Beri aksi klik untuk tombol Register
        registerButton.setOnClickListener {
            // Pindah ke RegisterActivity (Screen 15)
            // Kita akan buat Activity ini nanti
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        // 3. Beri aksi klik untuk tombol Login
        loginButton.setOnClickListener {
            // Pindah ke LoginActivity (Screen 14)
            // Kita akan buat Activity ini nanti
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}