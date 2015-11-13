package com.example.dylan.dungeonsanddragonsmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * Created by Dylan on 2015-10-25.
 */
public class finalizeCharacter extends Activity {

    final Context context = this;

    String[] myCharacter = new String[3];
    String[] chosenStats = new String[6];

    TextView yourCharacter;
    TextView chosenClass, chosenRace, chosenBackground;
    TextView stat1, stat2, stat3, stat4, stat5, stat6;

    Stat playerStat;
    Race playerRace;
    Role playerRole;
    Background playerBackground;

    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finalize_character);

        Intent preIntent = getIntent();
        Bundle bundle = preIntent.getExtras();

        myCharacter = (String[]) bundle.get("myCharacter");
        chosenStats = (String[]) bundle.get("selectedStats");

        chosenClass = (TextView) findViewById(R.id.chosenClass);
        chosenClass.setText(myCharacter[1]);

        chosenRace = (TextView) findViewById(R.id.chosenRace);
        chosenRace.setText(myCharacter[0]);

        chosenBackground = (TextView) findViewById(R.id.chosenBackground);
        chosenBackground.setText(myCharacter[2]);

        yourCharacter = (TextView) findViewById(R.id.yourCharacter);

        stat1 = (TextView) findViewById(R.id.stat1);
        stat1.setText(chosenStats[0]);

        stat2 = (TextView) findViewById(R.id.stat2);
        stat2.setText(chosenStats[1]);

        stat3 = (TextView) findViewById(R.id.stat3);
        stat3.setText(chosenStats[2]);

        stat4 = (TextView) findViewById(R.id.stat4);
        stat4.setText(chosenStats[3]);

        stat5 = (TextView) findViewById(R.id.stat5);
        stat5.setText(chosenStats[4]);

        stat6 = (TextView) findViewById(R.id.stat6);
        stat6.setText(chosenStats[5]);

        playerStat = new Stat(Integer.parseInt(chosenStats[0]),Integer.parseInt(chosenStats[1]),Integer.parseInt(chosenStats[2]),
                Integer.parseInt(chosenStats[3]),Integer.parseInt(chosenStats[4]),Integer.parseInt(chosenStats[5]));

        if (chosenRace.equals("Dwarf"))
            playerRace = new Dwarf(playerStat);

        if (chosenClass.equals("Barbarian"))
            playerRole = new Barbarian(playerStat);

        if (chosenBackground.equals("Acolyte"))
            playerBackground = new Acolyte();

        play = (Button) findViewById(R.id.goPlay);
        //play.setOnClickListener(new proceedButtonListener());



    }

    /*private class proceedButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(context, chooseStats.class);
            startActivity(intent);
        }
    };*/


}
