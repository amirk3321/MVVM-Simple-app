package com.meer.mvvmpattern.data

data class Quote(val auther :String, val quoteAuth : String) {
    override fun toString(): String {
        return "$auther - $quoteAuth"
    }
}