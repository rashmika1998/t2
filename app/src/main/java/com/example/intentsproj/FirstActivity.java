package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button button = findViewById(R.id.button);
        final EditText number1 = findViewById(R.id.editText);
        final EditText number2 = findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,message,duration);
                toast.show();
                toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);

                intent.putExtra("NUMBER1",number1.getText().toString());
                intent.putExtra("NUMBER2",number2.getText().toString());

                startActivity(intent);
            }
        });
    }
}
