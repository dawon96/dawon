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

/**
 * Created by 다원 on 2017-11-20.
 */

public class MypageActivity extends AppCompatActivity {

    @BindView(R.id.tv_mypage_picture)
    TextView tvMypagePicture;
    @BindView(R.id.bt_follow)
    Button btFollow;
    @BindView(R.id.bt_following)
    Button btFollowing;
    @BindView(R.id.bt_selling)
    Button btSelling;
    @BindView(R.id.bt_buying)
    Button btBuying;
    @BindView(R.id.bt_looking)
    Button btLooking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);
        ButterKnife.bind(this);

        btSelling = (Button) findViewById(R.id.bt_selling);
        btBuying = (Button) findViewById(R.id.bt_buying);
        btLooking = (Button) findViewById(R.id.bt_looking);

    }

    @OnClick({R.id.bt_follow, R.id.bt_following, R.id.bt_selling, R.id.bt_buying, R.id.bt_looking})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_follow:
                break;
            case R.id.bt_following:
                break;
            case R.id.bt_selling:
                Intent intent1 = new Intent(MypageActivity.this, SellingActivity.class);
                startActivity(intent1);
                break;
            case R.id.bt_buying:
                Intent intent2 = new Intent(MypageActivity.this, BuyingActivity.class);
                startActivity(intent2);
                break;
            case R.id.bt_looking:
                Intent intent3 = new Intent(MypageActivity.this, LookingActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
