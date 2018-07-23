package com.example.gram.highlight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }

    public void LoginButtonClicked(View v){
        Intent LoginIntent = new Intent (getApplicationContext(),LoginActivity.class);
        startActivity(LoginIntent);
    }

    public void RegisterButtonClicked(View v){
        Intent RegisterIntent = new Intent (getApplicationContext(),RegisterActivity.class);
        startActivity(RegisterIntent);
    }
}
