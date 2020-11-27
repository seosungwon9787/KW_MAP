package com.example.kwabang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BusinessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);

        Button businessButton1 = (Button) findViewById(R.id.businessbtn1);
        businessButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ea%b2%bd%ec%98%81%ed%95%99%eb%b6%80/"));
                startActivity(intent);
            }
        });

        Button businessButton2 = (Button) findViewById(R.id.businessbtn2);
        businessButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ea%b5%ad%ec%a0%9c%ed%86%b5%ec%83%81%ed%95%99%eb%b6%80/"));
                startActivity(intent);
            }
        });
    }
}