package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonSixLevelTwoActivity extends AppCompatActivity {

    Button ulipurPowrosovaKendroOne,ulipurPowrosovaKendroTwo,ulipurPowrosovaKendroThree,
    ulipurPowrosovaKendroFour,ulipurPowrosovaKendroFive,ulipurPowrosovaKendroSix,
    ulipurPowrosovaKendroSeven,ulipurPowrosovaKendroEight,ulipurPowrosovaKendroNine,
    ulipurPowrosovaKendroTen,ulipurPowrosovaKendroEleven,ulipurPowrosovaKendroTwoelve,
    ulipurPowrosovaKendroTherteen,ulipurPowrosovaKendroFourteen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_six_level_two);

        ulipurPowrosovaKendroOne =findViewById(R.id.ulipur_powrosova_kendro_one);
        ulipurPowrosovaKendroTwo =findViewById(R.id.ulipur_powrosova_kendro_two);
        ulipurPowrosovaKendroThree =findViewById(R.id.ulipur_powrosova_kendro_three);
        ulipurPowrosovaKendroFour =findViewById(R.id.ulipur_powrosova_kendro_four);
        ulipurPowrosovaKendroFive =findViewById(R.id.ulipur_powrosova_kendro_five);
        ulipurPowrosovaKendroSix =findViewById(R.id.ulipur_powrosova_kendro_six);
        ulipurPowrosovaKendroSeven =findViewById(R.id.ulipur_powrosova_kendro_seven);
        ulipurPowrosovaKendroEight =findViewById(R.id.ulipur_powrosova_kendro_eight);
        ulipurPowrosovaKendroNine =findViewById(R.id.ulipur_powrosova_kendro_nine);
        ulipurPowrosovaKendroTen =findViewById(R.id.ulipur_powrosova_kendro_ten);
        ulipurPowrosovaKendroEleven =findViewById(R.id.ulipur_powrosova_kendro_eleven);
        ulipurPowrosovaKendroTwoelve =findViewById(R.id.ulipur_powrosova_kendro_twoelve);
        ulipurPowrosovaKendroTherteen =findViewById(R.id.ulipur_powrosova_kendro_therteen);
        ulipurPowrosovaKendroFourteen =findViewById(R.id.ulipur_powrosova_kendro_fourteen);


        ulipurPowrosovaKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.677631");
                intent.putExtra("Lang","89.572255");
                String title = getResources().getString(R.string.ulipur_kendro_one);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.692289");
                intent.putExtra("Lang","89.592043");
                String title = getResources().getString(R.string.ulipur_kendro_two);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.683647");
                intent.putExtra("Lang","89.600050");
                String title = getResources().getString(R.string.ulipur_kendro_three);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.672216");
                intent.putExtra("Lang","89.595261");
                String title = getResources().getString(R.string.ulipur_kendro_four);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.660294");
                intent.putExtra("Lang","89.598798");
                String title = getResources().getString(R.string.ulipur_kendro_five);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.694269");
                intent.putExtra("Lang","89.612370");
                String title = getResources().getString(R.string.ulipur_kendro_six);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.671552");
                intent.putExtra("Lang","89.617664");
                String title = getResources().getString(R.string.ulipur_kendro_seven);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.662177");
                intent.putExtra("Lang","89.618549");
                String title = getResources().getString(R.string.ulipur_kendro_eight);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.660133");
                intent.putExtra("Lang","89.617390");
                String title = getResources().getString(R.string.ulipur_kendro_nine);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.640687");
                intent.putExtra("Lang","89.617905");
                String title = getResources().getString(R.string.ulipur_kendro_ten);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.654860");
                intent.putExtra("Lang","89.614816");
                String title = getResources().getString(R.string.ulipur_kendro_eleven);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroTwoelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.654794");
                intent.putExtra("Lang","89.615567");
                String title = getResources().getString(R.string.ulipur_kendro_twoelve);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroTherteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.647142");
                intent.putExtra("Lang","89.629265");
                String title = getResources().getString(R.string.ulipur_kendro_therteen);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroFourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.677631");
                intent.putExtra("Lang","89.572255");
                String title = getResources().getString(R.string.ulipur_kendro_fourteen);
                intent.putExtra("Title","Missing Information");
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
                Intent intent=new Intent(MainButtonSixLevelTwoActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
