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
        // Menghubungkan layout fragment_home.xml ke kelas Kotlin ini
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 1. Cari RecyclerView dari layout
        rvKomik = view.findViewById(R.id.rv_komik)

        // 2. Siapkan data komik (dummy)
        siapkanDataDummy()

        // 3. Buat adapter
        komikAdapter = KomikAdapter(listKomik)

        // 4. Atur RecyclerView
        rvKomik.layoutManager = LinearLayoutManager(context)
        rvKomik.adapter = komikAdapter
    }

    private fun siapkanDataDummy() {
        // Hapus list lama jika ada
        listKomik.clear()

        // Tambahkan data baru
        // GANTI "R.drawable.nama_gambar_kamu" SESUAI NAMA FILE GAMBARMU
        listKomik.add(
            Komik(
                1,
                "One Piece",
                "Serial manga dan anime Jepang yang menceritakan petualangan Monkey D. Luffy dan kru kapalnya, Bajak Laut Topi Jerami, dalam mencari harta karun legendaris \"One Piece\" untuk menjadi Raja Bajak Laut berikutnya",
                R.drawable.komik_onepiece
            )
        )

        listKomik.add(
            Komik(
                2,
                "Blue Lock",
                "Seri manga dan anime bertema sepak bola tentang program pelatihan ekstrem yang dirancang untuk menciptakan striker terhebat di dunia. Setelah Jepang kalah di Piala Dunia, Federasi Sepak Bola Jepang meluncurkan proyek “Blue Lock” di mana 300 striker muda harus bersaing dalam tantangan brutal untuk menjadi yang terbaik; satu-satunya yang gagal akan dilarang selamanya bermain untuk tim nasional. ",
                R.drawable.komik_bluelock // GANTI INI
            )
        )

        listKomik.add(
            Komik(
                3,
                "Kagurabachi",
                "Seri manga shōnen Jepang yang ditulis dan diilustrasikan oleh Takeru Hokazono, yang bercerita tentang Chihiro Rokuhira dalam misinya untuk membalas dendam atas pembunuhan ayahnya. Cerita ini berpusat pada penggunaan pedang magis unik Enten oleh Chihiro dan upayanya untuk merebut kembali Enam Pedang Ajaib lainnya yang dicuri oleh para penyihir jahat.",
                R.drawable.komik_kagurabachi
            )
        )
    }
}