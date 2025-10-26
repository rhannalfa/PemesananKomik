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
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val logoutButton: Button = view.findViewById(R.id.btn_keluar)

        logoutButton.setOnClickListener {
            val intent = Intent(activity, AuthActivity::class.java)
            startActivity(intent)

            activity?.finish()
        }

        return view
    }
}