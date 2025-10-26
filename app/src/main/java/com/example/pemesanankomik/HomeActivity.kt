package com.example.pemesanankomik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // 1. Cari BottomNavigationView dari layout
        val bottomNavView: BottomNavigationView = findViewById(R.id.bottom_nav_view)

        // 2. Cari "jendela" NavHostFragment
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        // 3. Dapatkan NavController (pengatur navigasi)
        val navController = navHostFragment.navController

        // 4. Sambungkan tombol navigasi dengan pengatur navigasi
        bottomNavView.setupWithNavController(navController)
    }
}