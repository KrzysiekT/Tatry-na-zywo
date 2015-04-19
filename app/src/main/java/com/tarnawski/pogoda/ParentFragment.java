package com.tarnawski.pogoda;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ImageView;

import com.tarnawski.pogoda.Interfaces.loadBitmapInterface;

public class ParentFragment extends android.support.v4.app.Fragment implements loadBitmapInterface {

    /**
     * Loading image bitmap from URL to destination view
     * @param imageURL URL with image to load
     * @param imageView View ready to show loaded image
     */
    @Override
    public void loadBitmap(String imageURL, ImageView imageView) {

        // Trying to fetch image from server
        ImportImage task = new ImportImage(imageView);
        // TODO: read about proper exception handling, and what about the log?

        try {
            task.execute(imageURL);
        } catch (Exception e){
            showError();
            e.printStackTrace();
        }
    }

    // TODO: refactor this crap!
    public void showError(){

        AlertDialog.Builder errorDialog = new AlertDialog.Builder(getActivity());

        errorDialog.setTitle(R.string.app_name);
        errorDialog.setMessage(R.string.server_error);

        errorDialog.setNegativeButton(R.string.close, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        errorDialog.show();

    }

}
