package com.example.stringformatter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import static com.example.stringformatter.Stack.reverse;

public class MainActivity extends AppCompatActivity {
EditText editTextTextPersonName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);

        StringBuffer s= new StringBuffer("abc");

        reverse(s);
        System.out.println(s);
        editTextTextPersonName.setText(""+s);
    }
}