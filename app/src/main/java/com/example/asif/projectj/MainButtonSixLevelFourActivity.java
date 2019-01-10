package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonSixLevelFourActivity extends AppCompatActivity {

    Button tobokpurUnionKendroOne,tobokpurUnionKendroTwo,tobokpurUnionKendroThree,tobokpurUnionKendroFour,
            tobokpurUnionKendroFive,tobokpurUnionKendroSix,tobokpurUnionKendroSeven,tobokpurUnionKendroEight,
        tobokpurUnionKendroNine,tobokpurUnionKendroTen,tobokpurUnionKendroeleven,tobokpurUnionKendroTwoelve,
            tobokpurUnionKendrotherteen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_six_level_four);

        tobokpurUnionKendroOne=findViewById(R.id.tobokpur_union_kendro_one);
        tobokpurUnionKendroTwo=findViewById(R.id.tobokpur_union_kendro_two);
        tobokpurUnionKendroThree=findViewById(R.id.tobokpur_union_kendro_three);
        tobokpurUnionKendroFour=findViewById(R.id.tobokpur_union_kendro_four);
        tobokpurUnionKendroFive=findViewById(R.id.tobokpur_union_kendro_five);
        tobokpurUnionKendroSix=findViewById(R.id.tobokpur_union_kendro_six);
        tobokpurUnionKendroSeven=findViewById(R.id.tobokpur_union_kendro_seven);
        tobokpurUnionKendroEight=findViewById(R.id.tobokpur_union_kendro_eight);
        tobokpurUnionKendroNine=findViewById(R.id.tobokpur_union_kendro_nine);
        tobokpurUnionKendroTen=findViewById(R.id.tobokpur_union_kendro_ten);
        tobokpurUnionKendroeleven=findViewById(R.id.tobokpur_union_kendro_eleven);
        tobokpurUnionKendroTwoelve=findViewById(R.id.tobokpur_union_kendro_twoelve);
        tobokpurUnionKendrotherteen=findViewById(R.id.tobokpur_union_kendro_therteen);



        tobokpurUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.628243");
                intent.putExtra("Lang","89.617437");
                String title = getResources().getString(R.string.tobokpur_kendro_one);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tobokpurUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.616757");
                intent.putExtra("Lang","89.613999");
                String title = getResources().getString(R.string.tobokpur_kendro_two);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tobokpurUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.609947");
                intent.putExtra("Lang","89.613796");
                String title = getResources().getString(R.string.tobokpur_kendro_three);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tobokpurUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.625559");
                intent.putExtra("Lang","89.648541");
                String title = getResources().getString(R.string.tobokpur_kendro_four);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tobokpurUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.629352");
                intent.putExtra("Lang","89.636607");
                String title = getResources().getString(R.string.tobokpur_kendro_five);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tobokpurUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.623205");
                intent.putExtra("Lang","89.628640");
                String title = getResources().getString(R.string.tobokpur_kendro_six);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tobokpurUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.635900");
                intent.putExtra("Lang","89.623966");
                String title = getResources().getString(R.string.tobokpur_kendro_seven);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tobokpurUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.605015");
                intent.putExtra("Lang","89.622335");
                String title = getResources().getString(R.string.tobokpur_kendro_eight);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tobokpurUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.605374");
                intent.putExtra("Lang","89.622345");
                String title = getResources().getString(R.string.tobokpur_kendro_nine);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tobokpurUnionKendroTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.606169");
                intent.putExtra("Lang","89.639409");
                String title = getResources().getString(R.string.tobokpur_kendro_ten);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tobokpurUnionKendroeleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.606740");
                intent.putExtra("Lang","89.639941");
                String title = getResources().getString(R.string.tobokpur_kendro_eleven);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tobokpurUnionKendroTwoelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.583066");
                intent.putExtra("Lang","89.634180");
                String title = getResources().getString(R.string.tobokpur_kendro_twoelve);
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        tobokpurUnionKendrotherteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSixLevelFourActivity.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.583489");
                intent.putExtra("Lang","89.634384");
                String title = getResources().getString(R.string.tobokpur_kendro_therteen);
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
                Intent intent=new Intent(MainButtonSixLevelFourActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
