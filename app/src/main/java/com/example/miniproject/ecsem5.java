package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ecsem5 extends AppCompatActivity {

    Button btnback,btnlogout,btnsub1,btnsub2;
    Integer clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecsem5);
        BindUiElement();

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(ecsem5.this, LoginActivity.class));
                }
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(ecsem5.this, ecesem.class));
                }
            }
        });

        btnsub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ecsem5.this, uec51.class));
            }
        });

        btnsub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ecsem5.this, uec52.class));
            }
        });
    }

    private void BindUiElement() {

        btnback = (Button) findViewById(R.id.back);
        btnlogout = (Button) findViewById(R.id.logout);
        btnsub1 = (Button) findViewById(R.id.s51);
        btnsub2 = (Button) findViewById(R.id.s52);
    }
}