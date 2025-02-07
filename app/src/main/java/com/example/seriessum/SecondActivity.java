package com.example.seriessum;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView result = findViewById(R.id.result);

        Intent intent = getIntent();
        double res = intent.getDoubleExtra("EXTRA_DOUBLE", 0.0);
        result.setText(String.valueOf(res));
    }
}