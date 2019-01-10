package com.example.asif.projectj;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivityDemo extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_demo);
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

        String lat=getIntent().getExtras().getString("Lat");
        String lang=getIntent().getExtras().getString("Lang");
        String title=getIntent().getExtras().getString("Title");


        // Add a marker in Sydney and move the camera
        LatLng ulipurMs = new LatLng(Double.parseDouble(lat), Double.parseDouble(lang));
        mMap.addMarker(new MarkerOptions().position(ulipurMs).title(title)).showInfoWindow();
       // mMap.moveCamera(CameraUpdateFactory.newLatLng(ulipurMs));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(new LatLng(Double.parseDouble(lat),Double.parseDouble(lang)) , 11.0f) );

        mMap.getUiSettings().setZoomControlsEnabled(true);

//        25.660717,89.619665



    }
}
