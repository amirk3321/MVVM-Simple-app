package com.meer.mvvmpattern.data

class QuoteRepository(private val quoteDao: FakeQuoteDao) {

    companion object {
        @Volatile private var  instence:QuoteRepository?=null

        fun getInstence(quoteDao: FakeQuoteDao) =
                instence?: synchronized(this){
                    instence?:QuoteRepository(quoteDao).also { instence =it }
                }
    }
    fun getQuote()=quoteDao.getQuotes()
    fun addQuote(quote: Quote) {
        quoteDao.addQuotes(quote)
    }
}