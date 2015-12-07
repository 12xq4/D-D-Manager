package com.dungeonsanddragonsmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.text.method.ScrollingMovementMethod;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.dungeonsanddragonsmanager.BackEnd.Background.Acolyte;
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
import com.dungeonsanddragonsmanager.BackEnd.Races.Dwarf;
import com.dungeonsanddragonsmanager.BackEnd.Stat;


/**
 * Created by Dylan on 2015-10-25.
 */
public class chooseBackground extends Activity {

    final Context context = this;

    String[] myCharacter = new String[3];

    String selectedBackground;

    String savedBackground;

    ImageView backgroundImage;

    TextView chooseBackgroundText;

    HorizontalScrollView hsr;

    LinearLayout linearLayout;

    TextView backgroundDescription;
    TextView otherDescription;

    Button proceed;

    ImageButton raceButton, classButton, bgButton, statsButton, fCharButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_background);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();

        Intent preIntent = getIntent();
        Bundle bundle = preIntent.getExtras();

        myCharacter = (String[]) bundle.get("myCharacter");

        backgroundImage = (ImageView) findViewById(R.id.backgroundImage);

        backgroundDescription = (TextView) findViewById(R.id.backgroundDescription);
        backgroundDescription.setMovementMethod(new ScrollingMovementMethod());
        otherDescription = (TextView) findViewById(R.id.otherInformation);
        otherDescription.setMovementMethod(new ScrollingMovementMethod());

        hsr = (HorizontalScrollView) findViewById(R.id.horizontalScrollView);

        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

        chooseBackgroundText = (TextView) findViewById(R.id.chooseBackgroundText);

        proceed = (Button) findViewById(R.id.backgroundProceed);
        proceed.setOnClickListener(new proceedButtonListener());
        proceed.setEnabled(false);

        raceButton = (ImageButton) findViewById(R.id.raceButton);
        raceButton.setImageResource(R.drawable.green_circle);
        raceButton.setOnClickListener(new raceButtonListener());

        classButton = (ImageButton) findViewById(R.id.classButton);
        classButton.setImageResource(R.drawable.green_circle);
        classButton.setOnClickListener(new classButtonListener());

        bgButton = (ImageButton) findViewById(R.id.backgroundButton);
        bgButton.setImageResource(R.drawable.blue_circle);

        statsButton = (ImageButton) findViewById(R.id.statsButton);
        statsButton.setImageResource(R.drawable.grey_circle);

        fCharButton = (ImageButton) findViewById(R.id.finalCharacterButton);
        fCharButton.setImageResource(R.drawable.grey_circle);

        display.getSize(size);
        final int width = size.x;

        final Button acolyteButton = new Button(this);
        acolyteButton.setText(R.string.acolyte);
        acolyteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (acolyteButton.getLeft() - (width / 2)) + (acolyteButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                backgroundImage.setImageResource(R.drawable.acolyte);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.acolyte_description);
                Acolyte temp = new Acolyte();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Acolyte";
            }
        });

        final Button charlatanButton = new Button(this);
        charlatanButton.setText(R.string.charlatan);
        charlatanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (charlatanButton.getLeft() - (width / 2)) + (charlatanButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                backgroundImage.setImageResource(R.drawable.charlatan);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.charlatan_description);
                Charlatan temp = new Charlatan();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Charlatan";
            }
        });

        final Button criminalButton = new Button(this);
        criminalButton.setText(R.string.criminal);
        criminalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (criminalButton.getLeft() - (width / 2)) + (criminalButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                backgroundImage.setImageResource(R.drawable.criminal);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.criminal_description);
                Criminal temp = new Criminal();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Criminal";
            }
        });

        final Button entertainerButton = new Button(this);
        entertainerButton.setText(R.string.entertainer);
        entertainerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (entertainerButton.getLeft() - (width / 2)) + (entertainerButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                backgroundImage.setImageResource(R.drawable.entertainer);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.entertainer_description);
                Entertainer temp = new Entertainer();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Entertainer";
            }
        });

        final Button folk_heroButton = new Button(this);
        folk_heroButton.setText(R.string.folk_hero);
        folk_heroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (folk_heroButton.getLeft() - (width / 2)) + (folk_heroButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                backgroundImage.setImageResource(R.drawable.folk_hero);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.folk_hero_description);
                FolkHero temp = new FolkHero();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Folk Hero";
            }
        });

        final Button guild_artisanButton = new Button(this);
        guild_artisanButton.setText(R.string.guild_artisan);
        guild_artisanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (guild_artisanButton.getLeft() - (width / 2)) + (guild_artisanButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                backgroundImage.setImageResource(R.drawable.guild_artisan);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.guild_artisan_description);
                GuildArtisan temp = new GuildArtisan();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Guild Artisan";
            }
        });

        final Button hermitButton = new Button(this);
        hermitButton.setText(R.string.hermit);
        hermitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (hermitButton.getLeft() - (width / 2)) + (hermitButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                backgroundImage.setImageResource(R.drawable.hermit);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.hermit_description);
                Hermit temp = new Hermit();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Hermit";
            }
        });

        final Button nobleButton = new Button(this);
        nobleButton.setText(R.string.noble);
        nobleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (nobleButton.getLeft() - (width / 2)) + (nobleButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                backgroundImage.setImageResource(R.drawable.noble);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.noble_description);
                Noble temp = new Noble();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Noble";
            }
        });

        final Button outlanderButton = new Button(this);
        outlanderButton.setText(R.string.outlander);
        outlanderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (outlanderButton.getLeft() - (width / 2)) + (outlanderButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                backgroundImage.setImageResource(R.drawable.outlander);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.outlander_description);
                Outlander temp = new Outlander();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Outlander";
            }
        });

        final Button sageButton = new Button(this);
        sageButton.setText(R.string.sage);
        sageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (sageButton.getLeft() - (width / 2)) + (sageButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                backgroundImage.setImageResource(R.drawable.sage);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.sage_description);
                Sage temp = new Sage();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Sage";
            }
        });

        final Button sailorButton = new Button(this);
        sailorButton.setText(R.string.sailor);
        sailorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (sailorButton.getLeft() - (width / 2)) + (sailorButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                backgroundImage.setImageResource(R.drawable.sailor);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.sailor_description);
                Sailor temp = new Sailor();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Sailor";
                //Race race = new Dwarf(new Stat(1,2,3,4,5,6));
            }
        });

        final Button soldierButton = new Button(this);
        soldierButton.setText(R.string.soldier);
        soldierButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (soldierButton.getLeft() - (width / 2)) + (soldierButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                backgroundImage.setImageResource(R.drawable.soldier);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.soldier_description);
                Soldier temp = new Soldier();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Soldier";
            }
        });

        final Button urchinButton = new Button(this);
        urchinButton.setText(R.string.urchin);
        urchinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (urchinButton.getLeft() - (width / 2)) + (urchinButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                backgroundImage.setImageResource(R.drawable.urchin);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.urchin_description);
                Urchin temp = new Urchin();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Urchin";
            }
        });

        if ( ! myCharacter[2].equals("") ) {
            savedBackground = myCharacter[2];
            if (savedBackground.equals("Acolyte")) {
                backgroundImage.setImageResource(R.drawable.acolyte);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.acolyte_description);
                Acolyte temp = new Acolyte();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Acolyte";
            }
            else if (savedBackground.equals("Charlatan")) {
                backgroundImage.setImageResource(R.drawable.charlatan);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.charlatan_description);
                Charlatan temp = new Charlatan();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Charlatan";
            }
            else if (savedBackground.equals("Criminal")) {
                backgroundImage.setImageResource(R.drawable.criminal);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.criminal_description);
                Criminal temp = new Criminal();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Criminal";
            }
            else if (savedBackground.equals("Entertainer")) {
                backgroundImage.setImageResource(R.drawable.entertainer);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.entertainer_description);
                Entertainer temp = new Entertainer();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Entertainer";
            }
            else if (savedBackground.equals("Folk Hero")) {
                backgroundImage.setImageResource(R.drawable.folk_hero);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.folk_hero_description);
                FolkHero temp = new FolkHero();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Folk Hero";
            }
            else if (savedBackground.equals("Guild Artisan")) {
                backgroundImage.setImageResource(R.drawable.guild_artisan);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.guild_artisan_description);
                GuildArtisan temp = new GuildArtisan();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Guild Artisan";
            }
            else if (savedBackground.equals("Hermit")) {
                backgroundImage.setImageResource(R.drawable.hermit);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.hermit_description);
                Hermit temp = new Hermit();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Hermit";
            }
            else if (savedBackground.equals("Noble")) {
                backgroundImage.setImageResource(R.drawable.noble);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.noble_description);
                Noble temp = new Noble();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Noble";
            }
            else if (savedBackground.equals("Outlander")) {
                backgroundImage.setImageResource(R.drawable.outlander);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.outlander_description);
                Outlander temp = new Outlander();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Outlander";
            }
            else if (savedBackground.equals("Sage")) {
                backgroundImage.setImageResource(R.drawable.sage);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.sage_description);
                Sage temp = new Sage();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Sage";
            }
            else if (savedBackground.equals("Sailor")) {
                backgroundImage.setImageResource(R.drawable.sailor);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.sailor_description);
                Sailor temp = new Sailor();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Sailor";
            }
            else if (savedBackground.equals("Soldier")) {
                backgroundImage.setImageResource(R.drawable.soldier);
                backgroundDescription.scrollTo(0, 0);
                backgroundDescription.setText(R.string.soldier_description);
                Soldier temp = new Soldier();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Soldier";
            }
            else if (savedBackground.equals("Urchin")) {
                backgroundImage.setImageResource(R.drawable.urchin);
                backgroundDescription.scrollTo(0,0);
                backgroundDescription.setText(R.string.urchin_description);
                Urchin temp = new Urchin();
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedBackground = "Urchin";
            }
        }

        linearLayout.addView(acolyteButton);
        linearLayout.addView(charlatanButton);
        linearLayout.addView(criminalButton);
        linearLayout.addView(entertainerButton);
        linearLayout.addView(folk_heroButton);
        linearLayout.addView(guild_artisanButton);
        linearLayout.addView(hermitButton);
        linearLayout.addView(nobleButton);
        linearLayout.addView(outlanderButton);
        linearLayout.addView(sageButton);
        linearLayout.addView(sailorButton);
        linearLayout.addView(soldierButton);
        linearLayout.addView(urchinButton);
    }

    private class proceedButtonListener implements View.OnClickListener {
      public void onClick(View v) {
          myCharacter[2] = selectedBackground;
          Intent intent = new Intent(context, chooseStats.class);
          intent.putExtra("myCharacter", myCharacter);
          startActivity(intent);
     }
    }

    private class raceButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(context, chooseRace.class);
            intent.putExtra("myCharacter", myCharacter);
            startActivity(intent);
        }
    }

    private class classButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(context, chooseClass.class);
            intent.putExtra("myCharacter", myCharacter);
            startActivity(intent);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.action_help:
                showHelp();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
    private void showHelp(){
        Intent intent = new Intent(context, helpScreen.class);
        intent.putExtra("Flag", helpScreen.BACKGROUND_HELP);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }
}
