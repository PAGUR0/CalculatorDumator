package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView text = findViewById(R.id.text);
        Intent intent = getIntent();

        String num1 = intent.getStringExtra("num1");
        String num2 = intent.getStringExtra("num2");
        String num3 = intent.getStringExtra("result");

        if (Integer.parseInt(num2) < 0){
            text.setText(num1 + " + (" + num2 + ") = " + num3);
        }
        else{
            text.setText(num1 + " + " + num2 + " = " + num3);
        }
    }
}