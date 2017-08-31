package com.example.sravanthy.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sandeep on 11/22/2016.
 */
public class RestaurantFragment extends BaseActivityWithDrawer {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater.from(this).inflate(R.layout.restaurant_fragment, getFrame());
    }

    @Override
    public boolean shouldEnableDrawer() {
        return true;
    }
}

