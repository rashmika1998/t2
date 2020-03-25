package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    CharSequence message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final EditText editText2 = findViewById(R.id.editText3);
        final EditText editText3 = findViewById(R.id.editText4);
        Button button = findViewById(R.id.btnAdd);
        Button button1 = findViewById(R.id.btnSub);
        Button button2 = findViewById(R.id.btnMul);
        Button button3 = findViewById(R.id.btnDiv);
        final EditText editText4 = findViewById(R.id.editAnswer);

        final double no1,no2,ans;

        Intent intent = getIntent();
        final String number1 = intent.getStringExtra("NUMBER1");
        final String number2 = intent.getStringExtra("NUMBER2");

        editText2.setText(number1);
        editText3.setText(number2);

        no1 = Double.parseDouble(number1);
        no2 = Double.parseDouble(number2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText4.setText(no1 + " + " + no2 + "="  + (no1+no2));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText4.setText(no1 + " - " + no2 + "=" + (no1 - no2));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText4.setText(no1 + " * " + no2 + "=" + (no1 * no2));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText4.setText(no1 + " / " + no2 + "=" + (no1 / no2));
            }
        });
    }
}
