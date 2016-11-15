package com.pavlosnicolaou.bootcamplocator.model;

/**
 * Created by Pavlos Nicolaou on 15/11/2016.
 */

public class Devslopes {

    public String getLocationImrUrl() {
        return locationImrUrl;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public String getLocationTitle() {
        return locationTitle;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    private float longitude;
    private float latitude;
    private String locationTitle;
    private String locationAddress;
    private String locationImrUrl;

    public Devslopes(float latitude, float longitude, String locationTitle, String locationAddress, String locationImrUrl) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.locationTitle = locationTitle;
        this.locationAddress = locationAddress;
        this.locationImrUrl = locationImrUrl;
    }
}
