package com.infullmobile.testworkshop.ex4;

import com.infullmobile.testworkshop.ex4.MainActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.assertj.core.api.Assertions.assertThat;

/* How do I test something asynchronous */
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    private MainActivity mainActivity;

    @Before
    public void setUp() {
        mainActivity = Robolectric.setupActivity(MainActivity.class);
    }

    //FIXME is this the only class we should test
    @Test
    public void shouldShowPrice() {
        // when
        mainActivity.showPrice();

        //TODO this is empty because the service method returns 5 seconds later
        // then
//        assertThat(mainActivity.getPriceView().getText().toString()).isNotEmpty();
    }
}