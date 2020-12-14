package com.example.android.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

   Button buttonAdd, buttonSubtract, buttonMultiply, buttonDivide;
   EditText number1Edit, number2Edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = (Button) findViewById(R.id.add);
        buttonSubtract = (Button) findViewById(R.id.subtract);
        buttonDivide = (Button) findViewById(R.id.divide);
        buttonMultiply = (Button) findViewById(R.id.multiply);
        number1Edit = (EditText) findViewById(R.id.input_name1);
        number2Edit = (EditText) findViewById(R.id.input_name2);
    }
}