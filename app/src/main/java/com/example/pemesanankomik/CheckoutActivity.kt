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
            Toast.makeText(this, "Pesanan diproses!", Toast.LENGTH_SHORT).show()

             val intent = Intent(this, ThankYouActivity::class.java)
             startActivity(intent)
             finish()
        }
    }
}