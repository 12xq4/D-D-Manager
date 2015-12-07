package com.dungeonsanddragonsmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by jackqiao on 12/5/2015.
 */
public class helpScreen extends Activity {
    public static final int RACE_HELP = 1;
    public static final int ROLE_HELP = 2;
    public static final int BACKGROUND_HELP = 3;
    public static final int STAT_HELP = 4;

    private int flag;

    final Context context = this;

    TextView title;
    TextView description;
    Button backButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_screen);

        Intent intent = getIntent();
        flag = intent.getIntExtra("Flag", 0);
        title = (TextView) findViewById(R.id.help_title);
        description = (TextView) findViewById(R.id.help_description);

        switch (flag){
            case 1:
                title.setText(R.string.raceTitle);
                description.setText(R.string.menuRaceDescription);
                break;
            case 2:
                title.setText(R.string.classTitle);
                description.setText(R.string.menuClassDescription);
                break;
            case 3:
                title.setText(R.string.bgTitle);
                description.setText(R.string.menuBGDescription);
                break;
            case 4:
                title.setText(R.string.statTitle);
                description.setText(R.string.menuStatDescription);
            default:
                break;
        }


    }

}
