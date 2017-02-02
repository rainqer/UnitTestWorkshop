package com.infullmobile.testworkshop.ex5;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderTest {

    @Test
    public void shouldCalculateSubTotalOfAllItemsInOrder() {
        // given
        final int quantityA = 2;
        final Product productA = ProductFactory.productWithDiscountPrice();
        Item itemA = new Item(1L, quantityA, productA);

        final int quantityB = 3;
        final Product productB = ProductFactory.productWithoutDiscountPrice();
        Item itemB = new Item(1L, quantityB, productB);

        BigDecimal expectedSubtotal
                = productA.getDiscountTonsPrice().multiply(new BigDecimal(quantityA))
                .add(productB.getOriginalTonsPrice().multiply(new BigDecimal(quantityB)));
        Order order = new Order(Arrays.asList(itemA, itemB));

        // when
        BigDecimal subTotal = order.getSubTotalPrice();

        // then
        assertThat(subTotal).isEqualTo(expectedSubtotal);
    }
}