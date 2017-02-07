package com.infullmobile.testworkshop.ex5

import java.math.BigDecimal

data class Item(
        val id: Long,
        var quantity: Int,
        val product: Product) {

    val itemOnlinePrice: BigDecimal
        get() {
            return product.onlinePrice.multiply(BigDecimal(quantity))
        }

    val retailerPrice: BigDecimal
        get() = product.retailerPrice
}