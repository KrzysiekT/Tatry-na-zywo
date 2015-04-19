package com.tarnawski.pogoda.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.tarnawski.pogoda.ParentFragment;
import com.tarnawski.pogoda.R;

public class Chocholowska extends ParentFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_chocholowska, container, false);
        ImageView chocholowskaView = (ImageView) rootView.findViewById(R.id.chocholowska);

        // Importing image url from configuration file
        // TODO: Move to XML config file
        String URL = getString(R.string.dolina_chocholowska);

        // Asserting downloaded image on view
        loadBitmap(URL, chocholowskaView);

        return rootView;
    }

}