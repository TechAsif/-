package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonSixLevelFifTeenActivity extends AppCompatActivity {

    Button saheberalgaUnionKendroOne,saheberalgaUnionKendroTwo,saheberalgaUnionKendroThree,saheberalgaUnionKendroFour,
            saheberalgaUnionKendroFive,saheberalgaUnionKendroSix,saheberalgaUnionKendroSeven,saheberalgaUnionKendroEight,
            saheberalgaUnionKendroNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_six_level_fif_teen);

        saheberalgaUnionKendroOne=findViewById(R.id.saheberalga_union_kendro_one);
        saheberalgaUnionKendroTwo=findViewById(R.id.saheberalga_union_kendro_two);
        saheberalgaUnionKendroThree=findViewById(R.id.saheberalga_union_kendro_three);
        saheberalgaUnionKendroFour=findViewById(R.id.saheberalga_union_kendro_four);
        saheberalgaUnionKendroFive=findViewById(R.id.saheberalga_union_kendro_five);
        saheberalgaUnionKendroSix=findViewById(R.id.saheberalga_union_kendro_six);
        saheberalgaUnionKendroSeven=findViewById(R.id.saheberalga_union_kendro_seven);
        saheberalgaUnionKendroEight=findViewById(R.id.saheberalga_union_kendro_eight);
        saheberalgaUnionKendroNine=findViewById(R.id.saheberalga_union_kendro_nine);



        saheberalgaUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFifTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.787757");
                intent.putExtra("Lang","89.829512");
                String title = getResources().getString(R.string.saheber_alga_kendro_one);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        saheberalgaUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFifTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.747814");
                intent.putExtra("Lang","89.810396");
                String title = getResources().getString(R.string.saheber_alga_kendro_two);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        saheberalgaUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFifTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.755325");
                intent.putExtra("Lang","89.792286");
                String title = getResources().getString(R.string.saheber_alga_kendro_three);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        saheberalgaUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFifTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.692709");
                intent.putExtra("Lang","89.810258");
                String title = getResources().getString(R.string.saheber_alga_kendro_four);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        saheberalgaUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFifTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.685174");
                intent.putExtra("Lang","89.813730");
                String title = getResources().getString(R.string.saheber_alga_kendro_five);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        saheberalgaUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFifTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.689715");
                intent.putExtra("Lang","89.810784");
                String title = getResources().getString(R.string.saheber_alga_kendro_six);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        saheberalgaUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFifTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.693892");
                intent.putExtra("Lang","89.582717");
                String title = getResources().getString(R.string.saheber_alga_kendro_seven);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        saheberalgaUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFifTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.661601");
                intent.putExtra("Lang","89.787490");
                String title = getResources().getString(R.string.saheber_alga_kendro_eight);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        saheberalgaUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFifTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.700768");
                intent.putExtra("Lang","89.781566");
                String title = getResources().getString(R.string.saheber_alga_kendro_nine);
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
                Intent intent=new Intent(MainButtonSixLevelFifTeenActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
