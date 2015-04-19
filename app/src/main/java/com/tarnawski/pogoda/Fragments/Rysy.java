package com.tarnawski.pogoda.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.tarnawski.pogoda.ParentFragment;
import com.tarnawski.pogoda.R;

public class Rysy extends ParentFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_rysy, container, false);
        ImageView rysyView = (ImageView) rootView.findViewById(R.id.rysy);

        // preparing for assert temperature value at view
        // TextView rysy_temperature = (TextView) rootView.findViewById(R.id.rysy_temperature);
        // loadTemperature("http://www.test.tatrynet.pl/pogoda/weatherMiddleware_v1.0/xml/lokalizacje1.xml", rysy_temperature);

        // Importing image url from configuration file
        String URL = getString(R.string.rysy);

        // Asserting downloaded image on view
        loadBitmap(URL, rysyView);

        return rootView;
    }

    /** preparing parsing temperature function
    public void loadTemperature(String serviceURL, TextView textView){
        ParseTemperature task = new ParseTemperature(textView);
        task.execute(serviceURL);
    }
     */

}