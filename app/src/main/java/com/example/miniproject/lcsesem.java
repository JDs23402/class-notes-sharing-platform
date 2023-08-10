package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lcsesem extends AppCompatActivity {

    Button btnback,btnlogout,btnsem5,btnsem6;

    Integer clickCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lcsesem);
        BindUiElement();

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(lcsesem.this, LoginActivity.class));
                }
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(lcsesem.this, branchL.class));
                }
            }
        });

        btnsem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(lcsesem.this, lcssem5.class));
                }
            }
        });
        btnsem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(lcsesem.this, lcssem6.class));
                }
            }
        });/*

        btnsem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(csesem.this, cssem2.class));
                }
            }
        });
        btnsem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(csesem.this, cssem3.class));
                }
            }
        });
        btnsem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(csesem.this, cssem4.class));
                }
            }
        });
        btnsem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(csesem.this, cssem5.class));
                }
            }
        });
        btnsem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(csesem.this, cssem6.class));
                }
            }
        });
        btnsem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(csesem.this, cssem7.class));
                }
            }
        });
        btnsem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(csesem.this, cssem8.class));
                }
            }
        });*/


    }

    private void BindUiElement() {

        btnback = (Button) findViewById(R.id.back);
        btnlogout = (Button) findViewById(R.id.logout);
        btnsem5 = (Button) findViewById(R.id.s5);
        btnsem6 = (Button) findViewById(R.id.s6);
    }
}