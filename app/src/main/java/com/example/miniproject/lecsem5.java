package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lecsem5 extends AppCompatActivity {

    Button btnback,btnlogout,btnsub1,btnsub2;
    Integer clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecsem5);
        BindUiElement();

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(lecsem5.this, LoginActivity.class));
                }
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(lecsem5.this, lecesem.class));
                }
            }
        });

        btnsub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=wxgWYMD5HXk&list=PL3eEXnCBViH_SHbBWMfIqsCa9V32wiRvY");
            }
        });

        btnsub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=cIH5o7wYNzs&list=PLXOYj6DUOGrpVb7_cCB1pZuGH4BFlp61B");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void BindUiElement() {

        btnback = (Button) findViewById(R.id.back);
        btnlogout = (Button) findViewById(R.id.logout);
        btnsub1 = (Button) findViewById(R.id.s51);
        btnsub2 = (Button) findViewById(R.id.s52);
    }
}