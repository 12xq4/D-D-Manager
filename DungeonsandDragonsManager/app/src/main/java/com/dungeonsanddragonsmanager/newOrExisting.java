package com.dungeonsanddragonsmanager;

import android.app.Activity;
import android.os.Bundle;

import android.content.Context;
import android.content.Intent;

import android.widget.Button;
import android.widget.TextView;

import android.view.View;
import android.view.View.OnClickListener;



/**
 * Created by Dylan on 2015-10-25.
 */
public class newOrExisting extends Activity {

    final Context context = this;

    private Button newPlayer, existingPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);

        newPlayer = (Button) findViewById((R.id.newPlayer));
        existingPlayer = (Button) findViewById((R.id.existingPlayer));

        newPlayer.setOnClickListener(new newPlayerButtonListener());
    }
    private class newPlayerButtonListener implements OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(context, chooseRace.class);
            startActivity(intent);
        }
    };
}
