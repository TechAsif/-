package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButttonSixActivity extends AppCompatActivity {


    Button upojelaHeadQuater;


    //        google map union button declare
    Button ulipurPowrosovaUnionButton,gunaigasUnionButton
            ,tobokPurUnionButton,tethraiUnionButton,durgapurUnionButton,
            doldoliaUnionButton, dhamsreniUnionButton,dharnibariUnionButton,
            pandulUnionButton,begumgonjUnionButton,buraburiUnionButton,
            bojraUnionButton,hatiaUnionButton,saheberalgaUnionButton,ghatButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_buttton_six);

        upojelaHeadQuater=findViewById(R.id.upojela_head_quater);
        ghatButton=findViewById(R.id.nodi_parapar_ghat);


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



        upojelaHeadQuater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButttonSixActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.660655");
                intent.putExtra("Lang","89.619350");
                String title = "উপজেলা হেড কোয়াটার";
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        ghatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButttonSixActivity.this,NodiParaParGhatButton.class);
                startActivity(intent);

            }
        });



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
                Intent intent=new Intent(MainButttonSixActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
