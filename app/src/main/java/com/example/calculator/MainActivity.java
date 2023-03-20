package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        EditText editText1 = findViewById(R.id.number1);
        EditText editText2 = findViewById(R.id.number2);

        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("num1", editText1.getText().toString());
            intent.putExtra("num2", editText2.getText().toString());
            try {
                intent.putExtra("result", String.valueOf(
                        Integer.parseInt(editText1.getText().toString()) +
                                Integer.parseInt(editText2.getText().toString())));
                startActivity(intent);
            }
            catch (Exception exception){
                Toast.makeText(this, "Заполните поля ввода", Toast.LENGTH_LONG).show();
            }
            });
    }
}