package com.example.android_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by JiSeong Nam on 2017-11-25.
 */

public class SignupActivity extends AppCompatActivity {
    Intent intent;
    @BindView(R.id.tv_certify)
    TextView tvCertify;
    @BindView(R.id.bt_certify)
    Button btCertify;
    @BindView(R.id.bt_signup)
    Button btSignup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_certify, R.id.bt_signup})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_certify:
                break;
            case R.id.bt_signup:
                intent = new Intent(SignupActivity.this, HomeActivity.class);
                startActivity(intent);
                break;
        }
    }
}