package com.example.homework2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "button2", Toast.LENGTH_SHORT).show();
                new AlertDialog.Builder(getApplicationContext()).setMessage("Moscow")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).create().show();




            }



        });
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener((View.OnClickListener) button4);

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener((View.OnClickListener) button5);

    }

    private View.OnClickListener button4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "button4", Toast.LENGTH_SHORT).show();
            new AlertDialog.Builder(getApplicationContext()).setMessage("Madrid")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    }).create().show();
        }



    };

    private View.OnClickListener button5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "button5", Toast.LENGTH_SHORT).show();
            new AlertDialog.Builder(getApplicationContext()).setMessage("Barselona")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    }).create().show();
        }



    };


    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "button3", Toast.LENGTH_SHORT).show();
        new AlertDialog.Builder(getApplicationContext()).setMessage("St.Peterburg")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).create().show();
    }
}