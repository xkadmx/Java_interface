package com.example.java_interface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.graphics.Color;

        C

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout zuzaslayout = new RelativeLayout(this);
        zuzaslayout.setBackgroundColor(Color.BLUE);


        Button redButton = new Button(this);

        zuzaslayout.addView(redButton);
        setContentView(zuzaslayout);
    }
}
