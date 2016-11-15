package com.pavlosnicolaou.bootcamplocator.services;

import com.pavlosnicolaou.bootcamplocator.model.Devslopes;

import java.util.ArrayList;

/**
 * Created by pn94 on 15/11/2016.
 */
public class DataService {
    private static DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {

    }

    public ArrayList<Devslopes> getBootcampLocationsWithin10MilesOfZip(int zip) {

        //pretending we are downloading data from the server
        ArrayList<Devslopes> list = new ArrayList<>();

        list.add(new Devslopes(51.298f, 1.070f, "University of Kent", "Canterbury CT2 7NZ, UK", "slo"));
        list.add(new Devslopes(51.298f, 1.072f, "Darwin College", "Canterbury CT2, UK", "slo"));
        list.add(new Devslopes(51.299f, 1.070f, "Cornwallis North East", "Canterbury CT2, UK", "slo"));

        return list;

    }
}
