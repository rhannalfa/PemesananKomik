package com.example.pemesanankomik

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CartViewModel : ViewModel() {

    private val _keranjang = MutableLiveData<MutableList<Komik>>(mutableListOf())

    val keranjang: LiveData<MutableList<Komik>>
        get() = _keranjang

    fun tambahKeKeranjang(komik: Komik) {
        val listSekarang = _keranjang.value
        listSekarang?.add(komik)

        _keranjang.value = listSekarang
    }

}