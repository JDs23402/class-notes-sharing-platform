package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lecsem6 extends AppCompatActivity {

    Button btnback,btnlogout,btnsub1,btnsub2;
    Integer clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecsem6);
        BindUiElement();

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(lecsem6.this, LoginActivity.class));
                }
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clickCount<2){
                    startActivity(new Intent(lecsem6.this, lecesem.class));
                }
            }
        });

        btnsub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=XBbCfOcLgxI");
            }
        });

        btnsub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=gkikO8KDOGU");
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
        btnsub1 = (Button) findViewById(R.id.s61);
        btnsub2 = (Button) findViewById(R.id.s62);
    }
}