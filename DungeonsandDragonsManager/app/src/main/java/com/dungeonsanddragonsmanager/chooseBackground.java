package com.dungeonsanddragonsmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.text.method.ScrollingMovementMethod;
import android.view.Display;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;


/**
 * Created by Dylan on 2015-10-25.
 */
public class chooseBackground extends Activity {

    final Context context = this;

    String[] myCharacter = new String[3];

    String selectedBackground;

    ImageView backgroundImage;

    TextView chooseBackgroundText;

    HorizontalScrollView hsr;

    LinearLayout linearLayout;

    TextView backgroundDescription;

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
                backgroundDescription.setText(R.string.acolyte_description);
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
                backgroundDescription.setText(R.string.charlatan_description);
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
                backgroundDescription.setText(R.string.criminal_description);
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
                backgroundDescription.setText(R.string.entertainer_description);
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
                backgroundDescription.setText(R.string.folk_hero_description);
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
                backgroundDescription.setText(R.string.guild_artisan_description);
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
                backgroundDescription.setText(R.string.hermit_description);
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
                backgroundDescription.setText(R.string.noble_description);
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
                backgroundDescription.setText(R.string.outlander_description);
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
                backgroundDescription.setText(R.string.sage_description);
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
                backgroundDescription.setText(R.string.sailor_description);
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
                backgroundDescription.setText(R.string.soldier_description);
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
                backgroundDescription.setText(R.string.urchin_description);
                proceed.setEnabled(true);
                selectedBackground = "Urchin";
            }
        });

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

    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }
}
