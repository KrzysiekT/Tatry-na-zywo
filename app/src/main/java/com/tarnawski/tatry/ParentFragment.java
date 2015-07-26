package com.tarnawski.tatry;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ImageView;

import com.tarnawski.tatry.Interfaces.loadBitmapInterface;

public class ParentFragment extends android.support.v4.app.Fragment implements loadBitmapInterface {

    /**
     * Loading image bitmap from URL to destination view
     *
     * @param imageURL  URL with image to load
     * @param imageView View ready to show loaded image
     */
    @Override
    public void loadBitmap(String imageURL, ImageView imageView) {

        // Trying to fetch image from server
        ImportImage task = new ImportImage(imageView);
        task.execute(imageURL);

    }

    // TODO: refactor this crap!
    public void showError() {

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
