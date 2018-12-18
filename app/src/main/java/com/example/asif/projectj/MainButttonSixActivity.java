package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainButttonSixActivity extends AppCompatActivity {


    //        google map union button declare
    Button ulipurPowrosovaUnionButton,gunaigasUnionButton
            ,tobokPurUnionButton,tethraiUnionButton,durgapurUnionButton,
            doldoliaUnionButton, dhamsreniUnionButton,dharnibariUnionButton,
            pandulUnionButton,begumgonjUnionButton,buraburiUnionButton,
            bojraUnionButton,hatiaUnionButton,saheberalgaUnionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_buttton_six);


//        google map union button initialize
        ulipurPowrosovaUnionButton=findViewById(R.id.ulipur_powrosova_union_button_id);
        gunaigasUnionButton=findViewById(R.id.gunaigas_union_button_id);
        tobokPurUnionButton=findViewById(R.id.tobokbur_union_button_id);
        tethraiUnionButton=findViewById(R.id.tethrai_union_button_id);
        durgapurUnionButton=findViewById(R.id.durgapur_union_button_id);
        doldoliaUnionButton=findViewById(R.id.doldolia_union_button_id);
        dhamsreniUnionButton=findViewById(R.id.dhamsreni_union_button_id);
        dharnibariUnionButton=findViewById(R.id.dhornibari_union_button_id);
        pandulUnionButton=findViewById(R.id.pandul_union_button_id);
        begumgonjUnionButton=findViewById(R.id.begum_union_button_id);
        buraburiUnionButton=findViewById(R.id.buraburi_union_button_id);
        bojraUnionButton=findViewById(R.id.bojra_union_button_id);
        hatiaUnionButton=findViewById(R.id.hatia_union_button_id);
        saheberalgaUnionButton=findViewById(R.id.saheberalga_union_button_id);



//        when union button is clicked then work


        ulipurPowrosovaUnionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButttonSixActivity.this,MainButtonSixLevelTwoActivity.class);
                startActivity(intent);
            }
        });

        gunaigasUnionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButttonSixActivity.this,MainButtonSixLevelThreeActivity.class);
                startActivity(intent);
            }
        });
        tobokPurUnionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButttonSixActivity.this,MainButtonSixLevelFourActivity.class);
                startActivity(intent);
            }
        });
        tethraiUnionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButttonSixActivity.this,MainButtonSixLevelFiveActivity.class);
                startActivity(intent);
            }
        });
        durgapurUnionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButttonSixActivity.this,MainButtonSixLevelSixActivity.class);
                startActivity(intent);
            }
        });
        doldoliaUnionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButttonSixActivity.this,MainButtonSixLevelSevenActivity.class);
                startActivity(intent);
            }
        });
        dhamsreniUnionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButttonSixActivity.this,MainButtonSixLevelEightActivity.class);
                startActivity(intent);
            }
        });
        dharnibariUnionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButttonSixActivity.this,MainButtonSixLevelNineActivity.class);
                startActivity(intent);
            }
        });
        pandulUnionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButttonSixActivity.this,MainButtonSixLevelTenActivity.class);
                startActivity(intent);
            }
        });
        begumgonjUnionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButttonSixActivity.this,MainButtonSixLevelElevenActivity.class);
                startActivity(intent);
            }
        });
        buraburiUnionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButttonSixActivity.this,MainButtonSixLevelTwoelveActivity.class);
                startActivity(intent);
            }
        });
       bojraUnionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButttonSixActivity.this,MainButtonSixLevelTherteenActivity.class);
                startActivity(intent);
            }
        });
        hatiaUnionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButttonSixActivity.this,MainButtonSixLevelFourTeenActivity.class);
                startActivity(intent);
            }
        });
        saheberalgaUnionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButttonSixActivity.this,MainButtonSixLevelFifTeenActivity.class);
                startActivity(intent);
            }
        });


    }
}
