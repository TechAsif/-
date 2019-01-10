package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonThreeLevelThreeLevelNine extends AppCompatActivity {

    Button pandulUnionKendroOne,pandulUnionKendroTwo,pandulUnionKendroThree,pandulUnionKendroFour,
            pandulUnionKendroFive,pandulUnionKendroSix,pandulUnionKendroSeven,pandulUnionKendroEight,
            pandulUnionKendroNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_three_level_three_level_nine);

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
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelNine.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৮৭");
                intent.putExtra("Nameandnumber","মোঃ সানারুল হক মন্ডল  ০১৭৪৫৬৪৬২৩৭");
                intent.putExtra("Mobile","০১৭৪৫৬৪৬২৩৭");
                startActivity(intent);

            }
        });

        pandulUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelNine.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৮৮");
                intent.putExtra("Nameandnumber","মো: রফিকুল ইসলাম  ০১৭১৩৩৩৩০৯");
                intent.putExtra("Mobile","০১৭১৩৩৩৩০৯");
                startActivity(intent);

            }
        });

        pandulUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelNine.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৮৯");
                intent.putExtra("Nameandnumber","মিঃ হাফিজুর রহমান  ০১৭১০০৪৯৪৫৫");
                intent.putExtra("Mobile","০১৭১০০৪৯৪৫৫");
                startActivity(intent);

            }
        });

        pandulUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelNine.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৯০");
                intent.putExtra("Nameandnumber","শেখ সাদী  ০১৭১৮২৮২৬৩১");
                intent.putExtra("Mobile","০১৭১৮২৮২৬৩১");
                startActivity(intent);

            }
        });

        pandulUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelNine.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৯১");
                intent.putExtra("Nameandnumber","আবু মাসুদ মোঃ জাহিদ হাসান  ০১৭৩১৯৩০৯১৮");
                intent.putExtra("Mobile","০১৭৩১৯৩০৯১৮");
                startActivity(intent);

            }
        });

        pandulUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelNine.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৯২");
                intent.putExtra("Nameandnumber","মোঃ মেজবাহুল হক  ০১৭১১০২৪৬০১");
                intent.putExtra("Mobile","০১৭১১০২৪৬০১");
                startActivity(intent);

            }
        });

        pandulUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelNine.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৯৩");
                intent.putExtra("Nameandnumber","জনাব মোজাফ্ফর হোসেন  ০১৭১২৪৮১২১৮");
                intent.putExtra("Mobile","০১৭১২৪৮১২১৮");
                startActivity(intent);

            }
        });

        pandulUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelNine.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৯৪");
                intent.putExtra("Nameandnumber","জনাব মোঃ জাহিদুল ইসলাম  ০১৭৩৭০৬৯০১৮");
                intent.putExtra("Mobile","০১৭৩৭০৬৯০১৮");
                startActivity(intent);

            }
        });

        pandulUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelNine.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৯৫");
                intent.putExtra("Nameandnumber","জনাব মুহাম্মদ লিটন মিয়া  ০১৭৫৯১০৯৫৬২");
                intent.putExtra("Mobile","০১৭৫৯১০৯৫৬২");
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
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelNine.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
