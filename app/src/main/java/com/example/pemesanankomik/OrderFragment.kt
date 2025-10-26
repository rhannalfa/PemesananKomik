package com.example.pemesanankomik

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class OrderFragment : Fragment() {

    private lateinit var viewModel: CartViewModel
    private lateinit var tvDaftarPesanan: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_order, container, false)

        val kirimButton: Button = view.findViewById(R.id.btn_kirim)
        tvDaftarPesanan = view.findViewById(R.id.tv_daftar_pesanan) // Ambil TextView

        kirimButton.setOnClickListener {
            val intent = Intent(activity, CheckoutActivity::class.java)
            startActivity(intent)
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 1. Dapatkan ViewModel yang sama dengan yang dipakai Adapter
        viewModel = ViewModelProvider(requireActivity()).get(CartViewModel::class.java)

        // 2. "Amati" data keranjang
        viewModel.keranjang.observe(viewLifecycleOwner, Observer { daftarKomik ->
            // 3. Update UI setiap kali data berubah
            if (daftarKomik.isNullOrEmpty()) {
                tvDaftarPesanan.text = "Keranjang masih kosong"
            } else {
                // Ubah list [Komik, Komik] menjadi "Judul 1\nJudul 2"
                val daftarJudul = daftarKomik.map { it.judul }
                tvDaftarPesanan.text = daftarJudul.joinToString("\n")
            }
        })
    }
}