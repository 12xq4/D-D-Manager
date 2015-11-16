package com.example.dylan.dungeonsanddragonsmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


/**
 * Created by Dylan on 2015-10-25.
 */
public class finalizeCharacter extends Activity {

    final Context context = this;

    String[] myCharacter = new String[3];
    String[] chosenStats = new String[6];

    String raceName, className, backName;
    String attString;

    TextView yourCharacter;
    TextView chosenClass, chosenRace, chosenBackground;
    TextView attributes;

    ImageView raceImage, classImage, backImage;

    ArrayList<Skills> skillset;
    ArrayList<String> language;
    ArrayList<String> equipment;

    Stat playerStat;
    Race playerRace;
    Role playerRole;
    Background playerBackground;

    Button play;

    ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finalize_character);

        Intent preIntent = getIntent();
        Bundle bundle = preIntent.getExtras();

        myCharacter = (String[]) bundle.get("myCharacter");
        chosenStats = (String[]) bundle.get("selectedStats");

        yourCharacter = (TextView) findViewById(R.id.yourCharacter);

        attributes = (TextView) findViewById(R.id.attributes);
        attString = "Attributes: \n" +
                 "\n              Strength: " + chosenStats[0] +
                 "                          Constitution: " + chosenStats[1]
                 + "\n             Dexterity: " + chosenStats[2] +
                 "                            Intelligence: " + chosenStats[3]
                + "\n            Charisma: " + chosenStats[4] +
                 "                                 Wisdom: " + chosenStats[5];
        attributes.setText(attString);

        chosenRace = (TextView) findViewById(R.id.myRace);
        chosenRace.setText("Race: " + myCharacter[0]);

        chosenClass = (TextView) findViewById(R.id.myClass);
        chosenClass.setText("Class: " + myCharacter[1]);

        chosenBackground = (TextView) findViewById(R.id.myBackground);
        chosenBackground.setText("Background: " + myCharacter[2]);

        raceImage = (ImageView) findViewById(R.id.raceImage);
        raceImage.setImageResource(R.drawable.dwarf);
        /*else if (raceName.equals("elf") )
            raceImage.setImageResource(R.drawable.elf);
        if ( raceName.equals("halfling") )
            raceImage.setImageResource(R.drawable.halfling);
        else if (raceName.equals("human") )
            raceImage.setImageResource(R.drawable.human); */
        classImage = (ImageView) findViewById(R.id.classImage);
        classImage.setImageResource(R.drawable.barbarian);
        backImage = (ImageView) findViewById(R.id.backImage);
        backImage.setImageResource(R.drawable.acolyte);

        /*stat1 = (TextView) findViewById(R.id.stat1);
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
        stat6.setText(chosenStats[5]);*/

        playerStat = new Stat(Integer.parseInt(chosenStats[0]), Integer.parseInt(chosenStats[1]), Integer.parseInt(chosenStats[2]),
                Integer.parseInt(chosenStats[3]), Integer.parseInt(chosenStats[4]), Integer.parseInt(chosenStats[5]));

        /*if (myCharacter[0].equals("Dwarf")) {
            playerRace = new Dwarf(playerStat);
            //String stringSkills = "Race: " + myCharacter[0] + "\n";

            //skillset = playerRace.skillset;
            //for (int x = 0; x < skillset.size(); x++) {
            //    stringSkills = stringSkills + skillset.get(x) + "\n";
            //}
            chosenRace.setText("Race: " + myCharacter[0] + "\n");
        }*/
        //if (chosenClass.equals("Barbarian"))
        //    playerRole = new Barbarian(playerStat);

        //if (chosenBackground.equals("Acolyte"))
        //    playerBackground = new Acolyte();

        play = (Button) findViewById(R.id.goPlay);
        //play.setOnClickListener(new proceedButtonListener());

        progress = (ProgressBar) findViewById(R.id.progressBar);
        progress.setProgress(100);

        //test = playerRace.language;
        //String language1 = playerRace.language.get(0);

    }

    /*private class proceedButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(context, chooseStats.class);
            startActivity(intent);
        }
    };*/


}
