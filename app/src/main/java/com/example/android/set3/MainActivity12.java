package com.example.android.set3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
    }
    public void switchpage(View view)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity12.this, MainActivity13.class);
        startActivity(intent);
    }
    public void back(View view)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity12.this, MainActivity11.class);
        startActivity(intent);
    }
    public void menu(View view)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity12.this, Main2Activity.class);
        startActivity(intent);
    }
}
