package com.example.rtc.somruethaianusa.animal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.preference.DialogPreference;

/**
 * Created by SmilecomputeR on 4/12/2559.
 */

public class MyAlertDialog {
    private AlertDialog.Builder objAlert;

    public void NoChooseEveryThing(Context context) {
        objAlert = new AlertDialog.Builder(context);
        objAlert.setIcon(R.drawable.mytrue);
        objAlert.setTitle("Please Choose Answer ?");
        objAlert.setMessage("Please Choose Answer on Radiobutton");
        objAlert.setCancelable(false);
        objAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onCilck(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        objAlert.show();
    }
}