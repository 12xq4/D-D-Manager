package com.dungeonsanddragonsmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
// import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.view.View;

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
import com.dungeonsanddragonsmanager.BackEnd.Stat;


/**
 * Created by Dylan on 2015-10-25.
 */
public class chooseClass extends Activity {

    final Context context = this;

    String[] myCharacter = new String[3];

    String selectedClass;

    String savedClass;

    TextView chooseClassText;

    HorizontalScrollView hsr;

    LinearLayout linearLayout;

    ImageView classImage;

    TextView classDescription;
    TextView otherDescription;

    Button proceed;

    ImageButton raceButton, classButton, bgButton, statsButton, fCharButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_class);

        Intent preIntent = getIntent();
        Bundle bundle = preIntent.getExtras();

        myCharacter = (String[]) bundle.get("myCharacter");

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();

        classImage = (ImageView) findViewById(R.id.classImage);

        classDescription = (TextView) findViewById(R.id.classDescription);
        classDescription.setMovementMethod(new ScrollingMovementMethod());
        otherDescription = (TextView) findViewById(R.id.otherInformation);
        otherDescription.setMovementMethod(new ScrollingMovementMethod());

        hsr = (HorizontalScrollView) findViewById(R.id.horizontalScrollView);

        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

        chooseClassText = (TextView) findViewById(R.id.chooseClassText);

        proceed = (Button) findViewById(R.id.classProceed);
        proceed.setOnClickListener(new proceedButtonListener());

        raceButton = (ImageButton) findViewById(R.id.raceButton);
        raceButton.setImageResource(R.drawable.green_circle);
        raceButton.setOnClickListener(new raceButtonListener());

        classButton = (ImageButton) findViewById(R.id.classButton);
        classButton.setImageResource(R.drawable.blue_circle);

        bgButton = (ImageButton) findViewById(R.id.backgroundButton);
        bgButton.setImageResource(R.drawable.grey_circle);

        statsButton = (ImageButton) findViewById(R.id.statsButton);
        statsButton.setImageResource(R.drawable.grey_circle);

        fCharButton = (ImageButton) findViewById(R.id.finalCharacterButton);
        fCharButton.setImageResource(R.drawable.grey_circle);

        display.getSize(size);
        final int width = size.x;

        final Button barbarianButton = new Button(this);
        barbarianButton.setText(R.string.barbarian);
        barbarianButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (barbarianButton.getLeft() - (width / 2)) + (barbarianButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.barbarian_description);
                Barbarian temp = new Barbarian(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                classImage.setImageResource(R.drawable.barbarian);
                proceed.setEnabled(true);
                selectedClass = "Barbarian";
            }
        });

        final Button bardButton = new Button(this);
        bardButton.setText(R.string.bard);
        bardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (bardButton.getLeft() - (width / 2)) + (bardButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                classImage.setImageResource(R.drawable.bard);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.bard_description);
                Bard temp = new Bard(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Bard";
            }
        });

        final Button clericButton = new Button(this);
        clericButton.setText(R.string.cleric);
        clericButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (clericButton.getLeft() - (width / 2)) + (clericButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                classImage.setImageResource(R.drawable.cleric);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.cleric_description);
                Cleric temp = new Cleric(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Cleric";
            }
        });

        final Button druidButton = new Button(this);
        druidButton.setText(R.string.druid);
        druidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (druidButton.getLeft() - (width / 2)) + (druidButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                classImage.setImageResource(R.drawable.druid);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.druid_description);
                Druid temp = new Druid(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Druid";
            }
        });

        final Button fighterButton = new Button(this);
        fighterButton.setText(R.string.fighter);
        fighterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (fighterButton.getLeft() - (width / 2)) + (fighterButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                classImage.setImageResource(R.drawable.fighter);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.fighter_description);
                Fighter temp = new Fighter(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Fighter";
            }
        });

        final Button monkButton = new Button(this);
        monkButton.setText(R.string.monk);
        monkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (monkButton.getLeft() - (width / 2)) + (monkButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                classImage.setImageResource(R.drawable.monk);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.monk_description);
                Monk temp = new Monk(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Monk";
            }
        });

        final Button paladinButton = new Button(this);
        paladinButton.setText(R.string.paladin);
        paladinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (paladinButton.getLeft() - (width / 2)) + (paladinButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                classImage.setImageResource(R.drawable.paladin);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.paladin_description);
                Paladin temp = new Paladin(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Paladin";
            }
        });

        final Button rangerButton = new Button(this);
        rangerButton.setText(R.string.ranger);
        rangerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (rangerButton.getLeft() - (width / 2)) + (rangerButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                classImage.setImageResource(R.drawable.ranger);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.ranger_description);
                Ranger temp = new Ranger(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Ranger";

            }
        });

        final Button rogueButton = new Button(this);
        rogueButton.setText(R.string.rogue);
        rogueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (rogueButton.getLeft() - (width / 2)) + (rogueButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                classImage.setImageResource(R.drawable.rogue);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.rogue_description);
                Rogue temp = new Rogue(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Rogue";
            }
        });

        final Button sorcererButton = new Button(this);
        sorcererButton.setText(R.string.sorcerer);
        sorcererButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (sorcererButton.getLeft() - (width / 2)) + (sorcererButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                classImage.setImageResource(R.drawable.sorcerer);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.sorcerer_description);
                Sorcerer temp = new Sorcerer(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Sorcerer";
            }
        });

        final Button warlockButton = new Button(this);
        warlockButton.setText(R.string.warlock);
        warlockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (warlockButton.getLeft() - (width / 2)) + (warlockButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                classImage.setImageResource(R.drawable.warlock);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.warlock_description);
                Warlock temp = new Warlock(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Warlock";
            }
        });

        final Button wizardButton = new Button(this);
        wizardButton.setText(R.string.wizard);
        wizardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scrollX = (wizardButton.getLeft() - (width / 2)) + (wizardButton.getWidth() / 2);
                hsr.smoothScrollTo(scrollX, 0);
                classImage.setImageResource(R.drawable.wizard);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.wizard_description);
                Wizard temp = new Wizard(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Wizard";
            }
        });

        if ( ! myCharacter[1].equals("") ) {
            savedClass = myCharacter[1];
            if (savedClass.equals("Barbarian")) {
                classImage.setImageResource(R.drawable.barbarian);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.barbarian_description);
                Barbarian temp = new Barbarian(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Barbarian";
            }
            else if (savedClass.equals("Bard")) {
                classImage.setImageResource(R.drawable.bard);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.bard_description);
                Bard temp = new Bard(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Bard";
            }
            else if (savedClass.equals("Cleric")) {
                classImage.setImageResource(R.drawable.cleric);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.cleric_description);
                Cleric temp = new Cleric(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Cleric";
            }
            else if (savedClass.equals("Druid")) {
                classImage.setImageResource(R.drawable.druid);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.druid_description);
                Druid temp = new Druid(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Druid";
            }
            else if (savedClass.equals("Fighter")) {
                classImage.setImageResource(R.drawable.fighter);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.fighter_description);
                Fighter temp = new Fighter(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Fighter";
            }
            else if (savedClass.equals("Monk")) {
                classImage.setImageResource(R.drawable.monk);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.monk_description);
                Monk temp = new Monk(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Monk";
            }
            else if (savedClass.equals("Paladin")) {
                classImage.setImageResource(R.drawable.paladin);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.paladin_description);
                Paladin temp = new Paladin(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Paladin";
            }
            else if (savedClass.equals("Ranger")) {
                classImage.setImageResource(R.drawable.ranger);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.ranger_description);
                Ranger temp = new Ranger(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Ranger";
            }
            else if (savedClass.equals("Rogue")) {
                classImage.setImageResource(R.drawable.rogue);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.rogue_description);
                Rogue temp = new Rogue(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Rogue";
            }
            else if (savedClass.equals("Sorcerer")) {
                classImage.setImageResource(R.drawable.sorcerer);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.sorcerer_description);
                Sorcerer temp = new Sorcerer(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Sorcerer";
            }
            else if (savedClass.equals("Warlock")) {
                classImage.setImageResource(R.drawable.warlock);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.warlock_description);
                Warlock temp = new Warlock(new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Warlock";
            }
            else if (savedClass.equals("Wizard")) {
                classImage.setImageResource(R.drawable.wizard);
                classDescription.scrollTo(0, 0);
                classDescription.setText(R.string.wizard_description);
                Wizard temp = new Wizard (new Stat(0,0,0,0,0,0));
                otherDescription.scrollTo(0, 0);
                otherDescription.setText(temp.toString());
                proceed.setEnabled(true);
                selectedClass = "Wizard";
            }
        }

        linearLayout.addView(barbarianButton);
        linearLayout.addView(bardButton);
        linearLayout.addView(clericButton);
        linearLayout.addView(druidButton);
        linearLayout.addView(fighterButton);
        linearLayout.addView(monkButton);
        linearLayout.addView(paladinButton);
        linearLayout.addView(rangerButton);
        linearLayout.addView(rogueButton);
        linearLayout.addView(sorcererButton);
        linearLayout.addView(warlockButton);
        linearLayout.addView(wizardButton);
    }

    private class proceedButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            myCharacter[1] = selectedClass;
            Intent intent = new Intent(context, chooseBackground.class);
            intent.putExtra("myCharacter", myCharacter);
            startActivity(intent);
        }
    };

    private class raceButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(context, chooseRace.class);
            intent.putExtra("myCharacter", myCharacter);
            startActivity(intent);
        }
    };

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
        intent.putExtra("Flag", helpScreen.ROLE_HELP);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }

}
