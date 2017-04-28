package com.meiyou.firstplugindemo;

import android.app.Activity;
import android.os.Bundle;

import com.meiyou.firstplugin.Cost;


public class MainActivity extends Activity {

    @Cost
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show();
    }
    @Cost
    public void show() {
        for (int i = 0; i < 100; i++) {

        }
    }
}
