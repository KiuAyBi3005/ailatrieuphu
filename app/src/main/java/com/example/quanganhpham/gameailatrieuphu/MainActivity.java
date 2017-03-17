package com.example.quanganhpham.gameailatrieuphu;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.button_exit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
                builder.setTitle("Warning");
                builder.setMessage("Do you want to exit the app?");
                builder.setCancelable(false);
                builder.setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

    }


    //public View.OnClickListener click_exit = new View.OnClickListener() {
    //    @Override
    //    public void onClick(View view) {
    //        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
    //        alertDialogBuilder.setMessage("Are you sure you want to exit ?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
    //            @Override
    //            public void onClick(DialogInterface dialogInterface, int i) {
    //                System.exit(0);
    //            }
    //        })
    //                .setNegativeButton("No", new DialogInterface.OnClickListener() {
    //                    @Override
    //                    public void onClick(DialogInterface dialogInterface, int i) {
    //                        dialogInterface.cancel();
    //                    }
    //                });
    //        AlertDialog alertDialog = alertDialogBuilder.create();
    //    }
    //};
}

