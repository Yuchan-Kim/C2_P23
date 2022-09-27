package com.example.c2_p23;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View signal = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == 0) {
                    signal.setBackgroundColor(-65536);
                    count = 1;
                } else if (count == 1) {
                    signal.setBackgroundColor(Color.parseColor("#ffff00"));
                    count = 2;
                } else if (count== 2) {
                    signal.setBackgroundColor(-16711936);
                    count = 2;
                }
            }

        });

    }
}