package com.tarnawski.pogoda.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.tarnawski.pogoda.ParentFragment;
import com.tarnawski.pogoda.R;

public class PrzedniStaw extends ParentFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_przedni_staw, container, false);
        ImageView przedniStawView = (ImageView) rootView.findViewById(R.id.przedni_staw);

        // Importing image url from configuration file
        String URL = getString(R.string.przedni_staw);

        // Asserting downloaded image on view
        loadBitmap(URL, przedniStawView);

        return rootView;
    }

}