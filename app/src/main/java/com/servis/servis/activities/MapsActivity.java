package com.servis.servis.activities;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.servis.servis.R;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng javier = new LatLng(37.3595301, -5.9884502);
        mMap.addMarker(new MarkerOptions().position(javier).title("Clases de Android Studio"));
        LatLng antonio = new LatLng(37.382413, -5.9986786);
        mMap.addMarker(new MarkerOptions().position(antonio).title("Clases Particulares"));
        LatLng jesus = new LatLng(37.3818467, -6.018506);
        mMap.addMarker(new MarkerOptions().position(jesus).title("Limpieza"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(javier));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(12));
    }
}
