package com.infullmobile.testworkshop.ex1

import java.math.BigDecimal

interface CurrencyFormatter {
    fun format(price: BigDecimal): String
}
