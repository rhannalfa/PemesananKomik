package com.example.pemesanankomik

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CartViewModel : ViewModel() {

    // _keranjang: Data internal yang bisa diubah (Mutable)
    private val _keranjang = MutableLiveData<MutableList<Komik>>(mutableListOf())

    // keranjang: Data eksternal yang hanya bisa dibaca (Immutable)
    val keranjang: LiveData<MutableList<Komik>>
        get() = _keranjang

    // Fungsi untuk menambah komik ke keranjang
    fun tambahKeKeranjang(komik: Komik) {
        val listSekarang = _keranjang.value
        listSekarang?.add(komik)

        // Kirim update ke semua yang "mendengarkan"
        _keranjang.value = listSekarang
    }

    // Nanti kamu bisa tambahkan fungsi hapusDariKeranjang(), etc.
}