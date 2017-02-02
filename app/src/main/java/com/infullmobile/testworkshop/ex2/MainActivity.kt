package com.infullmobile.testworkshop.ex2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import butterknife.bindView

import com.infullmobile.testworkshop.R
import com.infullmobile.testworkshop.ex1.PolishCurrencyFormatter
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {

    val priceView: TextView by bindView(R.id.priceView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showPrice(price: BigDecimal) {
        priceView.text = PolishCurrencyFormatter().format(price)
    }
}
