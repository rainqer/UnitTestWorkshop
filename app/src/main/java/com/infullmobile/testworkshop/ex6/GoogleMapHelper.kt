package com.infullmobile.testworkshop.ex6

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

open class GoogleMapHelper {

    private lateinit var mapFragment: SupportMapFragment
    private lateinit var googleMap: GoogleMap

    open var isMapToolbarEnabled: Boolean
        get() = googleMap.uiSettings.isMapToolbarEnabled
        set(value) {
            googleMap.uiSettings.isMapToolbarEnabled = value
        }

    open fun setMapFragment(mapFragment: SupportMapFragment) {
        this.mapFragment = mapFragment
    }

    open fun getMapAsync(function: () -> Unit) {
        this.mapFragment.getMapAsync { map ->
            googleMap = map
            function.invoke()
        }
    }

    open fun setOnMarkerClickListener(function: (Marker) -> Boolean) {
        googleMap.setOnMarkerClickListener { selectedMarker -> function.invoke(selectedMarker) }
    }

    open fun addMarker(markerOptions: MarkerOptions, position: Int): Marker {
        val marker = googleMap.addMarker(markerOptions)
        marker.tag = position
        return marker
    }

    open fun animateCamera(toBounds: LatLngBounds, width: Int, height: Int, boundsPadding: Int) {
        googleMap.animateCamera(CameraUpdateFactory.newLatLngBounds(toBounds, width, height, boundsPadding))
    }

    open fun centerOnPosition(position: LatLng) {
        googleMap.animateCamera(CameraUpdateFactory.newLatLng(position))
    }

    open fun animateCamera(toBounds: LatLng) {
        googleMap.animateCamera(CameraUpdateFactory.newLatLng(toBounds))
    }
}