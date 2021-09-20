package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText value1,value2;
    Button add;
    Button sub;
    Button mul;
    Button div;
    TextView total;
    double sum;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value1 = findViewById(R.id.edit1);
        value2 = findViewById(R.id.edit2);
        add = findViewById(R.id.btn);
        total = findViewById(R.id.text);
        sub = findViewById(R.id.btn2);
        mul = findViewById(R.id.btn1);
        div = findViewById(R.id.btn3);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(value1.getText().toString());
                double num2 = Double.parseDouble(value2.getText().toString());

                sum = num1+num2;

                total.setText(String.valueOf(sum));
            }

        });
       sub.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               double num1 = Double.parseDouble(value1.getText().toString());
               double num2 = Double.parseDouble(value2.getText().toString());

               sum = num1 - num2;

               total.setText(String.valueOf(sum));

           }
       });
       mul.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               double num1 = Double.parseDouble(value1.getText().toString());
               double num2 = Double.parseDouble(value2.getText().toString());

               sum = num1 * num2;

               total.setText(String.valueOf(sum));

           }
       });
       div.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               double num1 = Double.parseDouble(value1.getText().toString());
               double num2 = Double.parseDouble(value2.getText().toString());

               sum = num1 / num2;

               total.setText(String.valueOf(sum));
           }
       });

    }
}