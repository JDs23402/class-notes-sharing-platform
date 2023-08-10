package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lecesem extends AppCompatActivity {

    Button btnback,btnlogout,btnsem5,btnsem6;

    Integer clickCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecesem);
        BindUiElement();

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(lecesem.this, LoginActivity.class));
                }
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(lecesem.this, branchL.class));
                }
            }
        });


        btnsem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(lecesem.this, lecsem5.class));
                }
            }
        });
        btnsem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(lecesem.this, lecsem6.class));
                }
            }
        });



    }

    private void BindUiElement() {

        btnback = (Button) findViewById(R.id.back);
        btnlogout = (Button) findViewById(R.id.logout);
        btnsem5 = (Button) findViewById(R.id.s5);
        btnsem6 = (Button) findViewById(R.id.s6);
    }
}