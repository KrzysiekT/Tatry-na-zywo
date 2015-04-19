package com.tarnawski.pogoda;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.tarnawski.pogoda.Fragments.Chocholowska;
import com.tarnawski.pogoda.Fragments.Gasienicowa;
import com.tarnawski.pogoda.Fragments.Kasprowy;
import com.tarnawski.pogoda.Fragments.MorskieOko;
import com.tarnawski.pogoda.Fragments.Rysy;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fragment) {
        super(fragment);
    }

    @Override
    public Fragment getItem(int index){

        switch(index){
            case 0:
                return new Rysy();
            case 1:
                return new MorskieOko();
            case 2:
                return new Kasprowy();
            case 3:
                return new Gasienicowa();
            case 4:
                return new Chocholowska();
        }

        return null;
    }

    @Override
    public int getCount(){
        // Five items - Rysy, Morskie Oko, Kasprowy Wierch, Dolina Gasienicowa, Dolina Chocholowska
        return 5;
    }

}
