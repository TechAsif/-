package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonSixLevelThreeActivity extends AppCompatActivity {


    Button gunaigasUnionKendroOne,gunaigasUnionKendroTwo,gunaigasUnionKendroThree,gunaigasUnionKendroFour,
            gunaigasUnionKendroFive,gunaigasUnionKendroSix,gunaigasUnionKendroSeven,gunaigasUnionKendroEight,
            gunaigasUnionKendroNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_six_level_three);

        gunaigasUnionKendroOne=findViewById(R.id.gunaigas_union_kendro_one);
        gunaigasUnionKendroTwo=findViewById(R.id.gunaigas_union_kendro_two);
        gunaigasUnionKendroThree=findViewById(R.id.gunaigas_union_kendro_three);
        gunaigasUnionKendroFour=findViewById(R.id.gunaigas_union_kendro_four);
        gunaigasUnionKendroFive=findViewById(R.id.gunaigas_union_kendro_five);
        gunaigasUnionKendroSix=findViewById(R.id.gunaigas_union_kendro_six);
        gunaigasUnionKendroSeven=findViewById(R.id.gunaigas_union_kendro_seven);
        gunaigasUnionKendroEight=findViewById(R.id.gunaigas_union_kendro_eight);
        gunaigasUnionKendroNine=findViewById(R.id.gunaigas_union_kendro_nine);



        gunaigasUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelThreeActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.641401");
                intent.putExtra("Lang","89.592035");
                String title = getResources().getString(R.string.gunaigas_kendro_one);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        gunaigasUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelThreeActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.640316");
                intent.putExtra("Lang","89.578836");
                String title = getResources().getString(R.string.gunaigas_kendro_two);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        gunaigasUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelThreeActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.655236");
                intent.putExtra("Lang","89.583786");
                String title = getResources().getString(R.string.gunaigas_kendro_three);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        gunaigasUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelThreeActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.637927");
                intent.putExtra("Lang","89.571226");
                String title = getResources().getString(R.string.gunaigas_kendro_four);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        gunaigasUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelThreeActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.624480");
                intent.putExtra("Lang","89.569339");
                String title = getResources().getString(R.string.gunaigas_kendro_five);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        gunaigasUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelThreeActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.628707");
                intent.putExtra("Lang","89.588327");
                String title = getResources().getString(R.string.gunaigas_kendro_six);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        gunaigasUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelThreeActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.620399");
                intent.putExtra("Lang","89.582717");
                String title = getResources().getString(R.string.gunaigas_kendro_seven);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        gunaigasUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelThreeActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.631363");
                intent.putExtra("Lang","89.590069");
                String title = getResources().getString(R.string.gunaigas_kendro_eight);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        gunaigasUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelThreeActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.619045");
                intent.putExtra("Lang","89.599091");
                String title = getResources().getString(R.string.gunaigas_kendro_nine);
                intent.putExtra("Title",title);
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
                Intent intent=new Intent(MainButtonSixLevelThreeActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
