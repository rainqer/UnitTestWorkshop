package com.infullmobile.testworkshop.ex5

import java.math.BigDecimal

data class Product(
        val id: Long,
        val name: String,
        val originalTonsPrice: BigDecimal,
        val discountTonsPrice: BigDecimal,
        val retailerPrice: BigDecimal) {

    val productOnlinePrice: BigDecimal
        get() = if (discountTonsPrice > BigDecimal.ZERO) discountTonsPrice else originalTonsPrice

}
