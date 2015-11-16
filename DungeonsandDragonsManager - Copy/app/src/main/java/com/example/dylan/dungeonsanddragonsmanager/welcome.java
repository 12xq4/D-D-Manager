package com.example.dylan.dungeonsanddragonsmanager;

import android.app.Activity;
import android.os.Bundle;

import android.content.Context;
import android.content.Intent;

import android.os.CountDownTimer;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;

import android.os.Handler;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.TextView;

import android.view.View;
import android.view.View.OnClickListener;

import org.w3c.dom.Text;


/**
 * Created by Dylan on 2015-10-25.
 */
public class welcome extends Activity {

    final Context context = this;

    TextView dnd, manager, current, end;

    Animation slideInLeft, slideOutRight;

    private final int DELAY = 6000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        dnd = (TextView) findViewById(R.id.dnd);
        //manager = (TextView) findViewById(R.id.manager);

        slideInLeft = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        slideInLeft.setDuration(3000);
        slideOutRight = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        slideOutRight.setDuration(3000);
        slideInLeft.setAnimationListener(animationSlideInLeftListener);

        current = dnd;
        dnd.startAnimation(slideInLeft);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(context, newOrExisting.class);
                welcome.this.startActivity(intent);
                welcome.this.finish();
            }
        }, DELAY);
    }

    AnimationListener animationSlideInLeftListener
            = new AnimationListener(){

        @Override
        public void onAnimationEnd(Animation animation) {
            // TODO Auto-generated method stub

            if(current == dnd){
                current = end;
                dnd.startAnimation(slideOutRight);
                dnd.setVisibility(View.INVISIBLE);
            }
        }

        @Override
        public void onAnimationRepeat(Animation animation) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onAnimationStart(Animation animation) {
            // TODO Auto-generated method stub

        }};

}