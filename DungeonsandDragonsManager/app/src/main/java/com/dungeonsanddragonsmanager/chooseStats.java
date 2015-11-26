package com.dungeonsanddragonsmanager;

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
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * Created by Dylan on 2015-10-25.
 */
public class chooseStats extends Activity {

    final Context context = this;

    String[] myCharacter = new String[3];

    TextView chooseStatsText;

    TextView point1, point2, point3, point4, point5, point6;

    TextView strengthVal, conVal, dexVal, intVal, charismaVal, wisdomVal;

    int selected;

    String[] selectedStats = new String[6];

    Button proceed;

    ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_stats);

        Intent preIntent = getIntent();
        Bundle bundle = preIntent.getExtras();

        myCharacter = (String[]) bundle.get("myCharacter");

        chooseStatsText = (TextView) findViewById(R.id.chooseStatsText);

        proceed = (Button) findViewById(R.id.statsProceedButton);
        proceed.setOnClickListener(new proceedButtonListener());

        progress = (ProgressBar) findViewById(R.id.progressBar);
        progress.setProgress(80);

        // Points: 15, 14, 13, 12, 10, 8
        point1 = (TextView) findViewById(R.id.point1);
        point1.setText("15");
        point1.setOnTouchListener(new My15TouchListener());

        point2 = (TextView) findViewById(R.id.point2);
        point2.setText("14");
        point2.setOnTouchListener(new My14TouchListener());

        point3 = (TextView) findViewById(R.id.point3);
        point3.setText("13");
        point3.setOnTouchListener(new My13TouchListener());

        point4 = (TextView) findViewById(R.id.point4);
        point4.setText("12");
        point4.setOnTouchListener(new My12TouchListener());

        point5 = (TextView) findViewById(R.id.point5);
        point5.setText("10");
        point5.setOnTouchListener(new My10TouchListener());

        point6 = (TextView) findViewById(R.id.point6);
        point6.setText("8");
        point6.setOnTouchListener(new My8TouchListener());

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

    }
    private final class My15TouchListener implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, shadowBuilder, view, 0);
                view.setVisibility(View.VISIBLE);
                selected = 15;
                return true;
            } else {
                return false;
            }
        }
    };

    private final class My14TouchListener implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, shadowBuilder, view, 0);
                view.setVisibility(View.VISIBLE);
                selected = 14;
                return true;
            } else {
                return false;
            }
        }
    };

    private final class My13TouchListener implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, shadowBuilder, view, 0);
                view.setVisibility(View.VISIBLE);
                selected = 13;
                return true;
            } else {
                return false;
            }
        }
    };

    private final class My12TouchListener implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, shadowBuilder, view, 0);
                view.setVisibility(View.VISIBLE);
                selected = 12;
                return true;
            } else {
                return false;
            }
        }
    };

    private final class My10TouchListener implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, shadowBuilder, view, 0);
                view.setVisibility(View.VISIBLE);
                selected = 10;
                return true;
            } else {
                return false;
            }
        }
    };

    private final class My8TouchListener implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, shadowBuilder, view, 0);
                view.setVisibility(View.VISIBLE);
                selected = 8;
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
                    strengthVal.setText(selected + "");
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
                    conVal.setText(selected + "");
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
                    dexVal.setText(selected + "");
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
                    intVal.setText(selected + "");
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
                    charismaVal.setText(selected + "");
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
                    wisdomVal.setText(selected + "");
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
            selectedStats[0] = strengthVal.getText() + "";
            selectedStats[2] = conVal.getText() + "";
            selectedStats[1] = dexVal.getText() + "";
            selectedStats[3] = intVal.getText() + "";
            selectedStats[4] = charismaVal.getText() + "";
            selectedStats[5] = wisdomVal.getText() + "";
            Intent intent = new Intent(context, finalizeCharacter.class);
            intent.putExtra("myCharacter", myCharacter);
            intent.putExtra("selectedStats", selectedStats);
            startActivity(intent);
        }
    };

    public void onBackPressed() {

        super.onBackPressed();
    }

}