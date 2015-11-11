package com.example.dylan.dungeonsanddragonsmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Dylan on 2015-10-25.
 */
public class chooseRace extends Activity {

    final Context context = this;

    TextView chooseRaceText;

    //RecyclerView listOfRaces = (RecyclerView)findViewById(R.id.listOfRaces);

    //LinearLayoutManager llm;

    HorizontalScrollView hsr;

    LinearLayout linearLayout;

    Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_race);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();

        hsr = (HorizontalScrollView) findViewById(R.id.horizontalScrollView);

        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);


        chooseRaceText = (TextView) findViewById(R.id.chooseRaceText);

        proceed = (Button) findViewById(R.id.raceProceed);
        proceed.setOnClickListener(new proceedButtonListener());

        //listOfRaces.setHasFixedSize(true);

        //llm = new LinearLayoutManager(context);
        //listOfRaces.setLayoutManager(llm);
        display.getSize(size);
        final int width = size.x;
        for (int i = 0; i < 8; i++) {
            final Button b = new Button(this);
            b.setText("t" + i);
            b.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    int scrollX = (b.getLeft() - (width / 2)) + (b.getWidth() / 2);
                    hsr.smoothScrollTo(scrollX, 0);
                }
            });
        linearLayout.addView(b);
        }
    }

    private class proceedButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(context, chooseClass.class);
            startActivity(intent);
        }
    };
    /*public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }*/


}
