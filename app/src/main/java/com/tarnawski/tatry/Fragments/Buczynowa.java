package com.tarnawski.tatry.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.tarnawski.tatry.ParentFragment;
import com.tarnawski.tatry.R;

public class Buczynowa extends ParentFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_buczynowa, container, false);
        ImageView buczynowaView = (ImageView) rootView.findViewById(R.id.buczynowa);

        // Importing image url from configuration file
        String URL = getString(R.string.buczynowa);

        // Asserting downloaded image on view
        loadBitmap(URL, buczynowaView);

        return rootView;
    }

}