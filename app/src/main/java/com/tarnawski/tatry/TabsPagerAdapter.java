package com.tarnawski.tatry;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.tarnawski.tatry.Fragments.Buczynowa;
import com.tarnawski.tatry.Fragments.Chocholowska;
import com.tarnawski.tatry.Fragments.Gasienicowa;
import com.tarnawski.tatry.Fragments.Kasprowy;
import com.tarnawski.tatry.Fragments.MorskieOko;
import com.tarnawski.tatry.Fragments.PrzedniStaw;
import com.tarnawski.tatry.Fragments.Rysy;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fragment) {
        super(fragment);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
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
            case 5:
                return new PrzedniStaw();
            case 6:
                return new Buczynowa();
        }

        return null;
    }

    @Override
    public int getCount() {
        // Seven items - Rysy, Morskie Oko, Kasprowy Wierch, Dolina Gasienicowa, Dolina Chocholowska, Przedni Staw Polski, Dolinka Buczynowa
        return 7;
    }

}
