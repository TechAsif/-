package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonSixLevelTwoelveActivity extends AppCompatActivity {

    Button buraburiUnionKendroOne,buraburiUnionKendroTwo,buraburiUnionKendroThree,buraburiUnionKendroFour,
            buraburiUnionKendroFive,buraburiUnionKendroSix,buraburiUnionKendroSeven,buraburiUnionKendroEight,
            buraburiUnionKendroNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_six_level_twoelve);

        buraburiUnionKendroOne=findViewById(R.id.buraburi_union_kendro_one);
        buraburiUnionKendroTwo=findViewById(R.id.buraburi_union_kendro_two);
        buraburiUnionKendroThree=findViewById(R.id.buraburi_union_kendro_three);
        buraburiUnionKendroFour=findViewById(R.id.buraburi_union_kendro_four);
        buraburiUnionKendroFive=findViewById(R.id.buraburi_union_kendro_five);
        buraburiUnionKendroSix=findViewById(R.id.buraburi_union_kendro_six);
        buraburiUnionKendroSeven=findViewById(R.id.buraburi_union_kendro_seven);
        buraburiUnionKendroEight=findViewById(R.id.buraburi_union_kendro_eight);
        buraburiUnionKendroNine=findViewById(R.id.buraburi_union_kendro_nine);






        buraburiUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoelveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.742560");
                intent.putExtra("Lang","89.683249");
                String title = getResources().getString(R.string.buraburi_kendro_one);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        buraburiUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoelveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.742560");
                intent.putExtra("Lang","89.683249");
                String title = getResources().getString(R.string.buraburi_kendro_two);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        buraburiUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoelveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.728823");
                intent.putExtra("Lang","89.694785");
                String title = getResources().getString(R.string.buraburi_kendro_three);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        buraburiUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoelveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.726837");
                intent.putExtra("Lang","89.688602");
                String title = getResources().getString(R.string.buraburi_kendro_four);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        buraburiUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoelveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.709974");
                intent.putExtra("Lang","89.694313");
                String title = getResources().getString(R.string.buraburi_kendro_five);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        buraburiUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoelveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.722969");
                intent.putExtra("Lang","89.710164");
                String title = getResources().getString(R.string.buraburi_kendro_six);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        buraburiUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoelveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.711445");
                intent.putExtra("Lang","89.674566");
                String title = getResources().getString(R.string.buraburi_kendro_seven);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        buraburiUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoelveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.733222");
                intent.putExtra("Lang","89.675091");
                String title = getResources().getString(R.string.buraburi_kendro_eight);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        buraburiUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelTwoelveActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.719146");
                intent.putExtra("Lang","89.660477");
                String title = getResources().getString(R.string.buraburi_kendro_nine);
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
                Intent intent=new Intent(MainButtonSixLevelTwoelveActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
