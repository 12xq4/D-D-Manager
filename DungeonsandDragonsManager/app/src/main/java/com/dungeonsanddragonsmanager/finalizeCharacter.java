package com.dungeonsanddragonsmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.dungeonsanddragonsmanager.BackEnd.Acolyte;
import com.dungeonsanddragonsmanager.BackEnd.Background;
import com.dungeonsanddragonsmanager.BackEnd.Barbarian;
import com.dungeonsanddragonsmanager.BackEnd.Dragonborn;
import com.dungeonsanddragonsmanager.BackEnd.Dwarf;
import com.dungeonsanddragonsmanager.BackEnd.Elf;
import com.dungeonsanddragonsmanager.BackEnd.Gnome;
import com.dungeonsanddragonsmanager.BackEnd.Halfelf;
import com.dungeonsanddragonsmanager.BackEnd.Halfling;
import com.dungeonsanddragonsmanager.BackEnd.Halforc;
import com.dungeonsanddragonsmanager.BackEnd.Human;
import com.dungeonsanddragonsmanager.BackEnd.Race;
import com.dungeonsanddragonsmanager.BackEnd.Role;
import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;
import com.dungeonsanddragonsmanager.BackEnd.Tiefling;

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
    TextView raceHeader, classHeader, backgroundHeader;
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

        playerStat = new Stat(Integer.parseInt(chosenStats[0]), Integer.parseInt(chosenStats[1]), Integer.parseInt(chosenStats[2]),
                Integer.parseInt(chosenStats[3]), Integer.parseInt(chosenStats[4]), Integer.parseInt(chosenStats[5]));

        attributes = (TextView) findViewById(R.id.attributes);


        raceHeader = (TextView) findViewById(R.id.raceHeader);
        chosenRace = (TextView) findViewById(R.id.myRace);
        chosenRace.setMovementMethod(new ScrollingMovementMethod());

        classHeader = (TextView) findViewById(R.id.classHeader);
        chosenClass = (TextView) findViewById(R.id.myClass);
        chosenClass.setMovementMethod(new ScrollingMovementMethod());

        backgroundHeader = (TextView) findViewById(R.id.backHeader);
        chosenBackground = (TextView) findViewById(R.id.myBackground);
        chosenBackground.setMovementMethod(new ScrollingMovementMethod());

        if ( myCharacter[0].equals("Dwarf")) {
            playerRace = new Dwarf(playerStat);
            raceHeader.setText("Race: Dwarf");
            chosenRace.setText(playerRace.toString());
        }
        else if ( myCharacter[0].equals("Elf")) {
            playerRace = new Elf(playerStat);
            raceHeader.setText("Race: Elf");
            chosenRace.setText(playerRace.toString());
        }
        else if ( myCharacter[0].equals("Halfling")) {
            playerRace = new Halfling(playerStat);
            raceHeader.setText("Race: Halfling");
            chosenRace.setText(playerRace.toString());
        }
        else if ( myCharacter[0].equals("Human")) {
            playerRace = new Human(playerStat);
            raceHeader.setText("Race: Human");
            chosenRace.setText(playerRace.toString());
        }
        else if ( myCharacter[0].equals("Dragonborn")) {
            playerRace = new Dragonborn(playerStat);
            raceHeader.setText("Race: Dragonborn");
            chosenRace.setText(playerRace.toString());
        }
        else if ( myCharacter[0].equals("Gnome")) {
            playerRace = new Gnome(playerStat);
            raceHeader.setText("Race: Gnome");
            chosenRace.setText(playerRace.toString());
        }
        else if ( myCharacter[0].equals("Half Elf")) {
            playerRace = new Halfelf(playerStat);
            raceHeader.setText("Race: Half-Elf");
            chosenRace.setText(playerRace.toString());
        }
        else if ( myCharacter[0].equals("Half Orc")) {
            playerRace = new Halforc(playerStat);
            raceHeader.setText("Race: Half-Orc");
            chosenRace.setText(playerRace.toString());
        }
        else if ( myCharacter[0].equals("Tiefling")) {
            playerRace = new Tiefling(playerStat);
            raceHeader.setText("Race: Tiefling");
            chosenRace.setText(playerRace.toString());
        }
        if ( myCharacter[1].equals("Barbarian")) {
            playerRole = new Barbarian(playerStat);
            classHeader.setText("Class: Barbarian");
            chosenClass.setText(playerRole.toString());
        }
        if ( myCharacter[2].equals("Acolyte")) {
            playerBackground = new Acolyte();
            backgroundHeader.setText("Background: Acolyte");
            chosenBackground.setText(playerBackground.toString());
        }

        attString = playerStat.toString();
        attributes.setText("Attributes: \n" + attString);
        /*//chosenRace.setText("Race: " + myCharacter[0]);

        chosenClass = (TextView) findViewById(R.id.myClass);
        chosenClass.setText("Class: " + myCharacter[1]);

        chosenBackground = (TextView) findViewById(R.id.myBackground);
        chosenBackground.setText("Background: " + myCharacter[2]);

        //raceImage = (ImageView) findViewById(R.id.raceImage);
        //raceImage.setImageResource(R.drawable.dwarf);
        /*else if (raceName.equals("elf") )
            raceImage.setImageResource(R.drawable.elf);
        if ( raceName.equals("halfling") )
            raceImage.setImageResource(R.drawable.halfling);
        else if (raceName.equals("human") )
            raceImage.setImageResource(R.drawable.human); */
        //classImage = (ImageView) findViewById(R.id.classImage);
        //classImage.setImageResource(R.drawable.barbarian);
        //backImage = (ImageView) findViewById(R.id.backImage);
        //backImage.setImageResource(R.drawable.acolyte);*/

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

        //play = (Button) findViewById(R.id.goPlay);
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
