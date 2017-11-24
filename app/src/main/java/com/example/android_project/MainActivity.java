package com.example.android_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_picture)
    TextView tvPicture;
    @BindView(R.id.bt_chatting)
    Button btChatting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.bt_chatting)
    public void onViewClicked(View view) {
        switch(view.getId()){
            case R.id.bt_chatting:
                Intent intent = new Intent(MainActivity.this, ChattingActivity.class);
                startActivity(intent);
                break;
        }
    }
}
