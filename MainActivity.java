package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));
        //User can tap the button
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //to change the text color
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.yellow));
            }
        });

        //User can tap a button
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_blue));
            }
        });

        findViewById(R.id.changeText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setText("Android is awesome!");
            }
        });

        //User can tap on the background color view to reset all views to default
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1. Reset the text to default
                textView.setText("Hello from Mark");
                //2. Reset the color to the original text format
                textView.setTextColor(getResources().getColor(R.color.black));
                //3. Rest the background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.white));
            }
        });

    }
}