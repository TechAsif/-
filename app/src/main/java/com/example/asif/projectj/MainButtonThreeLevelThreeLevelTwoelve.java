package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonThreeLevelThreeLevelTwoelve extends AppCompatActivity {

    Button bojraUnionKendroOne,bojraUnionKendroTwo,bojraUnionKendroThree,bojraUnionKendroFour,
            bojraUnionKendroFive,bojraUnionKendroSix,bojraUnionKendroSeven,bojraUnionKendroEight,
            bojraUnionKendroNine,bojraUnionKendroTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_three_level_three_level_twoelve);

        bojraUnionKendroOne=findViewById(R.id.bojra_union_kendro_one);
        bojraUnionKendroTwo=findViewById(R.id.bojra_union_kendro_two);
        bojraUnionKendroThree=findViewById(R.id.bojra_union_kendro_three);
        bojraUnionKendroFour=findViewById(R.id.bojra_union_kendro_four);
        bojraUnionKendroFive=findViewById(R.id.bojra_union_kendro_five);
        bojraUnionKendroSix=findViewById(R.id.bojra_union_kendro_six);
        bojraUnionKendroSeven=findViewById(R.id.bojra_union_kendro_seven);
        bojraUnionKendroEight=findViewById(R.id.bojra_union_kendro_eight);
        bojraUnionKendroNine=findViewById(R.id.bojra_union_kendro_nine);
        bojraUnionKendroTen=findViewById(R.id.bojra_union_kendro_ten);


        bojraUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwoelve.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১১৪");
                intent.putExtra("Nameandnumber","অমল চন্দ্র মন্ডল  ০১৭২০৯২৯৩৬২");
                intent.putExtra("Mobile","০১৭২০৯২৯৩৬২");
                startActivity(intent);

            }
        });

        bojraUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwoelve.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১১৫");
                intent.putExtra("Nameandnumber","আবু হেনা মুস্তফা  ০১৭১৪৭৬৩১৯০");
                intent.putExtra("Mobile","০১৭১৪৭৬৩১৯০");
                startActivity(intent);

            }
        });

        bojraUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwoelve.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১১৬");
                intent.putExtra("Nameandnumber","মোঃ আমজাদ হোসেন  ০১৭২৪২২২৪৬৯");
                intent.putExtra("Mobile","০১৭২৪২২২৪৬৯");
                startActivity(intent);

            }
        });

        bojraUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwoelve.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১১৭");
                intent.putExtra("Nameandnumber","সরকার মওদুদ  ০১৭৪৫২৩০৮৮৭");
                intent.putExtra("Mobile","০১৭৪৫২৩০৮৮৭");
                startActivity(intent);

            }
        });

        bojraUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwoelve.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১১৮");
                intent.putExtra("Nameandnumber","মোঃ জিয়াউল হক  ০১৭৩৭১৭৫৬৮৫");
                intent.putExtra("Mobile","০১৭৩৭১৭৫৬৮৫");
                startActivity(intent);

            }
        });

        bojraUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwoelve.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১১৯");
                intent.putExtra("Nameandnumber","মোঃ আমিনুল ইসলাম  ০১৭২১০২২১৭৪");
                intent.putExtra("Mobile","০১৭২১০২২১৭৪");
                startActivity(intent);

            }
        });

        bojraUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwoelve.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১২০");
                intent.putExtra("Nameandnumber","মোঃ হামিদুল ইসলাম  ০১৭২৪২২২১৯৫");
                intent.putExtra("Mobile","০১৭২৪২২২১৯৫");
                startActivity(intent);

            }
        });

        bojraUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwoelve.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১২১");
                intent.putExtra("Nameandnumber","মোঃ জাহাঙ্গীর আলম  ০১৭২৪৫১২৭৭০");
                intent.putExtra("Mobile","০১৭২৪৫১২৭৭০");
                startActivity(intent);

            }
        });

        bojraUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwoelve.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১২২");
                intent.putExtra("Nameandnumber","আলী মুহাম্মদ মুসা  ০১৭১৫১৭১৭৩৮");
                intent.putExtra("Mobile","০১৭১৫১৭১৭৩৮");
                startActivity(intent);

            }
        });


        bojraUnionKendroTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwoelve.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১২৩");
                intent.putExtra("Nameandnumber","মোঃ জামাল উদ্দিন  ০১৭১৫২৭০৬৯৩");
                intent.putExtra("Mobile","০১৭১৫২৭০৬৯৩");
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
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwoelve.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
