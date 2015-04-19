package com.tarnawski.pogoda.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.tarnawski.pogoda.ParentFragment;
import com.tarnawski.pogoda.R;

public class Kasprowy extends ParentFragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_kasprowy, container, false);
        ImageView kasprowyView = (ImageView) rootView.findViewById(R.id.kasprowy);

        // Importing image url from configuration file
        String URL = getString(R.string.kasprowy_wierch);

        // Asserting downloaded image on view
        loadBitmap(URL, kasprowyView);

        return rootView;
    }

}