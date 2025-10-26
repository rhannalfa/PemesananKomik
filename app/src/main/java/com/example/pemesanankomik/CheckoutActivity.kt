package com.example.pemesanankomik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.content.Intent

class CheckoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        val orderButton: Button = findViewById(R.id.btn_order_gaskeun)

        orderButton.setOnClickListener {
            // Untuk saat ini, kita tampilkan pesan Toast
            Toast.makeText(this, "Pesanan diproses!", Toast.LENGTH_SHORT).show()

            // NANTI: Kita akan pindah ke ThankYouActivity (Screen 19)
             val intent = Intent(this, ThankYouActivity::class.java)
             startActivity(intent)
             finish() // Tutup halaman checkout
        }
    }
}