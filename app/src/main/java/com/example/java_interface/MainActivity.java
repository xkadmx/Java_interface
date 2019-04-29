package com.example.java_interface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.graphics.Color;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout zuzaslayout = new RelativeLayout(this);
        zuzaslayout.setBackgroundColor(Color.BLUE);

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );


        Button redButton = new Button(this);
        redButton.setText("Click me, boss");
        redButton.setBackgroundColor(Color.GRAY);

        zuzaslayout.addView(redButton);
        setContentView(zuzaslayout);
    }
}
