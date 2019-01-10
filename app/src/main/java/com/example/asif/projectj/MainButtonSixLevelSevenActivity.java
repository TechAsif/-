package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonSixLevelSevenActivity extends AppCompatActivity {

    Button doldoliaUnionKendroOne,doldoliaUnionKendroTwo,doldoliaUnionKendroThree,doldoliaUnionKendroFour,
            doldoliaUnionKendroFive,doldoliaUnionKendroSix,doldoliaUnionKendroSeven,doldoliaUnionKendroEight,
            doldoliaUnionKendroNine,doldoliaUnionKendroTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_six_level_seven);

        doldoliaUnionKendroOne=findViewById(R.id.doldolia_union_kendro_one);
        doldoliaUnionKendroTwo=findViewById(R.id.doldolia_union_kendro_two);
        doldoliaUnionKendroThree=findViewById(R.id.doldolia_union_kendro_three);
        doldoliaUnionKendroFour=findViewById(R.id.doldolia_union_kendro_four);
        doldoliaUnionKendroFive=findViewById(R.id.doldolia_union_kendro_five);
        doldoliaUnionKendroSix=findViewById(R.id.doldolia_union_kendro_six);
        doldoliaUnionKendroSeven=findViewById(R.id.doldolia_union_kendro_seven);
        doldoliaUnionKendroEight=findViewById(R.id.doldolia_union_kendro_eight);
        doldoliaUnionKendroNine=findViewById(R.id.doldolia_union_kendro_nine);
        doldoliaUnionKendroTen=findViewById(R.id.doldolia_union_kendro_ten);



        doldoliaUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.721895");
                intent.putExtra("Lang","89.527684");
                String title = getResources().getString(R.string.doldolia_kendro_one);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        doldoliaUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.712056");
                intent.putExtra("Lang","89.533631");
                String title = getResources().getString(R.string.doldolia_kendro_two);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        doldoliaUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.712664");
                intent.putExtra("Lang","89.540370");
                String title = getResources().getString(R.string.doldolia_kendro_three);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        doldoliaUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.716649");
                intent.putExtra("Lang","89.562826");
                String title = getResources().getString(R.string.doldolia_kendro_four);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        doldoliaUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.716541");
                intent.putExtra("Lang","89.550755");
                String title = getResources().getString(R.string.doldolia_kendro_five);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        doldoliaUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.700269");
                intent.putExtra("Lang","89.552527");
                String title = getResources().getString(R.string.doldolia_kendro_six);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        doldoliaUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.676646");
                intent.putExtra("Lang","89.566581");
                String title = getResources().getString(R.string.doldolia_kendro_seven);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        doldoliaUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.689307");
                intent.putExtra("Lang","89.566521");
                String title = getResources().getString(R.string.doldolia_kendro_eight);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        doldoliaUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.683283");
                intent.putExtra("Lang","89.549312");
                String title = getResources().getString(R.string.doldolia_kendro_nine);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        doldoliaUnionKendroTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.680722");
                intent.putExtra("Lang","89.563454");
                String title = getResources().getString(R.string.doldolia_kendro_ten);
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
                Intent intent=new Intent(MainButtonSixLevelSevenActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
