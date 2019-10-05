package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void currencyConvert(View view)
    {

        EditText editText = (EditText) findViewById(R.id.editText);
        String amountInDollars=editText.getText().toString();
        Double amountInDollarsDouble=Double.parseDouble(amountInDollars);
        Double amountInRuppesDouble= amountInDollarsDouble*71.93;
        String amountInRuppesString=Double.toString(amountInRuppesDouble);
        Toast.makeText(this, amountInDollars+" dollars is "+amountInRuppesString+" Ruppes", Toast.LENGTH_LONG).show();


        Log.i("INFO",editText.getText().toString() );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
