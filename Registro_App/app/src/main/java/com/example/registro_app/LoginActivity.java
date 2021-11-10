package com.example.registro_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class LoginActivity extends AppCompatActivity {
    ImageButton registeractivity;

    Button log_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_login);

        final EditText log_user =findViewById(R.id.login_email);

        final EditText log_password = findViewById(R.id.login_password);



            log_btn = (Button) findViewById(R.id.btn_login);

           registeractivity = findViewById(R.id.reg_activity);

        registeractivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
                finish();
            }
        });

        log_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent i = new Intent(LoginActivity.this,MainMenuActivity.class);
                startActivity(i);

            }

        });
    }
}