package com.meer.mvvmpattern.ui.quoteui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.meer.mvvmpattern.data.QuoteRepository

class QuoteViewModelFactory(private val quoteRepository: QuoteRepository)
    : ViewModelProvider.NewInstanceFactory(){
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuoteViewModel(quoteRepository) as T
    }
}