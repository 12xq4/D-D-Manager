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


/**
 * Created by Dylan on 2015-10-25.
 */
public class chooseStats extends Activity {

    final Context context = this;

    TextView chooseStatsText;

    private static final String IMAGEVIEW_TAG = "icon bitmap";

    ImageView number1, number2;

    Bitmap.Config config;

    //RecyclerView listOfClasses = (RecyclerView)findViewById(R.id.listOfClasses);

    //LinearLayoutManager llm;

    Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_stats);

        chooseStatsText = (TextView) findViewById(R.id.chooseStatsText);

        proceed = (Button) findViewById(R.id.statsProceedButton);
        //proceed.setOnClickListener(new proceedButtonListener());

        number1 = (ImageView) findViewById(R.id.number1);
        number1.setImageResource(R.drawable.number1);
        number1.setOnTouchListener(new MyTouchListener());

        number2 = (ImageView) findViewById(R.id.number2);
        number2.setImageResource(R.drawable.number1);

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
                return true;
            } else {
                return false;
            }
        }
    };

    private class proceedButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(context, finalizeCharacter.class);
            startActivity(intent);
        }
    };

    private class MyDragListener implements OnDragListener {
        //Drawable enterShape = getResources().getDrawable(R.drawable.shape_droptarget);
        //Drawable normalShape = getResources().getDrawable(R.drawable.shape);

        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    // do nothing
                    if (event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)) {

                        // As an example of what your application might do,
                        // applies a blue color tint to the View to indicate that it can accept
                        // data.
                        //v.setColorFilter(Color.BLUE);

                        // Invalidate the view to force a redraw in the new tint
                        v.invalidate();

                        // returns true to indicate that the View can accept the dragged data.
                        return true;

                    }
                    return false;
                case DragEvent.ACTION_DRAG_ENTERED:
                    //v.setColorFilter(Color.GREEN);

                    // Invalidate the view to force a redraw in the new tint
                    v.invalidate();

                    return true;
                case DragEvent.ACTION_DRAG_EXITED:
                    //v.setColorFilter(Color.BLUE);

                    // Invalidate the view to force a redraw in the new tint
                    v.invalidate();

                    return true;
                case DragEvent.ACTION_DROP:
                    ClipData.Item item = event.getClipData().getItemAt(0);

                    // Gets the text data from the item.
                    //dragData = item.getText();

                    // Displays a message containing the dragged data.
                    //Toast.makeText(this, "Dragged data is " + dragData, Toast.LENGTH_LONG);

                    // Turns off any color tints
                    //v.clearColorFilter();

                    // Invalidates the view to force a redraw
                    v.invalidate();

                    // Returns true. DragEvent.getResult() will return true.
                    return true;
                case DragEvent.ACTION_DRAG_ENDED:
                    //v.clearColorFilter();

                    // Invalidates the view to force a redraw
                    v.invalidate();

                    // returns true; the value is ignored.
                    return true;
                default:
                    break;
            }
            return true;
        }
    }

}