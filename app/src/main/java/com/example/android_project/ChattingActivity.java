package com.example.android_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by 다원 on 2017-11-20.
 */

public class ChattingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chattingpage);
        ButterKnife.bind(this);

        Intent intent = new Intent();
        intent = getIntent();
    }
}
