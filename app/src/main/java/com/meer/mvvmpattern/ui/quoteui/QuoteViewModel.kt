package com.meer.mvvmpattern.ui.quoteui

import androidx.lifecycle.ViewModel
import com.meer.mvvmpattern.data.Quote
import com.meer.mvvmpattern.data.QuoteRepository

class QuoteViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel(){
    fun getQuote() = quoteRepository.getQuote()
    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}