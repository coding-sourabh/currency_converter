package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view)
    {
        Log.i("info","Button pressed");
        EditText amount = (EditText) findViewById(R.id.amount);

        String amountInDollar = amount.getText().toString();
        double amountInDollarDouble = Double.parseDouble(amountInDollar); // convert string into double for calculation

        double amountInRupee = amountInDollarDouble * 70.0;
//        String amountInRupeeString = Double.toString(amountInRupee); // Another way to do that

        String amountInRupeeString = String.format("%.2f" , amountInRupee); // convert back to strung for printing

        Toast.makeText(this , "$ " + amountInDollar + " is " + amountInRupeeString , Toast.LENGTH_LONG).show();
        Log.i("values",amountInRupeeString);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}