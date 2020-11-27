package com.example.kwabang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NaturalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natural);

        Button naturalButton1 = (Button) findViewById(R.id.naturalbtn1);
        naturalButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ec%88%98%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });

        Button naturalButton2 = (Button) findViewById(R.id.naturalbtn2);
        naturalButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ed%99%94%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });

        Button naturalButton3 = (Button) findViewById(R.id.naturalbtn3);
        naturalButton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ec%a0%84%ec%9e%90%eb%b0%94%ec%9d%b4%ec%98%a4%eb%ac%bc%eb%a6%ac%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });

        Button naturalButton4 = (Button) findViewById(R.id.naturalbtn4);
        naturalButton4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ec%8a%a4%ed%8f%ac%ec%b8%a0%ec%9c%b5%ed%95%a9%ea%b3%bc%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });

        Button naturalButton5 = (Button) findViewById(R.id.naturalbtn5);
        naturalButton5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ec%a0%95%eb%b3%b4%ec%bd%98%ed%85%90%ec%b8%a0%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });
    }
}