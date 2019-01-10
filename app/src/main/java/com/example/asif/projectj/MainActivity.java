package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mainButtonOneNew, mainButtonOne,mainButtonTwo,mainButtonThree,mainButtonFour,mainButtonFive,mainButtonSix;
    Button mainButtonSeven,nirbachonTodontoCommity,inovisionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //home page activity edittext for clear text



        //Button initialize
        mainButtonOneNew=findViewById(R.id.main_button_one_new);
        mainButtonOne=findViewById(R.id.main_button_one);
        mainButtonTwo=findViewById(R.id.main_button_two);
        mainButtonThree=findViewById(R.id.main_button_three);
        mainButtonFour=findViewById(R.id.main_button_four);
        mainButtonFive=findViewById(R.id.main_button_five);
        mainButtonSix=findViewById(R.id.main_button_six);
        mainButtonSeven=findViewById(R.id.main_button_seven);
        nirbachonTodontoCommity=findViewById(R.id.nirbachon_todonto_comity);
        inovisionButton=findViewById(R.id.inovision_team_button);



        inovisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainButtonEight.class);
                startActivity(intent);
            }
        });





        mainButtonOneNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,NirbachonAcoronBidhimala.class);
                startActivity(intent);
            }
        });




        mainButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainButtonOneActivity.class);
                startActivity(intent);
            }
        });

        nirbachonTodontoCommity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NirbachonTodontoCommityList.class);
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

    ///set menu with java file
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.about:
                Intent intent=new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
