package com.infullmobile.testworkshop.ex4

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import butterknife.bindView
import com.infullmobile.testworkshop.R

class MainActivity : AppCompatActivity() {

    val priceView: TextView by bindView(R.id.priceView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showPrice() {
        MagicService.fetchPrice().subscribe { price ->
            priceView.text = price
        }
    }

    companion object {
        fun getIntent(context: Context, value: Int): Intent {
            return Intent(context, MainActivity::class.java).putExtra(DATA, value)
        }
        const val DATA = "data"
    }
}
