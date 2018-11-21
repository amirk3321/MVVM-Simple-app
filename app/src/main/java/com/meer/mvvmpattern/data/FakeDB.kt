package com.meer.mvvmpattern.data

class FakeDB private constructor(){
    val quoteDao=FakeQuoteDao()

    companion object {
        @Volatile private var instence : FakeDB?=null
        fun getInstence() =
            instence ?: synchronized(this){
                instence?:FakeDB().also { instence = it }
            }

    }
}