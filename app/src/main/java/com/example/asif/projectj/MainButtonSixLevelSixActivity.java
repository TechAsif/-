package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonSixLevelSixActivity extends AppCompatActivity {

    Button durgapurUnionKendroOne,durgapurUnionKendroTwo,durgapurUnionKendroThree,durgapurUnionKendroFour,
            durgapurUnionKendroFive,durgapurUnionKendroSix,durgapurUnionKendroSeven,durgapurUnionKendroEight,
            durgapurUnionKendroNine,durgapurUnionKendroTen,durgapurUnionKendroEleven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_six_level_six);


        durgapurUnionKendroOne=findViewById(R.id.durgapur_union_kendro_one);
        durgapurUnionKendroTwo=findViewById(R.id.durgapur_union_kendro_two);
        durgapurUnionKendroThree=findViewById(R.id.durgapur_union_kendro_three);
        durgapurUnionKendroFour=findViewById(R.id.durgapur_union_kendro_four);
        durgapurUnionKendroFive=findViewById(R.id.durgapur_union_kendro_five);
        durgapurUnionKendroSix=findViewById(R.id.durgapur_union_kendro_six);
        durgapurUnionKendroSeven=findViewById(R.id.durgapur_union_kendro_seven);
        durgapurUnionKendroEight=findViewById(R.id.durgapur_union_kendro_eight);
        durgapurUnionKendroNine=findViewById(R.id.durgapur_union_kendro_nine);
        durgapurUnionKendroTen=findViewById(R.id.durgapur_union_kendro_ten);
        durgapurUnionKendroEleven=findViewById(R.id.durgapur_union_kendro_eleven);


        durgapurUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSixActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.762212");
                intent.putExtra("Lang","89.626027");
                String title = getResources().getString(R.string.durgapur_kendro_one);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        durgapurUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSixActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.741892");
                intent.putExtra("Lang","89.628892");
                String title = getResources().getString(R.string.durgapur_kendro_two);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        durgapurUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSixActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.739667");
                intent.putExtra("Lang","89.629034");
                String title = getResources().getString(R.string.durgapur_kendro_three);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        durgapurUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSixActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.753211");
                intent.putExtra("Lang","89.649039");
                String title = getResources().getString(R.string.durgapur_kendro_four);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        durgapurUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSixActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.736956");
                intent.putExtra("Lang","89.644227");
                String title = getResources().getString(R.string.durgapur_kendro_five);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        durgapurUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSixActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.745262");
                intent.putExtra("Lang","89.652423");
                String title = getResources().getString(R.string.durgapur_kendro_six);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        durgapurUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSixActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.730238");
                intent.putExtra("Lang","89.652074");
                String title = getResources().getString(R.string.durgapur_kendro_seven);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        durgapurUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSixActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.729452");
                intent.putExtra("Lang","89.621979");
                String title = getResources().getString(R.string.durgapur_kendro_eight);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        durgapurUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSixActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.721527");
                intent.putExtra("Lang","89.645000");
                String title = getResources().getString(R.string.durgapur_kendro_nine);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        durgapurUnionKendroTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSixActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.710486");
                intent.putExtra("Lang","89.634942");
                String title = getResources().getString(R.string.durgapur_kendro_ten);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        durgapurUnionKendroEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelSixActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.716636");
                intent.putExtra("Lang","89.644505");
                String title = getResources().getString(R.string.durgapur_kendro_eleven);
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
                Intent intent=new Intent(MainButtonSixLevelSixActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
