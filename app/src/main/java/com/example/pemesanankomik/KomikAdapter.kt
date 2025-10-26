package com.example.pemesanankomik

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider

class KomikAdapter(private val listKomik: List<Komik>) :
    RecyclerView.Adapter<KomikAdapter.ViewHolder>() {

    // 1. ViewHolder: Menampung view dari item_komik.xml
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgKomik: ImageView = view.findViewById(R.id.img_komik)
        val tvJudul: TextView = view.findViewById(R.id.tv_judul_komik)
        val tvDeskripsi: TextView = view.findViewById(R.id.tv_deskripsi_komik)
    }

    // 2. onCreateViewHolder: Menghubungkan layout item_komik.xml
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_komik, parent, false)
        return ViewHolder(view)
    }

    // 3. getItemCount: Memberi tahu ada berapa total item di list
    override fun getItemCount(): Int {
        return listKomik.size
    }

    // 4. onBindViewHolder: Mengisi data (judul, deskripsi, gambar) ke dalam view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val komik = listKomik[position]

        holder.tvJudul.text = komik.judul
        holder.tvDeskripsi.text = komik.deskripsi
        holder.imgKomik.setImageResource(komik.gambarResId)

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context

            if (context is ComponentActivity) {

                val viewModel = ViewModelProvider(context).get(CartViewModel::class.java)

                viewModel.tambahKeKeranjang(komik)

                Toast.makeText(context, "${komik.judul} ditambahkan", Toast.LENGTH_SHORT).show()

                if (context is HomeActivity) {
                    val bottomNavView: com.google.android.material.bottomnavigation.BottomNavigationView =
                        context.findViewById(R.id.bottom_nav_view)
                    bottomNavView.selectedItemId = R.id.nav_order
                }
            }
        }
    }
}