package com.pavlosnicolaou.bootcamplocator;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.pavlosnicolaou.bootcamplocator.fragments.MainFragment;

public class MapsActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        MainFragment mainFragment = (MainFragment)getSupportFragmentManager().findFragmentById(R.id.container_main);

        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance();
            getSupportFragmentManager()
                    .beginTransaction().
                    add(R.id.container_main, mainFragment)
                    .commit();
        }

    }
}
