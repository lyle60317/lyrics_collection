package com.example.android.set3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    public void switchpage(View view)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity7.this, MainActivity8.class);
        startActivity(intent);
    }
    public void back(View view)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity7.this, MainActivity6.class);
        startActivity(intent);
    }
    public void menu(View view)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity7.this, Main2Activity.class);
        startActivity(intent);
    }
}
