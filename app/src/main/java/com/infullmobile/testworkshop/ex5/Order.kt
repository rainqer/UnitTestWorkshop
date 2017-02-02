package com.infullmobile.testworkshop.ex5

import java.math.BigDecimal

class Order(private val items: List<Item>) {

    val subTotalPrice: BigDecimal
    get() = BigDecimal(items.sumByDouble { it.itemOnlinePrice.toDouble() })
}
