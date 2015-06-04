package com.tarnawski.pogoda;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ImportImage extends AsyncTask<String, Void, Bitmap> {

    private final WeakReference<ImageView> imageViewReference;
    private InputStream Stream = null;

    public ImportImage(ImageView imageView) {
        // Use a WeakReference to ensure the ImageView can be garbage collected
        imageViewReference = new WeakReference<ImageView>(imageView);
    }

    @Override
    // TODO: here I should add caching image logic
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Bitmap doInBackground(String... params) {

        try {
            URL myURL = new URL(params[0]);
            try {
                URLConnection conn = myURL.openConnection();
                try {

                    Stream = conn.getInputStream();
                    Bitmap downloadedImage = BitmapFactory.decodeStream(new JPGClosedInputStream(Stream));

                    if (downloadedImage != null) {
                        return downloadedImage;
                    } else {
                        throw new IOException("Failed to decode input stream - corrupted image at server");
                    }

                } catch (IOException e) {
                    throw new IOException("Failed to get input stream");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Once complete, see if ImageView is still around and set bitmap.
    @Override
    protected void onPostExecute(Bitmap bitmap) {
        if (bitmap != null) {
            final ImageView imageView = imageViewReference.get();
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

}