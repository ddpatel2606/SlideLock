package com.lovely3x.slidelock.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View mLockView1;
    private View mLockView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        mLockView1 = findViewById(R.id.uv_activity_main_1);
        mLockView2 = findViewById(R.id.uv_activity_main_2);
    }

}
