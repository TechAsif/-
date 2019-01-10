package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonSixLevelFourTeenActivity extends AppCompatActivity {

    Button hatiaUnionKendroOne,hatiaUnionKendroTwo,hatiaUnionKendroThree,hatiaUnionKendroFour,
            hatiaUnionKendroFive,hatiaUnionKendroSix,hatiaUnionKendroSeven,hatiaUnionKendroEight,
            hatiaUnionKendroNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_six_level_four_teen);

        hatiaUnionKendroOne=findViewById(R.id.hatia_union_kendro_one);
        hatiaUnionKendroTwo=findViewById(R.id.hatia_union_kendro_two);
        hatiaUnionKendroThree=findViewById(R.id.hatia_union_kendro_three);
        hatiaUnionKendroFour=findViewById(R.id.hatia_union_kendro_four);
        hatiaUnionKendroFive=findViewById(R.id.hatia_union_kendro_five);
        hatiaUnionKendroSix=findViewById(R.id.hatia_union_kendro_six);
        hatiaUnionKendroSeven=findViewById(R.id.hatia_union_kendro_seven);
        hatiaUnionKendroEight=findViewById(R.id.hatia_union_kendro_eight);
        hatiaUnionKendroNine=findViewById(R.id.hatia_union_kendro_nine);



        hatiaUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.692625");
                intent.putExtra("Lang","89.661046");
                String title = getResources().getString(R.string.hatia_kendro_one);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        hatiaUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.693913");
                intent.putExtra("Lang","89.676964");
                String title = getResources().getString(R.string.hatia_kendro_two);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        hatiaUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.678508");
                intent.putExtra("Lang","89.670978");
                String title = getResources().getString(R.string.hatia_kendro_three);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        hatiaUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.700458");
                intent.putExtra("Lang","89.691363");
                String title = getResources().getString(R.string.hatia_kendro_four);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        hatiaUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.681719");
                intent.putExtra("Lang","89.690332");
                String title = getResources().getString(R.string.hatia_kendro_five);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        hatiaUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.664181");
                intent.putExtra("Lang","89.673117");
                String title = getResources().getString(R.string.hatia_kendro_six);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        hatiaUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.664835");
                intent.putExtra("Lang","89.689087");
                String title = getResources().getString(R.string.hatia_kendro_seven);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        hatiaUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.663397");
                intent.putExtra("Lang","89.694698");
                String title = getResources().getString(R.string.hatia_kendro_eight);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        hatiaUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourTeenActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.663399");
                intent.putExtra("Lang","89.694699");
                String title = getResources().getString(R.string.hatia_kendro_nine);
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
                Intent intent=new Intent(MainButtonSixLevelFourTeenActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
