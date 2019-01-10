package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonSixLevelFiveActivity extends AppCompatActivity {

    Button tethraiUnionKendroOne,tethraiUnionKendroTwo,tethraiUnionKendroThree,tethraiUnionKendroFour,
            tethraiUnionKendroFive,tethraiUnionKendroSix,tethraiUnionKendroSeven,tethraiUnionKendroEight,
            tethraiUnionKendroNine,tethraiUnionKendroTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_six_level_five);

        tethraiUnionKendroOne=findViewById(R.id.tethrai_union_kendro_one);
        tethraiUnionKendroTwo=findViewById(R.id.tethrai_union_kendro_two);
        tethraiUnionKendroThree=findViewById(R.id.tethrai_union_kendro_three);
        tethraiUnionKendroFour=findViewById(R.id.tethrai_union_kendro_four);
        tethraiUnionKendroFive=findViewById(R.id.tethrai_union_kendro_five);
        tethraiUnionKendroSix=findViewById(R.id.tethrai_union_kendro_six);
        tethraiUnionKendroSeven=findViewById(R.id.tethrai_union_kendro_seven);
        tethraiUnionKendroEight=findViewById(R.id.tethrai_union_kendro_eight);
        tethraiUnionKendroNine=findViewById(R.id.tethrai_union_kendro_nine);
        tethraiUnionKendroTen=findViewById(R.id.tethrai_union_kendro_ten);



        tethraiUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFiveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.690004");
                intent.putExtra("Lang","89.543277");
                String title = getResources().getString(R.string.tethrai_kendro_one);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tethraiUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFiveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.676248");
                intent.putExtra("Lang","89.530636");
                String title = getResources().getString(R.string.tethrai_kendro_two);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tethraiUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFiveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.664137");
                intent.putExtra("Lang","89.537361");
                String title = getResources().getString(R.string.tethrai_kendro_three);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tethraiUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFiveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.65077");
                intent.putExtra("Lang","89.545353");
                String title = getResources().getString(R.string.tethrai_kendro_four);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tethraiUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFiveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.671249");
                intent.putExtra("Lang","89.555468");
                String title = getResources().getString(R.string.tethrai_kendro_five);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tethraiUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFiveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.670775");
                intent.putExtra("Lang","89.550880");
                String title = getResources().getString(R.string.tethrai_kendro_six);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tethraiUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFiveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.666465");
                intent.putExtra("Lang","89.569452");
                String title = getResources().getString(R.string.tethrai_kendro_seven);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tethraiUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFiveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.640602");
                intent.putExtra("Lang","89.555833");
                String title = getResources().getString(R.string.tethrai_kendro_eight);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tethraiUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFiveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.652687");
                intent.putExtra("Lang","89.566510");
                String title = getResources().getString(R.string.tethrai_kendro_nine);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tethraiUnionKendroTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFiveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.665291");
                intent.putExtra("Lang","89.579261");
                String title = getResources().getString(R.string.tethrai_kendro_ten);
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
                Intent intent=new Intent(MainButtonSixLevelFiveActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
