package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonSevenLevelSixLevelTwo extends AppCompatActivity {

    Button ulipurPowrosovaVumiOfficeStaf,gunaigasUnionVumiOfficeStaf,tobokpurUnionVumiOfficeStaf,
            tethraiUnionVumiOfficeStaf,durgapurUnionVumiOfficeStaf,
            doldoliaUnionVumiOfficeStaf,dhamsreniUnionVumiOfficeStaf,
            dharnibariUnionVumiOfficeStaf,pandulUnionVumiOfficeStaf,
            begumgonjUnionVumiOfficeStaf,buraburiUnionVumiOfficeStaf,
            bojraUnionVumiOfficeStaf,hatiaUnionVumiOfficeStaf,
            saheberalgaVumiOfficeStaf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_seven_level_six_level_two);

        ulipurPowrosovaVumiOfficeStaf=findViewById(R.id.ulipur_powrosova_vumi_office_staf);
        gunaigasUnionVumiOfficeStaf=findViewById(R.id.gunaigas_union_vumi_office_staf);
        tobokpurUnionVumiOfficeStaf=findViewById(R.id.tobokpur_union_vumi_office_staf);
        tethraiUnionVumiOfficeStaf=findViewById(R.id.tethrai_union_vumi_office_staf);
        durgapurUnionVumiOfficeStaf=findViewById(R.id.durgapur_union_vumi_office_staf);
        doldoliaUnionVumiOfficeStaf=findViewById(R.id.doldolia_union_vumi_office_staf);
        dhamsreniUnionVumiOfficeStaf=findViewById(R.id.dhamsreni_union_vumi_office_staf);
        dharnibariUnionVumiOfficeStaf=findViewById(R.id.dhornibari_union_vumi_office_staf);
        begumgonjUnionVumiOfficeStaf=findViewById(R.id.begum_gonj_union_vumi_office_staf);
        pandulUnionVumiOfficeStaf=findViewById(R.id.pandul_union_vumi_office_staf);
        buraburiUnionVumiOfficeStaf=findViewById(R.id.buraburi_union_vumi_office_staf);
        bojraUnionVumiOfficeStaf=findViewById(R.id.bojra_union_vumi_office_staf);
        hatiaUnionVumiOfficeStaf=findViewById(R.id.hatia_union_vumi_office_staf);
        saheberalgaVumiOfficeStaf=findViewById(R.id.saheberalga_union_vumi_office_staf);





        ulipurPowrosovaVumiOfficeStaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenLevelSixLevelTwo.this,UlipurPowrosovaVumiOfficeStaf.class);
                startActivity(intent);
            }
        });

        gunaigasUnionVumiOfficeStaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenLevelSixLevelTwo.this,GuniagasUnionVumiOfficeStaf.class);
                startActivity(intent);
            }
        });

        tobokpurUnionVumiOfficeStaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenLevelSixLevelTwo.this,TobokpurUnionVumiOfficeStaf.class);
                startActivity(intent);
            }
        });

        tethraiUnionVumiOfficeStaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenLevelSixLevelTwo.this,TethraiUnionVumiOfficeStaf.class);
                startActivity(intent);
            }
        });

        durgapurUnionVumiOfficeStaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenLevelSixLevelTwo.this,DurgapurUnionVumiOfficeStaf.class);
                startActivity(intent);
            }
        });

        doldoliaUnionVumiOfficeStaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenLevelSixLevelTwo.this,DoldoliaUnionVumiOfficeStaf.class);
                startActivity(intent);
            }
        });

        dhamsreniUnionVumiOfficeStaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenLevelSixLevelTwo.this,DhamsreniUnionVumiOfficeStaf.class);
                startActivity(intent);
            }
        });

        dharnibariUnionVumiOfficeStaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenLevelSixLevelTwo.this,DharnibariUnionVumiOfficeStaf.class);
                startActivity(intent);
            }
        });

        pandulUnionVumiOfficeStaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenLevelSixLevelTwo.this,PandulUnionVumiOfficeStaf.class);
                startActivity(intent);
            }
        });

        begumgonjUnionVumiOfficeStaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenLevelSixLevelTwo.this,BegomgonjUnionVumiOfficeStaf.class);
                startActivity(intent);
            }
        });

        buraburiUnionVumiOfficeStaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenLevelSixLevelTwo.this,BuraburiUnionVumiOfficeStaf.class);
                startActivity(intent);
            }
        });

        bojraUnionVumiOfficeStaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenLevelSixLevelTwo.this,BojraUnionVumiOfficeStaf.class);
                startActivity(intent);
            }
        });

        hatiaUnionVumiOfficeStaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenLevelSixLevelTwo.this,HatiaUnionVumiOfficeStaf.class);
                startActivity(intent);
            }
        });

        saheberalgaVumiOfficeStaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenLevelSixLevelTwo.this,SaheberAlgaUnionVumiOfficeStaf.class);
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
                Intent intent=new Intent(MainButtonSevenLevelSixLevelTwo.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
