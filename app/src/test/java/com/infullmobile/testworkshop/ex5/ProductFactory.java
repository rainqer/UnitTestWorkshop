package com.infullmobile.testworkshop.ex5;

import java.math.BigDecimal;


public final class ProductFactory {

    private ProductFactory() {
        throw new IllegalStateException("No instances.");
    }

    public static Product productWithDiscountPrice() {
        return new Product(1L, "productA", new BigDecimal(2), new BigDecimal(3), new BigDecimal(4));
    }

    public static Product productWithoutDiscountPrice() {
        return new Product(1L, "productA", new BigDecimal(5), new BigDecimal(-1), new BigDecimal(6));
    }
}
