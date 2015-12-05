package com.dungeonsanddragonsmanager;

import android.app.Activity;
import android.os.Bundle;

import android.content.Context;
import android.content.Intent;

import android.widget.Button;
import android.widget.TextView;

import android.view.View;
import android.view.View.OnClickListener;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 * Created by Dylan on 2015-10-25.
 */
public class newOrExisting extends Activity {

    final Context context = this;

    private Button newPlayer, existingPlayer;
    String[] stat = new String[6];
    String[] character = new String[3];
    String[] myCharacter = {"", "", ""};

    FileInputStream fis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);

        newPlayer = (Button) findViewById((R.id.newPlayer));
        existingPlayer = (Button) findViewById((R.id.existingPlayer));

        newPlayer.setOnClickListener(new newPlayerButtonListener());
        existingPlayer.setOnClickListener(new existingPlayerButtonListener());

    }
    private class newPlayerButtonListener implements OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(context, chooseRace.class);
            intent.putExtra("myCharacter", myCharacter);
            startActivity(intent);
        }
    };

    private class existingPlayerButtonListener implements OnClickListener {
        StringBuffer inputBuffer = new StringBuffer("");
        public void onClick(View v) {
            try {
                fis = openFileInput(finalizeCharacter.SAVE);
                BufferedReader bf = new BufferedReader(new InputStreamReader(fis));
                String readString = bf.readLine();
                while (readString != null){
                    inputBuffer.append(readString);
                    readString = bf.readLine();
                }
                fis.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            getArrays(inputBuffer.toString());
            Intent intent = new Intent(context, finalizeCharacter.class);
            intent.putExtra("myCharacter", character);
            intent.putExtra("selectedStats", stat);
            startActivity(intent);
        }
    }

    private void getArrays(String read){
        String[] split = read.split(",");
        for (int i = 0; i <3; i++)
            character[i] = split[i];
        for (int j = 3; j < split.length; j++)
            stat[j-3] = split[j];
    }
}
