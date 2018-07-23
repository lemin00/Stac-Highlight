package com.example.gram.highlight;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void LoginButtonClicked(View v){
        Intent MainIntent = new Intent (getApplicationContext(),MainManuActivity.class);
        startActivity(MainIntent);
    }
}
