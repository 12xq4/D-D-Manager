package com.example.dylan.dungeonsanddragonsmanager;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnDragListener;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * Created by Dylan on 2015-10-25.
 */
public class chooseStats extends Activity {

    final Context context = this;

    TextView chooseStatsText;

    TextView point1, point2, point3;

    TextView strengthVal, conVal, dexVal, intVal, charismaVal, wisdomVal;

    //float currentx, currenty;

    //ImageView number1, number2;

    Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_stats);

        chooseStatsText = (TextView) findViewById(R.id.chooseStatsText);

        proceed = (Button) findViewById(R.id.statsProceedButton);
        proceed.setOnClickListener(new proceedButtonListener());

        point1 = (TextView) findViewById(R.id.point1);
        point1.setOnTouchListener(new MyTouchListener());

        point2 = (TextView) findViewById(R.id.point2);
        point2.setOnTouchListener(new MyTouchListener());

        point3 = (TextView) findViewById(R.id.point3);
        point3.setOnTouchListener(new MyTouchListener());

        strengthVal = (TextView) findViewById(R.id.strengthValue);
        strengthVal.setOnDragListener(new MyDragStrengthListener());
        //strengthVal.setOnTouchListener(new MyTouchStrengthListener());

        conVal = (TextView) findViewById(R.id.conValue);
        conVal.setOnDragListener(new MyDragConListener());

        dexVal = (TextView) findViewById(R.id.dexValue);
        dexVal.setOnDragListener(new MyDragDexListener());

        intVal = (TextView) findViewById(R.id.intValue);
        intVal.setOnDragListener(new MyDragIntListener());

        charismaVal = (TextView) findViewById(R.id.charismaValue);
        charismaVal.setOnDragListener(new MyDragCharismaListener());

        wisdomVal = (TextView) findViewById(R.id.wisdomValue);
        wisdomVal.setOnDragListener(new MyDragWisdomListener());

        /*number1 = (ImageView) findViewById(R.id.number1);
        number1.setImageResource(R.drawable.number1);
        number1.setOnTouchListener(new MyTouchListener());

        number2 = (ImageView) findViewById(R.id.number2);
        number2.setImageResource(R.drawable.number1);
        number2.setOnDragListener(new MyDragListener());*/

    /*public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }*/
    }
    private final class MyTouchListener implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, shadowBuilder, view, 0);
                view.setVisibility(View.VISIBLE);
                //currentx = view.getX();
                //currenty = view.getY();
                return true;
            } else {
                return false;
            }
        }
    };

    /*private final class MyTouchStrengthListener implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, shadowBuilder, view, 0);
                view.setVisibility(View.VISIBLE);
                strengthVal.setText(R.string.one);
                point1.setX(currentx);
                point1.setY(currenty);
                point1.setText(R.string.one);
                return true;
            } else {
                return false;
            }
        }
    };*/

    private class MyDragStrengthListener implements OnDragListener {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    View view = (View) event.getLocalState();
                    view.setVisibility(View.INVISIBLE);
                    strengthVal.setText(R.string.two);
                case DragEvent.ACTION_DRAG_ENDED:
                    return true;
                default:
                    break;
            }
            return true;
        }
    }

    private class MyDragConListener implements OnDragListener {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    View view = (View) event.getLocalState();
                    view.setVisibility(View.INVISIBLE);
                    conVal.setText(R.string.two);
                case DragEvent.ACTION_DRAG_ENDED:
                    break;
                default:
                    break;
            }
            return true;
        }
    }

    private class MyDragDexListener implements OnDragListener {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    View view = (View) event.getLocalState();
                    view.setVisibility(View.INVISIBLE);
                    dexVal.setText(R.string.two);
                case DragEvent.ACTION_DRAG_ENDED:
                    break;
                default:
                    break;
            }
            return true;
        }
    }

    private class MyDragIntListener implements OnDragListener {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    View view = (View) event.getLocalState();
                    view.setVisibility(View.INVISIBLE);
                    intVal.setText(R.string.two);
                case DragEvent.ACTION_DRAG_ENDED:
                    break;
                default:
                    break;
            }
            return true;
        }
    }

    private class MyDragCharismaListener implements OnDragListener {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    View view = (View) event.getLocalState();
                    view.setVisibility(View.INVISIBLE);
                    charismaVal.setText(R.string.two);
                case DragEvent.ACTION_DRAG_ENDED:
                    break;
                default:
                    break;
            }
            return true;
        }
    }

    private class MyDragWisdomListener implements OnDragListener {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    View view = (View) event.getLocalState();
                    view.setVisibility(View.INVISIBLE);
                    wisdomVal.setText(R.string.two);
                case DragEvent.ACTION_DRAG_ENDED:
                    break;
                default:
                    break;
            }
            return true;
        }
    }

    private class proceedButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(context, finalizeCharacter.class);
            startActivity(intent);
        }
    };

    public void onBackPressed() {

        super.onBackPressed();
    }

}