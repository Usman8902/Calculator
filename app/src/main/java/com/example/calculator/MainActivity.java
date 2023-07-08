package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Add(View v)
    {
        EditText edt1=(EditText) findViewById(R.id.editTextNumber);
        EditText edt2=(EditText) findViewById(R.id.editTextNumber2);
        EditText edt3=(EditText) findViewById(R.id.editTextNumber3);
        int n1=Integer.parseInt(edt1.getText().toString());
        int n2=Integer.parseInt(edt2.getText().toString());
        int results=n1+n2;
        edt3.setText("Sum Value=" + results);
    }

}