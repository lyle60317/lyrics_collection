package com.example.android.set3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void switchpage(View view)
    {
        Intent intent = new Intent();
        intent.setClass(Main2Activity.this, MainActivity3.class);
        startActivity(intent);
    }
    public void back(View view)
    {
        Intent intent = new Intent();
        intent.setClass(Main2Activity.this, MainActivity.class);
        startActivity(intent);
    }
    public void switchpage2(View view)
    {
        int btnId = view.getId();
        Intent intent = new Intent();
        switch (btnId) {

            case R.id.page1:
                intent.setClass(Main2Activity.this, MainActivity3.class);
                break;
            case R.id.page2:
                intent.setClass(Main2Activity.this, MainActivity4.class);
                break;
            case R.id.page3:
                intent.setClass(Main2Activity.this, MainActivity5.class);
                break;
            case R.id.page4:
                intent.setClass(Main2Activity.this, MainActivity6.class);
                break;
            case R.id.page5:
                intent.setClass(Main2Activity.this, MainActivity7.class);
                break;
            case R.id.page6:
                intent.setClass(Main2Activity.this, MainActivity8.class);
                break;
            case R.id.page7:
                intent.setClass(Main2Activity.this, MainActivity9.class);
                break;
            case R.id.page8:
                intent.setClass(Main2Activity.this, MainActivity10.class);
                break;
            case R.id.page9:
                intent.setClass(Main2Activity.this, MainActivity11.class);
                break;
            case R.id.page10:
                intent.setClass(Main2Activity.this, MainActivity12.class);
                break;
            case R.id.page11:
                intent.setClass(Main2Activity.this, MainActivity13.class);
                break;
            case R.id.page12:
                intent.setClass(Main2Activity.this, MainActivity14.class);
                break;
            case R.id.page13:
                intent.setClass(Main2Activity.this, MainActivity15.class);
                break;

        }

        startActivity(intent);
    }
}
