package com.tarnawski.pogoda.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.tarnawski.pogoda.ParentFragment;
import com.tarnawski.pogoda.R;

public class MorskieOko extends ParentFragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_morskie_oko, container, false);
        ImageView okoView = (ImageView) rootView.findViewById(R.id.morskie_oko);

        // Importing image url from configuration file
        String URL = getString(R.string.morskie_oko);

        // Asserting downloaded image on view
        loadBitmap(URL, okoView);

        return rootView;
    }

}