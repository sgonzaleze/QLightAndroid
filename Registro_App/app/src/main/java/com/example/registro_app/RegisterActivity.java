package com.example.registro_app;


import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


public class RegisterActivity extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.fragment_register);



   final Button reg_user = findViewById(R.id.btn_register);

   final ImageButton log_activity = findViewById(R.id.log_btn);

   final EditText register_name = findViewById(R.id.register_name);

   final EditText register_email = findViewById(R.id.register_email);

   final EditText register_password = findViewById(R.id.register_password);

   final EditText register_repassword = findViewById(R.id.register_repassword);


    log_activity.setOnClickListener(new View.OnClickListener(){
        public void onClick(View view){
            Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(i);
            finish();
        }
    });


    reg_user.setOnClickListener(new View.OnClickListener()
    {
        public void onClick(View view){
            EditText register_name = findViewById(R.id.register_name);
            String name_register = register_name.getText().toString();


        }
    });



    }
}