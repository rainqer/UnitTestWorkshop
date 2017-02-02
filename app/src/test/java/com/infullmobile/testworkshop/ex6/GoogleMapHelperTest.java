package com.infullmobile.testworkshop.ex6;

import com.google.android.gms.maps.SupportMapFragment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.mockito.Mockito.mock;

@RunWith(RobolectricTestRunner.class)
public class GoogleMapHelperTest {

    @Test
    public void should() {
        GoogleMapHelper helper = new GoogleMapHelper();
        SupportMapFragment fragment = mock(SupportMapFragment.class);
//        mock(GoogleMap.class);
//        helper.setMapFragment(fragment);
    }
}