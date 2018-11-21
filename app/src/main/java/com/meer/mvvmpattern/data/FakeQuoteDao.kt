package com.meer.mvvmpattern.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeQuoteDao {
    val quotelist= mutableListOf<Quote>()
    val quotelive=MutableLiveData<List<Quote>>()
    init {
        quotelive.value=quotelist
    }
    fun getQuotes() = quotelive as LiveData<List<Quote>>
    fun addQuotes(quote: Quote){
        quotelist.add(quote)
        quotelive.value=quotelist
    }
}