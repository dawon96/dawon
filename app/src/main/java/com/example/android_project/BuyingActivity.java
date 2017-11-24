package com.example.android_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 다원 on 2017-11-20.
 */

public class BuyingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buying);

        Intent intent = new Intent();
        intent = getIntent();
    }
}
