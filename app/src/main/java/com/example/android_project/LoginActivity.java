package com.example.android_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by JiSeong Nam on 2017-11-25.
 */

public class LoginActivity extends AppCompatActivity {

        @BindView(R.id.et_id)
        EditText etId;
        @BindView(R.id.et_pw)
        EditText etPw;
        @BindView(R.id.bt_signin)
        Button btSignin;

        @BindView(R.id.tv_signup)
        TextView tvSignup;

        Intent intent_signin;
        Intent intent_signup;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            ButterKnife.bind(this);

        }

        @OnClick({R.id.bt_signin, R.id.tv_signup})
        public void onViewClicked(View view) {
            switch (view.getId()) {
                case R.id.bt_signin:
                    intent_signin = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent_signin);
                    break;
                case R.id.tv_signup:
                    intent_signup = new Intent(LoginActivity.this, SignupActivity.class);
                    startActivity(intent_signup);
                    break;
            }
        }

    }

