package com.example.kwabang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SocialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        Button socialButton1 = (Button) findViewById(R.id.socialbtn1);
        socialButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ea%b5%ad%ec%96%b4%ea%b5%ad%eb%ac%b8%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });

        Button socialButton2 = (Button) findViewById(R.id.socialbtn2);
        socialButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ec%98%81%ec%96%b4%ec%82%b0%ec%97%85%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });

        Button socialButton3 = (Button) findViewById(R.id.socialbtn3);
        socialButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%eb%af%b8%eb%94%94%ec%96%b4%ec%bb%a4%eb%ae%a4%eb%8b%88%ec%bc%80%ec%9d%b4%ec%85%98%ed%95%99%eb%b6%80/"));
                startActivity(intent);
            }
        });

        Button socialButton4 = (Button) findViewById(R.id.socialbtn4);
        socialButton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ec%82%b0%ec%97%85%ec%8b%ac%eb%a6%ac%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });

        Button socialButton5 = (Button) findViewById(R.id.socialbtn5);
        socialButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%eb%8f%99%eb%b6%81%ec%95%84%eb%ac%b8%ed%99%94%ec%82%b0%ec%97%85%ed%95%99%eb%b6%80/"));
                startActivity(intent);
            }
        });
    }
}