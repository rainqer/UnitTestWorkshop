package com.infullmobile.testworkshop.ex6;

import android.app.Activity;
import android.content.Intent;

import com.infullmobile.testworkshop.ex4.MainActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricTestRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doNothing;

@RunWith(RobolectricTestRunner.class)
public class ActivityNavigationTest {

    @Mock Activity activity;
//    @Captor ArgumentCaptor<Intent> intentArgumentCaptor;
    private ActivityNavigation activityNavigation;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        activityNavigation = new ActivityNavigation(activity);
    }

    @Test
    public void shouldStartNewScreenWithPassedValue() {
        // given
        final int valueToPass = 5;

        // when
        activityNavigation.mainScreen(valueToPass).start();

        // then
        // I wanna check if the value is passed to the main screen
    }
}
