package com.example.kwetuappartments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {

    EditText etEmail, etPassword;
    TextView tvRegister;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail=(EditText) findViewById(R.id.email);
        etPassword=(EditText) findViewById(R.id.password);
        btnLogin=(Button) findViewById(R.id.btn_login);
        tvRegister=(TextView) findViewById(R.id.register);

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LogInActivity.this,
                        RegisterActivity.class);
                startActivity(i);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent j = new Intent(LogInActivity.this,
                        MainActivity.class);
                startActivity(j);

            }
        });
    }
}
