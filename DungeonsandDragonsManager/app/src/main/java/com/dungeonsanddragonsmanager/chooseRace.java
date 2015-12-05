package com.dungeonsanddragonsmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.media.Image;
import android.os.Bundle;
// import android.support.v7.widget.LinearLayoutManager;
import android.text.method.ScrollingMovementMethod;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
// import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Dylan on 2015-10-25.
 */
public class chooseRace extends Activity {

    final Context context = this;

    String[] myCharacter = new String[3];

    String savedRace;

    String selectedRace;

    TextView chooseRaceText;

    HorizontalScrollView hsr;

    LinearLayout linearLayout;

    ImageView raceImage;

    TextView raceDescription;

    Button proceed;

    ImageButton raceButton, classButton, bgButton, statsButton, fCharButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_race);

        Intent preIntent = getIntent();
        Bundle bundle = preIntent.getExtras();

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();

        chooseRaceText = (TextView) findViewById(R.id.chooseRaceText);

        raceImage = (ImageView) findViewById(R.id.raceImage);

        raceDescription = (TextView) findViewById(R.id.raceDescription);
        raceDescription.setMovementMethod(new ScrollingMovementMethod());

        hsr = (HorizontalScrollView) findViewById(R.id.horizontalScrollView);

        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

        proceed = (Button) findViewById(R.id.raceProceed);
        proceed.setOnClickListener(new proceedButtonListener());

        myCharacter = (String[]) bundle.get("myCharacter");

        raceButton = (ImageButton) findViewById(R.id.raceButton);
        raceButton.setImageResource(R.drawable.blue_circle);

        classButton = (ImageButton) findViewById(R.id.classButton);
        classButton.setImageResource(R.drawable.grey_circle);

        bgButton = (ImageButton) findViewById(R.id.backgroundButton);
        bgButton.setImageResource(R.drawable.grey_circle);

        statsButton = (ImageButton) findViewById(R.id.statsButton);
        statsButton.setImageResource(R.drawable.grey_circle);

        fCharButton = (ImageButton) findViewById(R.id.finalCharacterButton);
        fCharButton.setImageResource(R.drawable.grey_circle);


        display.getSize(size);
        final int width = size.x;

        final Button dwarfButton = new Button(this);
        dwarfButton.setText(R.string.dwarf);
        dwarfButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (dwarfButton.getLeft() - (width / 2)) + (dwarfButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                raceImage.setImageResource(R.drawable.dwarf);
                raceDescription.setText(R.string.dwarf_description);
                proceed.setEnabled(true);
                selectedRace = "Dwarf";
            }
        });

        final Button elfButton = new Button(this);
        elfButton.setText(R.string.elf);
        elfButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (elfButton.getLeft() - (width / 2)) + (elfButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                raceImage.setImageResource(R.drawable.elf);
                raceDescription.setText(R.string.elf_description);
                proceed.setEnabled(true);
                selectedRace = "Elf";
            }
        });

        final Button halflingButton = new Button(this);
        halflingButton.setText(R.string.halfling);
        halflingButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (halflingButton.getLeft() - (width / 2)) + (halflingButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                raceImage.setImageResource(R.drawable.halfling);
                raceDescription.setText(R.string.halfling_description);
                proceed.setEnabled(true);
                selectedRace = "Halfling";
            }
        });

        final Button humanButton = new Button(this);
        humanButton.setText(R.string.human);
        humanButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (humanButton.getLeft() - (width / 2)) + (humanButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                raceImage.setImageResource(R.drawable.human);
                raceDescription.setText(R.string.human_description);
                proceed.setEnabled(true);
                selectedRace = "Human";
            }
        });

        final Button dragonbornButton = new Button(this);
        dragonbornButton.setText(R.string.dragonborn);
        dragonbornButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (dragonbornButton.getLeft() - (width / 2)) + (dragonbornButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                raceImage.setImageResource(R.drawable.dragonborn);
                raceDescription.setText(R.string.dragonborn_description);
                proceed.setEnabled(true);
                selectedRace = "Dragonborn";
            }
        });

        final Button gnomeButton = new Button(this);
        gnomeButton.setText(R.string.gnome);
        gnomeButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (gnomeButton.getLeft() - (width / 2)) + (gnomeButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                raceImage.setImageResource(R.drawable.gnome);
                raceDescription.setText(R.string.gnome_description);
                proceed.setEnabled(true);
                selectedRace = "Gnome";
            }
        });

        final Button halfElfButton = new Button(this);
        halfElfButton.setText(R.string.half_elf);
        halfElfButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (halfElfButton.getLeft() - (width / 2)) + (halfElfButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                raceImage.setImageResource(R.drawable.half_elf);
                raceDescription.setText(R.string.half_elf_description);
                proceed.setEnabled(true);
                selectedRace = "Half Elf";
            }
        });

        final Button halfOrcButton = new Button(this);
        halfOrcButton.setText(R.string.half_orc);
        halfOrcButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (halfOrcButton.getLeft() - (width / 2)) + (halfOrcButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                raceImage.setImageResource(R.drawable.half_orc);
                raceDescription.setText(R.string.half_orc_description);
                proceed.setEnabled(true);
                selectedRace = "Half Orc";
            }
        });

        final Button tieflingButton = new Button(this);
        tieflingButton.setText(R.string.tiefling);
        tieflingButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (tieflingButton.getLeft() - (width / 2)) + (tieflingButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                raceImage.setImageResource(R.drawable.tiefling);
                raceDescription.setText(R.string.tiefling_description);
                proceed.setEnabled(true);
                selectedRace = "Tiefling";
            }
        });

        linearLayout.addView(dwarfButton);
        linearLayout.addView(elfButton);
        linearLayout.addView(halflingButton);
        linearLayout.addView(humanButton);
        linearLayout.addView(dragonbornButton);
        linearLayout.addView(gnomeButton);
        linearLayout.addView(halfElfButton);
        linearLayout.addView(halfOrcButton);
        linearLayout.addView(tieflingButton);

        if ( ! myCharacter[0].equals("") ) {
            savedRace = myCharacter[0];
            if ( savedRace.equals("Dragonborn") ) {
                raceImage.setImageResource(R.drawable.dragonborn);
                raceDescription.setText(R.string.dragonborn_description);
                proceed.setEnabled(true);
                selectedRace = "Dragonborn";
            }
            else if ( savedRace.equals("Dwarf") ) {
                int scrollX = (dwarfButton.getLeft() - (width / 2)) + (dwarfButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                raceImage.setImageResource(R.drawable.dwarf);
                raceDescription.setText(R.string.dwarf_description);
                proceed.setEnabled(true);
                selectedRace = "Dwarf";
            }
            else if ( savedRace.equals("Elf") ) {
                int scrollX = (elfButton.getLeft() - (width / 2)) + (elfButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                raceImage.setImageResource(R.drawable.elf);
                raceDescription.setText(R.string.elf_description);
                proceed.setEnabled(true);
                selectedRace = "Elf";
            }
            else if ( savedRace.equals("Gnome") ) {
                int scrollX = (gnomeButton.getLeft() - (width / 2)) + (gnomeButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                raceImage.setImageResource(R.drawable.gnome);
                raceDescription.setText(R.string.gnome_description);
                proceed.setEnabled(true);
                selectedRace = "Gnome";
            }
            else if ( savedRace.equals("Half Elf") ) {
                int scrollX = (halfElfButton.getLeft() - (width / 2)) + (halfElfButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                raceImage.setImageResource(R.drawable.half_elf);
                raceDescription.setText(R.string.half_elf_description);
                proceed.setEnabled(true);
                selectedRace = "Half Elf";
            }
            else if ( savedRace.equals("Halfling") ) {
                int scrollX = (halflingButton.getLeft() - (width / 2)) + (halflingButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                raceImage.setImageResource(R.drawable.halfling);
                raceDescription.setText(R.string.halfling_description);
                proceed.setEnabled(true);
                selectedRace = "Halfling";
            }
            else if ( savedRace.equals("Half Orc") ) {
                int scrollX = (halfOrcButton.getLeft() - (width / 2)) + (halfOrcButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                raceImage.setImageResource(R.drawable.half_orc);
                raceDescription.setText(R.string.half_orc_description);
                proceed.setEnabled(true);
                selectedRace = "Half Orc";
            }
            else if ( savedRace.equals("Human") ) {
                int scrollX = (humanButton.getLeft() - (width / 2)) + (humanButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                raceImage.setImageResource(R.drawable.human);
                raceDescription.setText(R.string.human_description);
                proceed.setEnabled(true);
                selectedRace = "Human";
            }
            else if ( savedRace.equals("Tiefling") ) {
                int scrollX = (tieflingButton.getLeft() - (width / 2)) + (tieflingButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                raceImage.setImageResource(R.drawable.tiefling);
                raceDescription.setText(R.string.tiefling_description);
                proceed.setEnabled(true);
                selectedRace = "Tiefling";
            }
        }
    }

    private class proceedButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            myCharacter[0] = selectedRace;
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
