package com.example.dylan.dungeonsanddragonsmanager;

import android.app.Activity;
import android.os.Bundle;

import android.content.Context;
import android.content.Intent;

import android.widget.Button;
import android.widget.TextView;

import android.view.View;
import android.view.View.OnClickListener;

import org.w3c.dom.Text;


/**
 * Created by Dylan on 2015-10-25.
 */
public class welcome extends Activity {

    final Context context = this;

    private TextView manager;

    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        manager = (TextView) findViewById((R.id.ddManager));
        startButton = (Button) findViewById((R.id.startButton));

        startButton.setOnClickListener(new startButtonListener());
    }
    private class startButtonListener implements OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(context, newOrExisting.class);
            startActivity(intent);
        }
    };
}
