package com.example.dylan.dungeonsanddragonsmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;


/**
 * Created by Dylan on 2015-10-25.
 */
public class finalizeCharacter extends Activity {

    final Context context = this;

    TextView yourCharacter, stat1, stat2, stat3, stat4, stat5;

    ScrollView description;

    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finalize_character);

        yourCharacter = (TextView) findViewById(R.id.yourCharacter);
        stat1 = (TextView) findViewById(R.id.stat1);
        stat2 = (TextView) findViewById(R.id.stat2);
        stat3 = (TextView) findViewById(R.id.stat3);
        stat4 = (TextView) findViewById(R.id.stat4);
        stat5 = (TextView) findViewById(R.id.stat5);

        description = (ScrollView) findViewById(R.id.characterDescription);

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
