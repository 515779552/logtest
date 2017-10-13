package com.blestech.musk.logtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
public class logTestMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_test_main);
        Log.v("logTestMainActivity","enter logTestMainActivity onCreate");

    }
}
