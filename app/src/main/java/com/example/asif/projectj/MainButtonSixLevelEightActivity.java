package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonSixLevelEightActivity extends AppCompatActivity {

    Button dhamsreniUnionKendroOne,dhamsreniUnionKendroTwo,dhamsreniUnionKendroThree,dhamsreniUnionKendroFour,
            dhamsreniUnionKendroFive,dhamsreniUnionKendroSix,dhamsreniUnionKendroSeven,dhamsreniUnionKendroEight,
            dhamsreniUnionKendroNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_six_level_eight);

        dhamsreniUnionKendroOne=findViewById(R.id.dhamsreni_union_kendro_one);
        dhamsreniUnionKendroTwo=findViewById(R.id.dhamsreni_union_kendro_two);
        dhamsreniUnionKendroThree=findViewById(R.id.dhamsreni_union_kendro_three);
        dhamsreniUnionKendroFour=findViewById(R.id.dhamsreni_union_kendro_four);
        dhamsreniUnionKendroFive=findViewById(R.id.dhamsreni_union_kendro_five);
        dhamsreniUnionKendroSix=findViewById(R.id.dhamsreni_union_kendro_six);
        dhamsreniUnionKendroSeven=findViewById(R.id.dhamsreni_union_kendro_seven);
        dhamsreniUnionKendroEight=findViewById(R.id.dhamsreni_union_kendro_eight);
        dhamsreniUnionKendroNine=findViewById(R.id.dhamsreni_union_kendro_nine);


        dhamsreniUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelEightActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.655326");
                intent.putExtra("Lang","89.648788");
                String title = getResources().getString(R.string.dhamsreni_kendro_one);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        dhamsreniUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelEightActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.658498");
                intent.putExtra("Lang","89.639947");
                String title = getResources().getString(R.string.dhamsreni_kendro_two);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        dhamsreniUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelEightActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.655326");
                intent.putExtra("Lang","89.648788");
                String title = getResources().getString(R.string.dhamsreni_kendro_three);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        dhamsreniUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelEightActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.673350");
                intent.putExtra("Lang","89.661097");
                String title = getResources().getString(R.string.dhamsreni_kendro_four);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        dhamsreniUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelEightActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.656249");
                intent.putExtra("Lang","89.668300");
                String title = getResources().getString(R.string.dhamsreni_kendro_five);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        dhamsreniUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelEightActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.469874");
                intent.putExtra("Lang","89.662329");
                String title = getResources().getString(R.string.dhamsreni_kendro_six);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        dhamsreniUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelEightActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.648982");
                intent.putExtra("Lang","89.649892");
                String title = getResources().getString(R.string.dhamsreni_kendro_seven);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        dhamsreniUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelEightActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.640504");
                intent.putExtra("Lang","89.649112");
                String title = getResources().getString(R.string.dhamsreni_kendro_eight);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        dhamsreniUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelEightActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.644920");
                intent.putExtra("Lang","89.634336");
                String title = getResources().getString(R.string.dhamsreni_kendro_nine);
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
                Intent intent=new Intent(MainButtonSixLevelEightActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
