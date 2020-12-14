package com.example.android.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   Button buttonAdd, buttonSubtract, buttonMultiply, buttonDivide;
   EditText number1Edit, number2Edit;
   int num1, num2;
   TextView t1;
   String s1, s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean getNumbers(){
        number1Edit = (EditText) findViewById(R.id.input_name1);
        number2Edit = (EditText) findViewById(R.id.input_name2);
        t1 = (TextView) findViewById(R.id.answer);
        s1 = number1Edit.getText().toString();
        s2 = number2Edit.getText().toString();

        // condition to check if box is not empty
        if ((s1.equals(null) && s2.equals(null))
                || (s1.equals("") && s2.equals(""))) {

            String result = "Please enter a value";
            t1.setText(result);
            return false;
        }
        else {
            // converting string to int.
            num1 = Integer.parseInt(number1Edit.getText().toString());

            // converting string to int.
            num2 = Integer.parseInt(number2Edit.getText().toString());
        }

        return true;
    }

    // a public method to perform addition
    public void doSum(View v)
    {

        // get the input numbers
        if (getNumbers()) {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        }
    }

    // a public method to perform addition
    public void doSub(View v)
    {

        // get the input numbers
        if (getNumbers()) {
            int subtraction = num1 - num2;
            t1.setText(Integer.toString(subtraction));
        }
    }

    // a public method to perform addition
    public void doDiv(View v)
    {

        // get the input numbers
        if (getNumbers()) {
            int division = num1 / num2;
            t1.setText(Integer.toString(division));
        }
    }

    // a public method to perform addition
    public void doMul(View v)
    {

        // get the input numbers
        if (getNumbers()) {
            int Multiply = num1 * num2;
            t1.setText(Integer.toString(Multiply));
        }
    }
}