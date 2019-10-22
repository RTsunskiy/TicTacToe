package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageButton button00;
    private ImageButton button01;
    private ImageButton button02;

    private ImageButton button10;
    private ImageButton button11;
    private ImageButton button12;

    private ImageButton button20;
    private ImageButton button21;
    private ImageButton button22;

    private boolean index;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        index = true;

        initButtons();

        buttonListeners();



    }

    private void buttonListeners() {
        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index) {
                    button00.setBackground(getResources().getDrawable(R.drawable.ic_cross_foreground));
                    tweenAnimation(button00);
                    index = false;
                    return;
                }
               else if (!index) {
                    button00.setBackground(getResources().getDrawable(R.drawable.ic_circle_foreground));
                    index = true;
                    tweenAnimation(button00);
                    return;
                }
            }
        });

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index) {
                    button01.setBackground(getResources().getDrawable(R.drawable.ic_cross_foreground));
                    index = false;
                    tweenAnimation(button01);
                    return;
                }
               else if (!index) {
                    button01.setBackground(getResources().getDrawable(R.drawable.ic_circle_foreground));
                    index = true;
                    tweenAnimation(button01);
                    return;
                }
            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index) {
                    button02.setBackground(getResources().getDrawable(R.drawable.ic_cross_foreground));
                    index = false;
                    tweenAnimation(button02);
                    return;
                }
               else if (!index) {
                    button02.setBackground(getResources().getDrawable(R.drawable.ic_circle_foreground));
                    index = true;
                    tweenAnimation(button02);
                    return;
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index) {
                    button10.setBackground(getResources().getDrawable(R.drawable.ic_cross_foreground));
                    index = false;
                    tweenAnimation(button10);
                    return;
                }
               else if (!index) {
                    button10.setBackground(getResources().getDrawable(R.drawable.ic_circle_foreground));
                    index = true;
                    tweenAnimation(button10);
                    return;
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index) {
                    button11.setBackground(getResources().getDrawable(R.drawable.ic_cross_foreground));
                    tweenAnimation(button11);
                    index = false;
                    return;
                }
               else if (!index) {
                    button11.setBackground(getResources().getDrawable(R.drawable.ic_circle_foreground));
                    tweenAnimation(button11);
                    index = true;
                    return;
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index) {
                    button12.setBackground(getResources().getDrawable(R.drawable.ic_cross_foreground));
                    tweenAnimation(button12);
                    index = false;
                    return;
                }
               else if (!index) {
                    button12.setBackground(getResources().getDrawable(R.drawable.ic_circle_foreground));
                    tweenAnimation(button12);
                    index = true;
                    return;
                }
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index) {
                    button20.setBackground(getResources().getDrawable(R.drawable.ic_cross_foreground));
                    tweenAnimation(button20);
                    index = false;
                    return;
                }
               else if (!index) {
                    button20.setBackground(getResources().getDrawable(R.drawable.ic_circle_foreground));
                    tweenAnimation(button20);
                    index = true;
                    return;
                }
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index) {
                    button21.setBackground(getResources().getDrawable(R.drawable.ic_cross_foreground));
                    tweenAnimation(button21);
                    index = false;
                    return;
                }
               else if (!index) {
                    button21.setBackground(getResources().getDrawable(R.drawable.ic_circle_foreground));
                    tweenAnimation(button21);
                    index = true;
                    return;
                }
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index) {
                    button22.setBackground(getResources().getDrawable(R.drawable.ic_cross_foreground));
                    tweenAnimation(button22);
                    index = false;
                    return;
                }
               else if (!index) {
                    button22.setBackground(getResources().getDrawable(R.drawable.ic_circle_foreground));
                    tweenAnimation(button22);
                    index = true;
                    return;
                }
            }
        });
    }

    private void initButtons() {
        button00 = findViewById(R.id.button_00);
        button01 = findViewById(R.id.button_01);
        button02 = findViewById(R.id.button_02);

        button10 = findViewById(R.id.button_10);
        button11 = findViewById(R.id.button_11);
        button12 = findViewById(R.id.button_12);

        button20 = findViewById(R.id.button_20);
        button21 = findViewById(R.id.button_21);
        button22 = findViewById(R.id.button_22);
    }


    private void tweenAnimation(ImageButton button) {
        final Animation animation = new ScaleAnimation(0.5f, 1f, 0.5f, 1f);
        animation.setDuration(1000);
        animation.setInterpolator(new BounceInterpolator());
        if (button.equals(button00)) {
            button00.startAnimation(animation);
        }
        else if (button.equals(button01)) {
            button01.startAnimation(animation);
        }
        else if (button.equals(button02)) {
            button02.startAnimation(animation);
        }
        else if (button.equals(button10)) {
            button10.startAnimation(animation);
        }
        else if (button.equals(button11)) {
            button11.startAnimation(animation);
        }
        else if (button.equals(button12)) {
            button12.startAnimation(animation);
        }
        else if (button.equals(button20)) {
            button20.startAnimation(animation);
        }
        else if (button.equals(button21)) {
            button21.startAnimation(animation);
        }
        else if (button.equals(button22)) {
            button22.startAnimation(animation);
        }


    }


}
