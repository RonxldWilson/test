package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastThat(View view) {
        Toast.makeText(MainActivity.this, "Hello There!", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "This is a New Change", Toast.LENGTH_SHORT).show();
    }
    //Comment
    //comment2
    //new
    //comment 3
}
