package com.infullmobile.testworkshop.ex1;

import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

/* How do we test? */
/* What do we test? */
/* When is it enough ? */
public class PolishCurrencyFormatterTest {

    private PolishCurrencyFormatter currencyFormatter = new PolishCurrencyFormatter();

    @Test
    public void shouldNotAddSpacesWhenPriceLowerThanThousand() {
        // test whether the formatter formats price bigger than 999 and adds spaces
        // example price: "136657"

        // given

        // when

        // then
    }

    @Test
    public void shouldAddSpacesWhenPriceHigherThanThousands() {
        // test whether the formatter formats price lower than 999
        // example price: "136"

        // given

        // when

        // then
    }

    @Test
    public void shouldSetTwoDecimalSpacesWhenPriceHasLessThanTwoDecimalSpaces() {
        // test whether the formatter always adds two decimal spaces
        // example price "1.0"

        // given

        // when

        // then
    }

    @Test
    public void shouldSetTwoDecimalSpacesWhenPriceHasMoreThanTwoDecimalSpaces() {
        // test whether the formatter always adds two decimal spaces
        // have we thought about everything ?
        // example price : "1.99898"

        // given

        // when

        // then
    }
}

//TODO Things to think about:
// How many bugs have we found in such small class?
//Have tested everything?
//FIXME What about values lower than 1?
//FIXME What about negative values?
