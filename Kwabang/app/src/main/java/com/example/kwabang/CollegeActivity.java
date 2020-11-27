package com.example.kwabang;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CollegeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college);

        Button collegeButton1 = (Button) findViewById(R.id.collegebtn1);
        collegeButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), ElecActivity.class);
                startActivity(intent);
            }
        });

        Button collegeButton2 = (Button) findViewById(R.id.collegebtn2);
        collegeButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), SoftActivity.class);
                startActivity(intent);
            }
        });

        Button collegeButton3 = (Button) findViewById(R.id.collegebtn3);
        collegeButton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), EnginActivity.class);
                startActivity(intent);
            }
        });

        Button collegeButton4 = (Button) findViewById(R.id.collegebtn4);
        collegeButton4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), NaturalActivity.class);
                startActivity(intent);
            }
        });

        Button collegeButton5 = (Button) findViewById(R.id.collegebtn5);
        collegeButton5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), SocialActivity.class);
                startActivity(intent);
            }
        });

        Button collegeButton6 = (Button) findViewById(R.id.collegebtn6);
        collegeButton6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), LawActivity.class);
                startActivity(intent);
            }
        });

        Button collegeButton7 = (Button) findViewById(R.id.collegebtn7);
        collegeButton7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), BusinessActivity.class);
                startActivity(intent);
            }
        });
    }
}