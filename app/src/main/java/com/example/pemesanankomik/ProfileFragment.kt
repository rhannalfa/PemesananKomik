package com.example.pemesanankomik

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate layout-nya
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        // Cari tombol Keluar di dalam view
        val logoutButton: Button = view.findViewById(R.id.btn_keluar)

        logoutButton.setOnClickListener {
            // Kembali ke halaman Auth (pilihan login/register)
            val intent = Intent(activity, AuthActivity::class.java)
            startActivity(intent)

            // Hapus HomeActivity dari tumpukan
            activity?.finish()
        }

        return view
    }
}