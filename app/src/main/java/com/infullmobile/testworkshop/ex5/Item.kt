package com.infullmobile.testworkshop.ex5

import java.math.BigDecimal

data class Item(
        val id: Long,
        var quantity: Int,
        val product: Product) {

    val itemOnlinePrice: BigDecimal
        get() {
            return if (product.discountTonsPrice > BigDecimal.ZERO)  {
                product.discountTonsPrice
            } else  {
                product.originalTonsPrice
            }.multiply(BigDecimal(quantity))
        }

    val retailerPrice: BigDecimal
        get() = product.retailerPrice
}