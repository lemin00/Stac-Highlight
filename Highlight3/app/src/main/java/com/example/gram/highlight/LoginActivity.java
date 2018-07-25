package com.example.gram.highlight;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.gram.highlight.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class LoginActivity extends AppCompatActivity {
    private ImageButton sign_btn;
    private EditText email_login;
    private EditText pwd_login;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sign_btn = (ImageButton) findViewById(R.id.sign_btn);
        email_login = (EditText) findViewById(R.id.email_join);
        pwd_login = (EditText) findViewById(R.id.pwd_join);

        firebaseAuth = firebaseAuth.getInstance();

        sign_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = email_login.getText().toString().trim();
                String pwd = pwd_login.getText().toString().trim();

                firebaseAuth.signInWithEmailAndPassword(email, pwd)
                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(LoginActivity.this, "로그인 성공", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(LoginActivity.this, MainManuActivity.class);
                                    startActivity(intent);
                                } else {
                                    Toast.makeText(LoginActivity.this, "로그인 오류", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

            }
        });

    }
}