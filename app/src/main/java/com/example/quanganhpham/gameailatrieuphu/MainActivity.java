package com.example.quanganhpham.gameailatrieuphu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_start;
    Button button_exit;
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
    }
}
