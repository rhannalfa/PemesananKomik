package com.example.pemesanankomik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
 import android.content.Intent // Kita aktifkan nanti jika sudah ada halaman Home

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val registerButton: Button = findViewById(R.id.btn_register)

        registerButton.setOnClickListener {
            // Untuk saat ini, kita tampilkan pesan Toast saja
            Toast.makeText(this, "Registrasi berhasil!", Toast.LENGTH_SHORT).show()

            // NANTI: Setelah registrasi berhasil, pindah ke halaman Home (Screen 16)
             val intent = Intent(this, HomeActivity::class.java)
             startActivity(intent)
             finish() // Tutup halaman ini agar tidak bisa kembali
        }
    }
}