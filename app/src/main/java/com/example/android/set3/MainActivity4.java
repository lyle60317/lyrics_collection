package com.example.android.set3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void switchpage(View view)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity4.this, MainActivity5.class);
        startActivity(intent);
    }
    public void back(View view)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity4.this, MainActivity3.class);
        startActivity(intent);
    }
    public void menu(View view)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity4.this, Main2Activity.class);
        startActivity(intent);
    }
}
