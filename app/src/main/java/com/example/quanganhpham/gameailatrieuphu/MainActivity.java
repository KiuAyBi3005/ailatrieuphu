package com.example.quanganhpham.gameailatrieuphu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button_start;
    Button button_exit;
    ImageView image_game;
    boolean clicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        button_start = (Button) findViewById(R.id.button_start);
        button_exit = (Button) findViewById(R.id.button_exit);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!clicked) {
                    button_start.animate().translationX(400).withLayer();
                    clicked = true;
                } else {
                    button_start.animate().translationX(0).withLayer();
                    clicked = false;
                }
            }
        });
        button_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!clicked) {
                    button_exit.animate().translationY(50).withLayer();
                    clicked = true;
                } else {
                    button_exit.animate().translationY(0).withLayer();
                    clicked = false;
                }

            }
        });

        image_game = (ImageView) findViewById(R.id.image_game);
        image_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.romate);
                image_game.startAnimation(anim);
            }
        });
    }
}
