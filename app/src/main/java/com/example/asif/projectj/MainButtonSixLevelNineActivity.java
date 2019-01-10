package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonSixLevelNineActivity extends AppCompatActivity {

    Button dhornibariUnionKendroOne,dhornibariUnionKendroTwo,dhornibariUnionKendroThree,dhornibariUnionKendroFour,
            dhornibariUnionKendroFive,dhornibariUnionKendroSix,dhornibariUnionKendroSeven,dhornibariUnionKendroEight,
            dhornibariUnionKendroNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_six_level_nine);

        dhornibariUnionKendroOne=findViewById(R.id.dhornibari_union_kendro_one);
        dhornibariUnionKendroTwo=findViewById(R.id.dhornibari_union_kendro_two);
        dhornibariUnionKendroThree=findViewById(R.id.dhornibari_union_kendro_three);
        dhornibariUnionKendroFour=findViewById(R.id.dhornibari_union_kendro_four);
        dhornibariUnionKendroFive=findViewById(R.id.dhornibari_union_kendro_five);
        dhornibariUnionKendroSix=findViewById(R.id.dhornibari_union_kendro_six);
        dhornibariUnionKendroSeven=findViewById(R.id.dhornibari_union_kendro_seven);
        dhornibariUnionKendroEight=findViewById(R.id.dhornibari_union_kendro_eight);
        dhornibariUnionKendroNine=findViewById(R.id.dhornibari_union_kendro_nine);



        dhornibariUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelNineActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.700648");
                intent.putExtra("Lang","89.618927");
                String title = getResources().getString(R.string.dhornibari_kendro_one);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        dhornibariUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelNineActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.710059");
                intent.putExtra("Lang","89.657931");
                String title = getResources().getString(R.string.dhornibari_kendro_two);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        dhornibariUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelNineActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.7120059");
                intent.putExtra("Lang","89.657931");
                String title = getResources().getString(R.string.dhornibari_kendro_three);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        dhornibariUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelNineActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.684330");
                intent.putExtra("Lang","89.631991");
                String title = getResources().getString(R.string.dhornibari_kendro_four);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        dhornibariUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelNineActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.674657");
                intent.putExtra("Lang","89.627991");
                String title = getResources().getString(R.string.dhornibari_kendro_five);
                intent.putExtra("Title","Missing");
                startActivity(intent);

            }
        });

        dhornibariUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelNineActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.680400");
                intent.putExtra("Lang","89.6442");
                String title = getResources().getString(R.string.dhornibari_kendro_six);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        dhornibariUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelNineActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.684933");
                intent.putExtra("Lang","89.646482");
                String title = getResources().getString(R.string.dhornibari_kendro_seven);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        dhornibariUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelNineActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.684136");
                intent.putExtra("Lang","89.662577");
                String title = getResources().getString(R.string.dhornibari_kendro_eight);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        dhornibariUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelNineActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.673338");
                intent.putExtra("Lang","89.640251");
                String title = getResources().getString(R.string.dhornibari_kendro_nine);
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
                Intent intent=new Intent(MainButtonSixLevelNineActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
