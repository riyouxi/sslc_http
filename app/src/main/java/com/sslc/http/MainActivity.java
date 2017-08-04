package com.sslc.http;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.comm.http.TestLib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new TestLib().testSys();
    }
}
