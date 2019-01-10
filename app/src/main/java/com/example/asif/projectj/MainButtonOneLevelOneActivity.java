package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonOneLevelOneActivity extends AppCompatActivity {

    Button ulipurPowrosovaMap,ulipurUpojella;
    Button gunaigasUnionMap,TobokpurUnionMap,TethraiUnionMap,DurgapurUnionMap,
    DoldoliaUnionMap,DhapsreniUnionMap,DhornibariUnionMap,PandulUnionMap,
    BegumgonjUnionMap,BuraburiUnionMap,BojraUnionMap,HatiaUnionMap,
    SaheberAlgaUnionMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_one_level_one);

        ulipurPowrosovaMap=findViewById(R.id.ulipur_powrosove_map);
        ulipurUpojella=findViewById(R.id.ulipur_upojela_map);
        gunaigasUnionMap=findViewById(R.id.gunaigas_union_map);
        TobokpurUnionMap=findViewById(R.id.tobokpur_union_map);
        TethraiUnionMap=findViewById(R.id.tethrai_union_map);
        DurgapurUnionMap=findViewById(R.id.durgapur_union_map);
        DoldoliaUnionMap=findViewById(R.id.doldolia_union_map);
        DhapsreniUnionMap=findViewById(R.id.dhamsreni_union_map);
        DhornibariUnionMap=findViewById(R.id.dhornibari_union_map);
        PandulUnionMap=findViewById(R.id.pandul_union_map);
        BegumgonjUnionMap=findViewById(R.id.begum_gonj_union_map);
        BuraburiUnionMap=findViewById(R.id.buraburi_union_map);
        BojraUnionMap=findViewById(R.id.bojra_union_map);
        HatiaUnionMap=findViewById(R.id.hatia_union_map);
        SaheberAlgaUnionMap=findViewById(R.id.saheberalgaunion_mpa);




        ulipurPowrosovaMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneLevelOneActivity.this,AnaloMap.class);
                startActivity(intent);
            }
        });

        ulipurUpojella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneLevelOneActivity.this,UlipurUpojelaUnionMapActivity.class);
                startActivity(intent);
            }
        });

        gunaigasUnionMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneLevelOneActivity.this,GunaigasUnionMapActivity.class);
                startActivity(intent);
            }
        });

        TobokpurUnionMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneLevelOneActivity.this,TobokpurUnionMapActivity.class);
                startActivity(intent);
            }
        });

        TethraiUnionMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneLevelOneActivity.this,TethraiUnionMapActivity.class);
                startActivity(intent);
            }
        });

        DurgapurUnionMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneLevelOneActivity.this,DurgapurUnionMapActivity.class);
                startActivity(intent);
            }
        });

        DoldoliaUnionMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneLevelOneActivity.this,DoldoliaUnionMapActivity.class);
                startActivity(intent);
            }
        });

        DhapsreniUnionMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneLevelOneActivity.this,DhamsreniUnionMapActivity.class);
                startActivity(intent);
            }
        });

        DhornibariUnionMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneLevelOneActivity.this,DharnibariUnionMapActivity.class);
                startActivity(intent);
            }
        });

        PandulUnionMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneLevelOneActivity.this,PandulUnionMapActivity.class);
                startActivity(intent);
            }
        });

        BegumgonjUnionMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneLevelOneActivity.this,BegomgonjUnionMapActivity.class);
                startActivity(intent);
            }
        });
        BuraburiUnionMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneLevelOneActivity.this,BuraburiUnionMapActivity.class);
                startActivity(intent);
            }
        });

        BojraUnionMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneLevelOneActivity.this,BojraUnionMapActivity.class);
                startActivity(intent);
            }
        });

        HatiaUnionMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneLevelOneActivity.this,HataUnionMapActivity.class);
                startActivity(intent);
            }
        });

        SaheberAlgaUnionMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneLevelOneActivity.this,SaheberAlgaUnionMapActivity.class);
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
                Intent intent=new Intent(MainButtonOneLevelOneActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
