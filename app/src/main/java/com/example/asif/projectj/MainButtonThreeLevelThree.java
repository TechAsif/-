package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonThreeLevelThree extends AppCompatActivity {

    Button ulipurPowrosovaUnionButtonForPijaidingOfficier,gunaigasUnionButtonForPijaidingOfficier
            ,tobokPurUnionButtonForPijaidingOfficier,tethraiUnionButtonForPijaidingOfficier,durgapurUnionButtonForPijaidingOfficier,
            doldoliaUnionButtonForPijaidingOfficier, dhamsreniUnionButtonForPijaidingOfficier,dharnibariUnionButtonForPijaidingOfficier,
            pandulUnionButtonForPijaidingOfficier,begumgonjUnionButtonForPijaidingOfficier,buraburiUnionButtonForPijaidingOfficier,
            bojraUnionButtonForPijaidingOfficier,hatiaUnionButtonForPijaidingOfficier,saheberalgaUnionButtonForPijaidingOfficier;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_three_level_three);

        ulipurPowrosovaUnionButtonForPijaidingOfficier=findViewById(R.id.ulipur_powrosova_union_button_id_for_pijaiding_officier);
        gunaigasUnionButtonForPijaidingOfficier=findViewById(R.id.gunaigas_union_button_id_for_pijaiding_officier);
        tobokPurUnionButtonForPijaidingOfficier=findViewById(R.id.tobokbur_union_button_id_for_pijaiding_officier);
        tethraiUnionButtonForPijaidingOfficier=findViewById(R.id.tethrai_union_button_id_for_pijaiding_officier);
        durgapurUnionButtonForPijaidingOfficier=findViewById(R.id.durgapur_union_button_id_for_pijaiding_officier);
        doldoliaUnionButtonForPijaidingOfficier=findViewById(R.id.doldolia_union_button_id_for_pijaiding_officier);
        dhamsreniUnionButtonForPijaidingOfficier=findViewById(R.id.dhamsreni_union_button_id_for_pijaiding_officier);
        dharnibariUnionButtonForPijaidingOfficier=findViewById(R.id.dhornibari_union_button_id_for_pijaiding_officier);
        pandulUnionButtonForPijaidingOfficier=findViewById(R.id.pandul_union_button_id_for_pijaiding_officier);
        begumgonjUnionButtonForPijaidingOfficier=findViewById(R.id.begum_union_button_id_for_pijaiding_officier);
        buraburiUnionButtonForPijaidingOfficier=findViewById(R.id.buraburi_union_button_id_for_pijaiding_officier);
        bojraUnionButtonForPijaidingOfficier=findViewById(R.id.bojra_union_button_id_for_pijaiding_officier);
        hatiaUnionButtonForPijaidingOfficier=findViewById(R.id.hatia_union_button_id_for_pijaiding_officier);
        saheberalgaUnionButtonForPijaidingOfficier=findViewById(R.id.saheberalga_union_button_id_for_pijaiding_officier);



        ulipurPowrosovaUnionButtonForPijaidingOfficier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThree.this,MainButtonThreeLevelThreeLevelOne.class);
                startActivity(intent);
            }
        });

        gunaigasUnionButtonForPijaidingOfficier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThree.this,MainButtonThreeLevelThreeLevelTwo.class);
                startActivity(intent);
            }
        });
        tobokPurUnionButtonForPijaidingOfficier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThree.this,MainButtonThreeLevelThreeLevelThree.class);
                startActivity(intent);
            }
        });
        tethraiUnionButtonForPijaidingOfficier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThree.this,MainButtonThreeLevelThreeLevelFour.class);
                startActivity(intent);
            }
        });
        durgapurUnionButtonForPijaidingOfficier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThree.this,MainButtonThreeLevelThreeLevelFive.class);
                startActivity(intent);
            }
        });
        doldoliaUnionButtonForPijaidingOfficier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThree.this,MainButtonThreeLevelThreeLevelSix.class);
                startActivity(intent);
            }
        });
        dhamsreniUnionButtonForPijaidingOfficier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThree.this,MainButtonThreeLevelThreeLevelSeven.class);
                startActivity(intent);
            }
        });
        dharnibariUnionButtonForPijaidingOfficier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThree.this,MainButtonThreeLevelThreeLevelEight.class);
                startActivity(intent);
            }
        });
        pandulUnionButtonForPijaidingOfficier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThree.this,MainButtonThreeLevelThreeLevelNine.class);
                startActivity(intent);
            }
        });
        begumgonjUnionButtonForPijaidingOfficier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThree.this,MainButtonThreeLevelThreeLevelTen.class);
                startActivity(intent);
            }
        });
        buraburiUnionButtonForPijaidingOfficier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThree.this,MainButtonThreeLevelThreeLevelEleven.class);
                startActivity(intent);
            }
        });
        bojraUnionButtonForPijaidingOfficier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThree.this,MainButtonThreeLevelThreeLevelTwoelve.class);
                startActivity(intent);
            }
        });
        hatiaUnionButtonForPijaidingOfficier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThree.this,MainButtonThreeLevelThreeLevelTherteen.class);
                startActivity(intent);
            }
        });
        saheberalgaUnionButtonForPijaidingOfficier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThree.this,MainButtonThreeLevelThreeLevelFourteen.class);
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
                Intent intent=new Intent(MainButtonThreeLevelThree.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
