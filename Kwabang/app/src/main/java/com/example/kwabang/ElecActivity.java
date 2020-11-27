package com.example.kwabang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elec);

        Button elecButton1 = (Button) findViewById(R.id.elecbtn1);
        elecButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ec%a0%84%ec%9e%90%ea%b3%b5%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });

        Button elecButton2 = (Button) findViewById(R.id.elecbtn2);
        elecButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ec%a0%84%ea%b8%b0%ea%b3%b5%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });

        Button elecButton3 = (Button) findViewById(R.id.elecbtn3);
        elecButton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ec%a0%84%ec%9e%90%ec%9e%ac%eb%a3%8c%ea%b3%b5%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });

        Button elecButton4 = (Button) findViewById(R.id.elecbtn4);
        elecButton4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ec%a0%84%ec%9e%90%ed%86%b5%ec%8b%a0%ea%b3%b5%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });

        Button elecButton5 = (Button) findViewById(R.id.elecbtn5);
        elecButton5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ec%a0%84%ec%9e%90%ec%9c%b5%ed%95%a9%ea%b3%b5%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });

        Button elecButton6 = (Button) findViewById(R.id.elecbtn6);
        elecButton6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%eb%a1%9c%eb%b4%87%ed%95%99%eb%b6%80/"));
                startActivity(intent);
            }
        });
    }
}