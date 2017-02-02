package com.infullmobile.testworkshop.ex2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

/* How do I test framework specific things? */
/* If I write anything in my unit tests is it okay? */
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    private MainActivity mainActivity;

    @Before
    public void setUp() {
        mainActivity = Robolectric.setupActivity(MainActivity.class);
    }

    //FIXME What's wrong with this test?
    @Test
    public void shouldShowPrice() {
        // when
        mainActivity.showPrice(new BigDecimal("10.00"));

        // then
        assertThat(mainActivity.getPriceView().getText().toString()).isEqualTo("10.00zł");
    }
}