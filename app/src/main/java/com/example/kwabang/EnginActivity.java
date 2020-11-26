package com.example.kwabang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engin);

        Button enginButton1 = (Button) findViewById(R.id.enginbtn1);
        enginButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ea%b1%b4%ec%b6%95%ea%b3%b5%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });

        Button enginButton2 = (Button) findViewById(R.id.enginbtn2);
        enginButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ed%99%98%ea%b2%bd%ea%b3%b5%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });

        Button enginButton3 = (Button) findViewById(R.id.enginbtn3);
        enginButton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ed%99%94%ed%95%99%ea%b3%b5%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });

        Button enginButton4 = (Button) findViewById(R.id.enginbtn4);
        enginButton4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ea%b1%b4%ec%b6%95%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });
    }
}