package com.example.pemesanankomik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton: Button = findViewById(R.id.btn_login)

        loginButton.setOnClickListener {
            // Untuk saat ini, kita anggap login berhasil dan pindah ke Home
            Toast.makeText(this, "Login berhasil!", Toast.LENGTH_SHORT).show()

            // Pindah ke halaman Home (Screen 16)
            // Kita akan buat HomeActivity selanjutnya
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)

            // Hapus semua activity sebelumnya (Welcome, Auth, Login) dari tumpukan
            finishAffinity()
        }
    }
}