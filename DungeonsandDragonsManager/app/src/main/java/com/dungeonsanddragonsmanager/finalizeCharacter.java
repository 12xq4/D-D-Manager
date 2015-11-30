package com.dungeonsanddragonsmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.dungeonsanddragonsmanager.BackEnd.Background.Acolyte;
import com.dungeonsanddragonsmanager.BackEnd.Background.Background;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Barbarian;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Bard;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Cleric;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Druid;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Fighter;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Monk;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Paladin;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Ranger;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Rogue;
import com.dungeonsanddragonsmanager.BackEnd.Races.Dragonborn;
import com.dungeonsanddragonsmanager.BackEnd.Races.Dwarf;
import com.dungeonsanddragonsmanager.BackEnd.Races.Elf;
import com.dungeonsanddragonsmanager.BackEnd.Races.Gnome;
import com.dungeonsanddragonsmanager.BackEnd.Races.Halfelf;
import com.dungeonsanddragonsmanager.BackEnd.Races.Halfling;
import com.dungeonsanddragonsmanager.BackEnd.Races.Halforc;
import com.dungeonsanddragonsmanager.BackEnd.Races.Human;
import com.dungeonsanddragonsmanager.BackEnd.Races.Race;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Role;
import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;
import com.dungeonsanddragonsmanager.BackEnd.Races.Tiefling;

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

    ImageButton raceButton, classButton, bgButton, statsButton, fCharButton;

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

        raceButton = (ImageButton) findViewById(R.id.raceButton);
        raceButton.setImageResource(R.drawable.green_circle);
        raceButton.setOnClickListener(new raceButtonListener());

        classButton = (ImageButton) findViewById(R.id.classButton);
        classButton.setImageResource(R.drawable.green_circle);
        classButton.setOnClickListener(new classButtonListener());

        bgButton = (ImageButton) findViewById(R.id.backgroundButton);
        bgButton.setImageResource(R.drawable.green_circle);
        bgButton.setOnClickListener(new bgButtonListener());

        statsButton = (ImageButton) findViewById(R.id.statsButton);
        statsButton.setImageResource(R.drawable.green_circle);
        statsButton.setOnClickListener(new statsButtonListener());

        fCharButton = (ImageButton) findViewById(R.id.finalCharacterButton);
        fCharButton.setImageResource(R.drawable.blue_circle);

        // Instantiate Race Object
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

        // Instantiate Class Object
        if ( myCharacter[1].equals("Barbarian")) {
            playerRole = new Barbarian(playerStat);
            classHeader.setText("Class: Barbarian");
            chosenClass.setText(playerRole.toString());
        }
        else if ( myCharacter[1].equals("Bard")) {
            playerRole = new Bard(playerStat);
            classHeader.setText("Class: Bard");
            chosenClass.setText(playerRole.toString());
        }
        else if ( myCharacter[1].equals("Cleric")) {
            playerRole = new Cleric(playerStat);
            classHeader.setText("Class: Cleric");
            chosenClass.setText(playerRole.toString());
        }
        else if ( myCharacter[1].equals("Druid")) {
            playerRole = new Druid(playerStat);
            classHeader.setText("Class: Druid");
            chosenClass.setText(playerRole.toString());
        }
        else if ( myCharacter[1].equals("Fighter")) {
            playerRole = new Fighter(playerStat);
            classHeader.setText("Class: Figther");
            chosenClass.setText(playerRole.toString());
        }
        else if ( myCharacter[1].equals("Monk")) {
            playerRole = new Monk(playerStat);
            classHeader.setText("Class: Monk");
            chosenClass.setText(playerRole.toString());
        }
        else if ( myCharacter[1].equals("Paladin")) {
            playerRole = new Paladin(playerStat);
            classHeader.setText("Class: Paladin");
            chosenClass.setText(playerRole.toString());
        }
        else if ( myCharacter[1].equals("Ranger")) {
            playerRole = new Ranger(playerStat);
            classHeader.setText("Class: Ranger");
            chosenClass.setText(playerRole.toString());
        }
        else if ( myCharacter[1].equals("Rogue")) {
            playerRole = new Rogue(playerStat);
            classHeader.setText("Class: Rogue");
            chosenClass.setText(playerRole.toString());
        }

        // Instantiate Background Object
        if ( myCharacter[2].equals("Acolyte")) {
            playerBackground = new Acolyte();
            backgroundHeader.setText("Background: Acolyte");
            chosenBackground.setText(playerBackground.toString());
        }

        attString = playerStat.toString();
        attributes.setText("Attributes: \n" + attString);


    }

    /*private class proceedButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(context, chooseStats.class);
            startActivity(intent);
        }
    };*/

    private class raceButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(context, chooseRace.class);
            startActivity(intent);
        }
    };

    private class classButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(context, chooseClass.class);
            intent.putExtra("myCharacter", myCharacter);
            startActivity(intent);
        }
    };

    private class bgButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(context, chooseBackground.class);
            intent.putExtra("myCharacter", myCharacter);
            startActivity(intent);
        }
    };

    private class statsButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(context, chooseStats.class);
            intent.putExtra("myCharacter", myCharacter);
            startActivity(intent);
        }
    };


}
