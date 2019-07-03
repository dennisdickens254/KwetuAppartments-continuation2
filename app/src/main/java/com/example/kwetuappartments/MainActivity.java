package com.example.kwetuappartments;

import android.content.Intent;
import android.os.Bundle;

import com.example.kwetuappartments.VI.ViewImage1;
import com.example.kwetuappartments.VI.ViewImage2;
import com.example.kwetuappartments.VI.ViewImage3;
import com.example.kwetuappartments.VI.ViewImage4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnimage1;
    Button btnimage2;
    Button btnimage3;
    Button btnimage4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnimage1 =(Button) findViewById(R.id.btn1);
        btnimage2 =(Button) findViewById(R.id.btn2);
        btnimage3 =(Button) findViewById(R.id.btn3);
        btnimage4 =(Button) findViewById(R.id.btn4);


        btnimage1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this,
                        ViewImage1.class);
                startActivity(j);

            }
        });

        btnimage2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this,
                        ViewImage2.class);
                startActivity(j);

            }
        });

        btnimage3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this,
                        ViewImage3.class);
                startActivity(j);

            }
        });

        btnimage4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this,
                        ViewImage4.class);
                startActivity(j);

            }
        });
    }

}
