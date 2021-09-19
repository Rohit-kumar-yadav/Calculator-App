package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText value1,value2;
    Button btn;
    TextView total;
    int sum;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value1 = findViewById(R.id.edit1);
        value2 = findViewById(R.id.edit2);
        btn = findViewById(R.id.btn);
        total = findViewById(R.id.text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = value1.getText().toString();
                String num2 = value2.getText().toString();

                sum = Integer.parseInt(num1)+Integer.parseInt(num2);

                total.setText(Integer.toString(sum));
            }
        });





    }
}