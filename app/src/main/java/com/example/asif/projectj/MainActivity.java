package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button mainButtonOne,mainButtonTwo,mainButtonThree,mainButtonFour,mainButtonFive,mainButtonSix;
    Button mainButtonSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //home page activity edittext for clear text



        //Button initialize
        mainButtonOne=findViewById(R.id.main_button_one);
        mainButtonTwo=findViewById(R.id.main_button_two);
        mainButtonThree=findViewById(R.id.main_button_three);
        mainButtonFour=findViewById(R.id.main_button_four);
        mainButtonFive=findViewById(R.id.main_button_five);
        mainButtonSix=findViewById(R.id.main_button_six);
        mainButtonSeven=findViewById(R.id.main_button_seven);



        mainButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainButtonOneActivity.class);
                startActivity(intent);
            }
        });

        mainButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,MainButtonTwoActivity.class);
                startActivity(intent);
            }
        });

        mainButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(MainActivity.this,MainButtonThreeActivity.class);
                startActivity(intent);

            }
        });

        mainButtonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainButtonFourActivity.class);
                startActivity(intent);

            }
        });

        mainButtonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainButtonFiveActivity.class);
                startActivity(intent);

            }
        });

        mainButtonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,MainButttonSixActivity.class);
                startActivity(intent);

            }
        });

        mainButtonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,MainButtonSevenActivity.class);
                startActivity(intent);

            }
        });


    }
}
