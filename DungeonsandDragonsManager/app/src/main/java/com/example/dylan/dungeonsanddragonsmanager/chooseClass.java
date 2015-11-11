package com.example.dylan.dungeonsanddragonsmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


/**
 * Created by Dylan on 2015-10-25.
 */
public class chooseClass extends Activity {

    final Context context = this;

    TextView chooseClassText;

    //RecyclerView listOfClasses = (RecyclerView)findViewById(R.id.listOfClasses);

    //LinearLayoutManager llm;

    Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_class);

        chooseClassText = (TextView) findViewById(R.id.chooseClassText);

        proceed = (Button) findViewById(R.id.classProceed);
        proceed.setOnClickListener(new proceedButtonListener());

        //listOfClasses.setHasFixedSize(true);

        //llm = new LinearLayoutManager(context);
        //listOfClasses.setLayoutManager(llm);


    }

    private class proceedButtonListener implements View.OnClickListener {
      public void onClick(View v) {
           Intent intent = new Intent(context, chooseBackground.class);
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
