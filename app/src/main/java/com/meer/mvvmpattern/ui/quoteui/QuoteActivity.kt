package com.meer.mvvmpattern.ui.quoteui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.meer.mvvmpattern.R
import com.meer.mvvmpattern.data.Quote
import com.meer.mvvmpattern.injectutils.injector
import kotlinx.android.synthetic.main.activity_quote.*

class QuoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote)
        onInitilizeUI()
    }
    fun onInitilizeUI(){
        val factory=injector.provideQuoteViewModelFactory()
        val viewModel=ViewModelProviders.of(this,factory)
            .get(QuoteViewModel::class.java)

        viewModel.getQuote().observe(this, Observer {
            val bulider=StringBuffer()
            it.forEach {
                bulider.append("$it\n\n")
            }
            quote_tv.text=bulider.toString()
        })

        addQuotebtn.setOnClickListener {
            val quote =Quote(auther.text.toString(),quote_auther.text.toString())
            viewModel.addQuote(quote)
            auther.setText("")
            quote_auther.setText("")
        }
    }
}
