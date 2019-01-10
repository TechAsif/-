package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonThreeLevelThreeLevelTen extends AppCompatActivity {

    Button begomgonjUnionKendroOne,begomgonjUnionKendroTwo,begomgonjUnionKendroThree,begomgonjUnionKendroFour,
            begomgonjUnionKendroFive,begomgonjUnionKendroSix,begomgonjUnionKendroSeven,begomgonjUnionKendroEight,
            begomgonjUnionKendroNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_three_level_three_level_ten);

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
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৯৬");
                intent.putExtra("Nameandnumber","জনাব মোঃ হাজজাজ আলী  ০১৭২৭৯৭১১০৪");
                intent.putExtra("Mobile","০১৭২৭৯৭১১০৪");
                startActivity(intent);

            }
        });

        begomgonjUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৯৭");
                intent.putExtra("Nameandnumber","মো: মবনিুল ইসলাম  ০১৮১৮৩৫২৩৫৪");
                intent.putExtra("Mobile","০১৮১৮৩৫২৩৫৪");
                startActivity(intent);

            }
        });

        begomgonjUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৯৮");
                intent.putExtra("Nameandnumber","জনাব মোঃ আশাদুল হাবিব আরিফ  ০১৭৪৪৫৯৮৪৯৪");
                intent.putExtra("Mobile","০১৭৪৪৫৯৮৪৯৪");
                startActivity(intent);

            }
        });

        begomgonjUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৯৯");
                intent.putExtra("Nameandnumber","মোঃ বজলুর রশীদ  ০১৭১২৭৬৮৬৮২");
                intent.putExtra("Mobile","০১৭১২৭৬৮৬৮২");
                startActivity(intent);

            }
        });

        begomgonjUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১০০");
                intent.putExtra("Nameandnumber","মোহাম্মদ আলী বকুল  ০১৭৩৪৮৮৩৩৯৯");
                intent.putExtra("Mobile","০১৭৩৪৮৮৩৩৯৯");
                startActivity(intent);

            }
        });

        begomgonjUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১০১");
                intent.putExtra("Nameandnumber","জনাব মোঃ কবির হোসেন  ০১৭৩৯৭৪৫৫৩৮");
                intent.putExtra("Mobile","০১৭৩৯৭৪৫৫৩৮");
                startActivity(intent);

            }
        });

        begomgonjUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১০২");
                intent.putExtra("Nameandnumber","মো: মিজানুর রহমান  ০১৭২১-৫০৪৬৯৪");
                intent.putExtra("Mobile","০১৭২১-৫০৪৬৯৪");
                startActivity(intent);

            }
        });

        begomgonjUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১০৩");
                intent.putExtra("Nameandnumber","মোঃ রায়হান কবির  ০১৯১৩২১৪৪৭২");
                intent.putExtra("Mobile","০১৯১৩২১৪৪৭২");
                startActivity(intent);

            }
        });

        begomgonjUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১০৪");
                intent.putExtra("Nameandnumber","মোঃ রিয়াজুল হক  ০১৭১৩৭৬৭২৮৪");
                intent.putExtra("Mobile","০১৭১৩৭৬৭২৮৪");
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
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTen.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
