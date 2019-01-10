package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonSixLevelTherteenActivity extends AppCompatActivity {

    Button bojraUnionKendroOne,bojraUnionKendroTwo,bojraUnionKendroThree,bojraUnionKendroFour,
            bojraUnionKendroFive,bojraUnionKendroSix,bojraUnionKendroSeven,bojraUnionKendroEight,
            bojraUnionKendroNine,bojraUnionKendroTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_six_level_therteen);

        bojraUnionKendroOne=findViewById(R.id.bojra_union_kendro_one);
        bojraUnionKendroTwo=findViewById(R.id.bojra_union_kendro_two);
        bojraUnionKendroThree=findViewById(R.id.bojra_union_kendro_three);
        bojraUnionKendroFour=findViewById(R.id.bojra_union_kendro_four);
        bojraUnionKendroFive=findViewById(R.id.bojra_union_kendro_five);
        bojraUnionKendroSix=findViewById(R.id.bojra_union_kendro_six);
        bojraUnionKendroSeven=findViewById(R.id.bojra_union_kendro_seven);
        bojraUnionKendroEight=findViewById(R.id.bojra_union_kendro_eight);
        bojraUnionKendroNine=findViewById(R.id.bojra_union_kendro_nine);
        bojraUnionKendroTen=findViewById(R.id.bojra_union_kendro_ten);

        bojraUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTherteenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.590705");
                intent.putExtra("Lang","89.595383");
                String title = getResources().getString(R.string.bojra_kendro_one);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        bojraUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTherteenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.596878");
                intent.putExtra("Lang","89.605561");
                String title = getResources().getString(R.string.bojra_kendro_two);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        bojraUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTherteenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.576573");
                intent.putExtra("Lang","89.621947");
                String title = getResources().getString(R.string.bojra_kendro_three);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        bojraUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTherteenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.601605");
                intent.putExtra("Lang","89.590922");
                String title = getResources().getString(R.string.bojra_kendro_four);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        bojraUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTherteenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.60751");
                intent.putExtra("Lang","89.5596036");
                String title = getResources().getString(R.string.bojra_kendro_five);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        bojraUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTherteenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.596878");
                intent.putExtra("Lang","89.605561");
                String title = getResources().getString(R.string.bojra_kendro_six);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        bojraUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTherteenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.589967");
                intent.putExtra("Lang","89.584162");
                String title = getResources().getString(R.string.bojra_kendro_seven);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        bojraUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTherteenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.584743");
                intent.putExtra("Lang","89.598940");
                String title = getResources().getString(R.string.bojra_kendro_eight);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        bojraUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTherteenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.587078");
                intent.putExtra("Lang","89.592735");
                String title = getResources().getString(R.string.bojra_kendro_nine);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });


        bojraUnionKendroTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTherteenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.2796");
                intent.putExtra("Lang","89.599632");
                String title = getResources().getString(R.string.bojra_kendro_ten);
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
                Intent intent=new Intent(MainButtonSixLevelTherteenActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
