package com.example.pemesanankomik

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    private lateinit var rvKomik: RecyclerView
    private lateinit var komikAdapter: KomikAdapter
    private var listKomik = mutableListOf<Komik>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvKomik = view.findViewById(R.id.rv_komik)

        siapkanDataDariResource()

        komikAdapter = KomikAdapter(listKomik)

        rvKomik.layoutManager = LinearLayoutManager(context)
        rvKomik.adapter = komikAdapter
    }

    private fun siapkanDataDariResource() {
        listKomik.clear()

        val dataJudul = resources.getStringArray(R.array.data_komik_judul)
        val dataDeskripsi = resources.getStringArray(R.array.data_komik_deskripsi)
        val dataGambar = resources.obtainTypedArray(R.array.data_komik_gambar)

        for (i in dataJudul.indices) {
            val komik = Komik(
                id = i,
                judul = dataJudul[i],
                deskripsi = dataDeskripsi[i],
                gambarResId = dataGambar.getResourceId(i, -1)
            )
            listKomik.add(komik)
        }

        dataGambar.recycle()
    }

}