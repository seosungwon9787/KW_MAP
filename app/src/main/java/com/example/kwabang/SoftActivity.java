package com.example.kwabang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoftActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soft);

        Button softButton1 = (Button) findViewById(R.id.softbtn1);
        softButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ec%86%8c%ed%94%84%ed%8a%b8%ec%9b%a8%ec%96%b4%ed%95%99%eb%b6%80/"));
                startActivity(intent);
            }
        });

        Button softButton2 = (Button) findViewById(R.id.softbtn2);
        softButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ec%bb%b4%ed%93%a8%ed%84%b0%ec%a0%95%eb%b3%b4%ea%b3%b5%ed%95%99%eb%b6%80/"));
                startActivity(intent);
            }
        });

        Button softButton3 = (Button) findViewById(R.id.softbtn3);
        softButton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kwabang.website/%ec%a0%95%eb%b3%b4%ec%9c%b5%ed%95%a9%ed%95%99%eb%b6%80/"));
                startActivity(intent);
            }
        });
    }
}