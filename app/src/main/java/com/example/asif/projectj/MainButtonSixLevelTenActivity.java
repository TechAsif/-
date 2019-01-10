package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonSixLevelTenActivity extends AppCompatActivity {

    Button pandulUnionKendroOne,pandulUnionKendroTwo,pandulUnionKendroThree,pandulUnionKendroFour,
            pandulUnionKendroFive,pandulUnionKendroSix,pandulUnionKendroSeven,pandulUnionKendroEight,
            pandulUnionKendroNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_six_level_ten);


        pandulUnionKendroOne=findViewById(R.id.pandul_union_kendro_one);
        pandulUnionKendroTwo=findViewById(R.id.pandul_union_kendro_two);
        pandulUnionKendroThree=findViewById(R.id.pandul_union_kendro_three);
        pandulUnionKendroFour=findViewById(R.id.pandul_union_kendro_four);
        pandulUnionKendroFive=findViewById(R.id.pandul_union_kendro_five);
        pandulUnionKendroSix=findViewById(R.id.pandul_union_kendro_six);
        pandulUnionKendroSeven=findViewById(R.id.pandul_union_kendro_seven);
        pandulUnionKendroEight=findViewById(R.id.pandul_union_kendro_eight);
        pandulUnionKendroNine=findViewById(R.id.pandul_union_kendro_nine);



        pandulUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.737298");
                intent.putExtra("Lang","89.604533");
                String title = getResources().getString(R.string.pandul_kendro_one);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        pandulUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.722848");
                intent.putExtra("Lang","89.599910");
                String title = getResources().getString(R.string.pandul_kendro_two);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        pandulUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.723155");
                intent.putExtra("Lang","89.601550");
                String title = getResources().getString(R.string.pandul_kendro_three);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        pandulUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.717571");
                intent.putExtra("Lang","89.586333");
                String title = getResources().getString(R.string.pandul_kendro_four);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        pandulUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.710198");
                intent.putExtra("Lang","89.578379");
                String title = getResources().getString(R.string.pandul_kendro_five);
                intent.putExtra("Title","Missing");
                startActivity(intent);

            }
        });

        pandulUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.709568");
                intent.putExtra("Lang","89.596698");
                String title = getResources().getString(R.string.pandul_kendro_six);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        pandulUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.703411");
                intent.putExtra("Lang","89.601018");
                String title = getResources().getString(R.string.pandul_kendro_seven);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        pandulUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.703911");
                intent.putExtra("Lang","89.610609");
                String title = getResources().getString(R.string.pandul_kendro_eight);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        pandulUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.71210");
                intent.putExtra("Lang","89.621152");
                String title = getResources().getString(R.string.pandul_kendro_nine);
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
                Intent intent=new Intent(MainButtonSixLevelTenActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
