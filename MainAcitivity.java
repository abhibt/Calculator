package com.helloworld.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void promt (View view){
        Toast.makeText(this, "This is Test App", Toast.LENGTH_SHORT).show();

        //This function adds a simple feedback about an operation in a small popup

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}