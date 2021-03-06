package com.dungeonsanddragonsmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.LiveFolders;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.dungeonsanddragonsmanager.BackEnd.Background.Acolyte;
import com.dungeonsanddragonsmanager.BackEnd.Background.Background;
import com.dungeonsanddragonsmanager.BackEnd.Background.Charlatan;
import com.dungeonsanddragonsmanager.BackEnd.Background.Criminal;
import com.dungeonsanddragonsmanager.BackEnd.Background.Entertainer;
import com.dungeonsanddragonsmanager.BackEnd.Background.FolkHero;
import com.dungeonsanddragonsmanager.BackEnd.Background.GuildArtisan;
import com.dungeonsanddragonsmanager.BackEnd.Background.Hermit;
import com.dungeonsanddragonsmanager.BackEnd.Background.Noble;
import com.dungeonsanddragonsmanager.BackEnd.Background.Outlander;
import com.dungeonsanddragonsmanager.BackEnd.Background.Sage;
import com.dungeonsanddragonsmanager.BackEnd.Background.Sailor;
import com.dungeonsanddragonsmanager.BackEnd.Background.Soldier;
import com.dungeonsanddragonsmanager.BackEnd.Background.Urchin;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Barbarian;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Bard;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Cleric;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Druid;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Fighter;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Monk;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Paladin;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Ranger;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Rogue;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Sorcerer;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Warlock;
import com.dungeonsanddragonsmanager.BackEnd.Classes.Wizard;
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

import java.io.File;
import java.io.FileOutputStream;
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
    public static final String SAVE = "Saved_Info";

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

    boolean existing;

    Button returnButton;

    ImageButton raceButton, classButton, bgButton, statsButton, fCharButton;

    FileOutputStream fos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finalize_character);

        Intent preIntent = getIntent();
        Bundle bundle = preIntent.getExtras();

        myCharacter = (String[]) bundle.get("myCharacter");
        chosenStats = (String[]) bundle.get("selectedStats");
        existing = (boolean) bundle.getBoolean("existing");

        File file = new File(context.getFilesDir(), SAVE);
        writeToSave(myCharacter, chosenStats, file);

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

        if ( ! existing ) {
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

            returnButton = (Button) findViewById(R.id.returnButton);
            returnButton.setText("DONE!");
            returnButton.setOnClickListener(new returnButtonListener());
        }
        else {
            returnButton = (Button) findViewById(R.id.returnButton);
            returnButton.setText("BACK");
            returnButton.setOnClickListener(new returnButtonListener());
        }

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
        else if ( myCharacter[1].equals("Sorcerer")) {
            playerRole = new Sorcerer(playerStat);
            classHeader.setText("Class: Sorcerer");
            chosenClass.setText(playerRole.toString());
        }
        else if ( myCharacter[1].equals("Warlock")) {
            playerRole = new Warlock(playerStat);
            classHeader.setText("Class: Warlock");
            chosenClass.setText(playerRole.toString());
        }
        else if ( myCharacter[1].equals("Wizard")) {
            playerRole = new Wizard(playerStat);
            classHeader.setText("Class: Wizard");
            chosenClass.setText(playerRole.toString());
        }

        // Instantiate Background Object
        if ( myCharacter[2].equals("Acolyte")) {
            playerBackground = new Acolyte();
            backgroundHeader.setText("Background: Acolyte");
            chosenBackground.setText(playerBackground.toString());
        }
        else if ( myCharacter[2].equals("Charlatan")) {
            playerBackground = new Charlatan();
            backgroundHeader.setText("Background: Charlatan");
            chosenBackground.setText(playerBackground.toString());
        }
        else if ( myCharacter[2].equals("Criminal")) {
            playerBackground = new Criminal();
            backgroundHeader.setText("Background: Criminal");
            chosenBackground.setText(playerBackground.toString());
        }
        else if ( myCharacter[2].equals("Entertainer")) {
            playerBackground = new Entertainer();
            backgroundHeader.setText("Background: Entertainer");
            chosenBackground.setText(playerBackground.toString());
        }
        else if ( myCharacter[2].equals("Folk Hero")) {
            playerBackground = new FolkHero();
            backgroundHeader.setText("Background: Folk Hero");
            chosenBackground.setText(playerBackground.toString());
        }
        else if ( myCharacter[2].equals("Guild Artisan")) {
            playerBackground = new GuildArtisan();
            backgroundHeader.setText("Background: Guild Artisan");
            chosenBackground.setText(playerBackground.toString());
        }
        else if ( myCharacter[2].equals("Hermit")) {
            playerBackground = new Hermit();
            backgroundHeader.setText("Background: Hermit");
            chosenBackground.setText(playerBackground.toString());
        }
        else if ( myCharacter[2].equals("Noble")) {
            playerBackground = new Noble();
            backgroundHeader.setText("Background: Noble");
            chosenBackground.setText(playerBackground.toString());
        }
        else if ( myCharacter[2].equals("Outlander")) {
            playerBackground = new Outlander();
            backgroundHeader.setText("Background: Outlander");
            chosenBackground.setText(playerBackground.toString());
        }
        else if ( myCharacter[2].equals("Sage")) {
            playerBackground = new Sage();
            backgroundHeader.setText("Background: Sage");
            chosenBackground.setText(playerBackground.toString());
        }
        else if ( myCharacter[2].equals("Sailor")) {
            playerBackground = new Sailor();
            backgroundHeader.setText("Background: Sailor");
            chosenBackground.setText(playerBackground.toString());
        }
        else if ( myCharacter[2].equals("Soldier")) {
            playerBackground = new Soldier();
            backgroundHeader.setText("Background: Soldier");
            chosenBackground.setText(playerBackground.toString());
        }
        else if ( myCharacter[2].equals("Urchin")) {
            playerBackground = new Urchin();
            backgroundHeader.setText("Background: Urchin");
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

    private class returnButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(context, newOrExisting.class);
            startActivity(intent);
        }
    };

    private void writeToSave(String[] choice, String[] stat, File file) {
        String player_stat = "";
        String player_choice = "";
        for (int h = 0; h<choice.length; h++){
            player_choice+= choice[h] + ",";
        }
        for (int i = 0; i<stat.length; i++){
            player_stat+= stat[i] + ",";
        }

        try {
            fos = openFileOutput(SAVE, context.MODE_PRIVATE);
            fos.write(player_choice.getBytes());
            fos.write(player_stat.getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
