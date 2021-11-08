package com.example.registro_app;


import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


public class RegisterActivity extends AppCompatActivity {
ImageButton logactivity;
@Override
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.fragment_register);




    logactivity = findViewById(R.id.log_btn);

    logactivity.setOnClickListener(new View.OnClickListener(){
        public void onClick(View view){
            Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(i);
            finish();
        }
    });
    }
}