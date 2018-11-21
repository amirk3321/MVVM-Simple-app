package com.meer.mvvmpattern.injectutils

import com.meer.mvvmpattern.data.FakeQuoteDao
import com.meer.mvvmpattern.data.QuoteRepository
import com.meer.mvvmpattern.ui.quoteui.QuoteViewModelFactory

object injector {
    fun provideQuoteViewModelFactory(): QuoteViewModelFactory{
        val quoteRepository=QuoteRepository(FakeQuoteDao())
        return QuoteViewModelFactory(quoteRepository)
    }
}