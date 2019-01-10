package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonSixLevelElevenActivity extends AppCompatActivity {

    Button begomgonjUnionKendroOne,begomgonjUnionKendroTwo,begomgonjUnionKendroThree,begomgonjUnionKendroFour,
            begomgonjUnionKendroFive,begomgonjUnionKendroSix,begomgonjUnionKendroSeven,begomgonjUnionKendroEight,
            begomgonjUnionKendroNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_six_level_eleven);

        begomgonjUnionKendroOne=findViewById(R.id.begomgonj_union_kendro_one);
        begomgonjUnionKendroTwo=findViewById(R.id.begomgonj_union_kendro_two);
        begomgonjUnionKendroThree=findViewById(R.id.begomgonj_union_kendro_three);
        begomgonjUnionKendroFour=findViewById(R.id.begomgonj_union_kendro_four);
        begomgonjUnionKendroFive=findViewById(R.id.begomgonj_union_kendro_five);
        begomgonjUnionKendroSix=findViewById(R.id.begomgonj_union_kendro_six);
        begomgonjUnionKendroSeven=findViewById(R.id.begomgonj_union_kendro_seven);
        begomgonjUnionKendroEight=findViewById(R.id.begomgonj_union_kendro_eight);
        begomgonjUnionKendroNine=findViewById(R.id.begomgonj_union_kendro_nine);



        begomgonjUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelElevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.767189");
                intent.putExtra("Lang","89.690374");
                String title = getResources().getString(R.string.begumgong_kendro_one);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        begomgonjUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelElevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.770352");
                intent.putExtra("Lang","89.702429");
                String title = getResources().getString(R.string.begumgong_kendro_two);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        begomgonjUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelElevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.770154");
                intent.putExtra("Lang","89.714259");
                String title = getResources().getString(R.string.begumgong_kendro_three);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        begomgonjUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelElevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.761608");
                intent.putExtra("Lang","89.718782");
                String title = getResources().getString(R.string.begumgong_kendro_four);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        begomgonjUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelElevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.743236");
                intent.putExtra("Lang","89.703386");
                String title = getResources().getString(R.string.begumgong_kendro_five);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        begomgonjUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelElevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.765908");
                intent.putExtra("Lang","89.730055");
                String title = getResources().getString(R.string.begumgong_kendro_six);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        begomgonjUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelElevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.773962");
                intent.putExtra("Lang","89.728081");
                String title = getResources().getString(R.string.begumgong_kendro_seven);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        begomgonjUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelElevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.742199");
                intent.putExtra("Lang","89.725587");
                String title = getResources().getString(R.string.begumgong_kendro_eight);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        begomgonjUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelElevenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.729705");
                intent.putExtra("Lang","89.765335");
                String title = getResources().getString(R.string.begumgong_kendro_nine);
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
                Intent intent=new Intent(MainButtonSixLevelElevenActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
