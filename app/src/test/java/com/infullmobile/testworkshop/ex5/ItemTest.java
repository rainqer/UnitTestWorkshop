package com.infullmobile.testworkshop.ex5;

import android.support.annotation.NonNull;

import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

/* Someone wrote these tests and they break all the time, can I just remove them ? */
public class ItemTest {

    @Test
    public void shouldReturnOriginalMultipliedByQuantityPriceIfDiscountPriceUnavailable() {
        // given
        final Product product = ProductFactory.productWithoutDiscountPrice();
        final int quantity = 2;
        final Item item = getItem(product, quantity);
        final BigDecimal expectedPrice = product.getOriginalTonsPrice().multiply(new BigDecimal(quantity));

        // when
        BigDecimal onlinePrice = item.getItemOnlinePrice();

        // then
        assertThat(onlinePrice).isEqualTo(expectedPrice);
    }

    @Test
    public void shouldReturnDiscountMultipliedByQuantityPriceIfDiscountPriceAvailable() {
        // given
        final Product product = ProductFactory.productWithDiscountPrice();
        final int quantity = 3;
        final Item item = getItem(product, quantity);
        final BigDecimal expectedPrice = product.getDiscountTonsPrice().multiply(new BigDecimal(quantity));

        // when
        BigDecimal onlinePrice = item.getItemOnlinePrice();

        // then
        assertThat(onlinePrice).isEqualTo(expectedPrice);
    }

    @NonNull
    private Item getItem(final Product product, final int quantity) {
        return new Item(1L, quantity, product);
    }
}