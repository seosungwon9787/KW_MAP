package com.example.kwabang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law);

        Button lawButton1 = (Button) findViewById(R.id.lawbtn1);
        lawButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ed%96%89%ec%a0%95%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });

        Button lawButton2 = (Button) findViewById(R.id.lawbtn2);
        lawButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%eb%b2%95%ed%95%99%eb%b6%80/"));
                startActivity(intent);
            }
        });

        Button lawButton3 = (Button) findViewById(R.id.lawbtn3);
        lawButton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ea%b5%ad%ec%a0%9c%ed%95%99%eb%b6%80/"));
                startActivity(intent);
            }
        });

        Button lawButton4 = (Button) findViewById(R.id.lawbtn4);
        lawButton4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ec%9e%90%ec%82%b0%ea%b4%80%eb%a6%ac%ed%95%99%ea%b3%bc/"));
                startActivity(intent);
            }
        });
    }
}