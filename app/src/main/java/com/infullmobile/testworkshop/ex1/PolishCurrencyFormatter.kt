package com.infullmobile.testworkshop.ex1

import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols

class PolishCurrencyFormatter: CurrencyFormatter {

    override fun format(price: BigDecimal): String {
        return "${decimalFormat.format(price)}$CURRENCY"
    }

    private val decimalFormat: DecimalFormat
    get() = DecimalFormat().apply {
        decimalFormatSymbols = polishDecimalFormatSymbols
        maximumFractionDigits = DECIMAL_SPACES
        minimumFractionDigits = DECIMAL_SPACES
        isGroupingUsed = true
        isParseBigDecimal = true
    }

    private val polishDecimalFormatSymbols: DecimalFormatSymbols
    get() = DecimalFormatSymbols().apply {
        groupingSeparator = THOUSANDS_SEPARATOR
        monetaryDecimalSeparator = DECIMAL_SEPARATOR
    }

    companion object {
        const val THOUSANDS_SEPARATOR = ' '
        const val DECIMAL_SEPARATOR = ','
        const val DECIMAL_SPACES = 2
        const val CURRENCY = "zł"
    }
}
