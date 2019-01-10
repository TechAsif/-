package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonThreeLevelThreeLevelEleven extends AppCompatActivity {

    Button buraburiUnionKendroOne,buraburiUnionKendroTwo,buraburiUnionKendroThree,buraburiUnionKendroFour,
            buraburiUnionKendroFive,buraburiUnionKendroSix,buraburiUnionKendroSeven,buraburiUnionKendroEight,
            buraburiUnionKendroNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_three_level_three_level_eleven);


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
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEleven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১০৫");
                intent.putExtra("Nameandnumber","মোঃ শাহজাহান আলী  ০১৭১৬৬৪৩৮০৯");
                intent.putExtra("Mobile","০১৭১৬৬৪৩৮০৯");
                startActivity(intent);

            }
        });

        buraburiUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEleven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১০৬");
                intent.putExtra("Nameandnumber","মোঃ জাহিদুল ইসলাম ফারুক  ০১৭১৩৬৩৬৬০৬");
                intent.putExtra("Mobile","০১৭১৩৬৩৬৬০৬");
                startActivity(intent);

            }
        });

        buraburiUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEleven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১০৭");
                intent.putExtra("Nameandnumber","মোঃ আনোয়ারুল ইসলাম  ০১৭২৪২২২১৫২");
                intent.putExtra("Mobile","০১৭২৪২২২১৫২");
                startActivity(intent);

            }
        });

        buraburiUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEleven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১০৮");
                intent.putExtra("Nameandnumber","মোঃ শাহাদৎ হোসেন  ০১৭৯৬৯০৩০১৫");
                intent.putExtra("Mobile","০১৭৯৬৯০৩০১৫");
                startActivity(intent);

            }
        });

        buraburiUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEleven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১০৯");
                intent.putExtra("Nameandnumber","মোঃ এখলাস আলী  ০১৭৩৭৬৫৮৭৯৭");
                intent.putExtra("Mobile","০১৭৩৭৬৫৮৭৯৭");
                startActivity(intent);

            }
        });

        buraburiUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEleven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১১০");
                intent.putExtra("Nameandnumber","নুর মোহাম্মদ আলী  ০১৭৬৭২৭৫৮৭৭");
                intent.putExtra("Mobile","০১৭৬৭২৭৫৮৭৭");
                startActivity(intent);

            }
        });

        buraburiUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEleven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১১১");
                intent.putExtra("Nameandnumber","মোঃ আতিকুর রহমান সরদার  ০১৮৭২০৪৫৭২০");
                intent.putExtra("Mobile","০১৮৭২০৪৫৭২০");
                startActivity(intent);

            }
        });

        buraburiUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEleven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১১২");
                intent.putExtra("Nameandnumber","উৎপল কুমার সরকার  ০১৭১৫৩৫৯৯৮৫");
                intent.putExtra("Mobile","০১৭১৫৩৫৯৯৮৫");
                startActivity(intent);

            }
        });

        buraburiUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEleven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১১৩");
                intent.putExtra("Nameandnumber","মোঃ মফিজুল হক  ০১৭১৫৭৭১৭২৭");
                intent.putExtra("Mobile","০১৭১৫৭৭১৭২৭");
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
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEleven.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
