package com.tarnawski.pogoda.Interfaces;

import android.widget.ImageView;

public interface loadBitmapInterface {

    public void loadBitmap(String imageURL, ImageView imageView);

    // there should be simple caching function - for ex. downloading image only once a minute
    // public void cacheBitmap(String imageURL, ImageView imageView, Timestamp timestamp)

}
