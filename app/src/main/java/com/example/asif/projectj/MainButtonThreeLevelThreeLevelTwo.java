package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonThreeLevelThreeLevelTwo extends AppCompatActivity {

    Button gunaigasUnionKendroOne,gunaigasUnionKendroTwo,gunaigasUnionKendroThree,gunaigasUnionKendroFour,
            gunaigasUnionKendroFive,gunaigasUnionKendroSix,gunaigasUnionKendroSeven,gunaigasUnionKendroEight,
            gunaigasUnionKendroNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_three_level_three_level_two);


        gunaigasUnionKendroOne=findViewById(R.id.gunaigas_union_kendro_one);
        gunaigasUnionKendroTwo=findViewById(R.id.gunaigas_union_kendro_two);
        gunaigasUnionKendroThree=findViewById(R.id.gunaigas_union_kendro_three);
        gunaigasUnionKendroFour=findViewById(R.id.gunaigas_union_kendro_four);
        gunaigasUnionKendroFive=findViewById(R.id.gunaigas_union_kendro_five);
        gunaigasUnionKendroSix=findViewById(R.id.gunaigas_union_kendro_six);
        gunaigasUnionKendroSeven=findViewById(R.id.gunaigas_union_kendro_seven);
        gunaigasUnionKendroEight=findViewById(R.id.gunaigas_union_kendro_eight);
        gunaigasUnionKendroNine=findViewById(R.id.gunaigas_union_kendro_nine);


        gunaigasUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwo.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৫");
                intent.putExtra("Nameandnumber","শাহানাজ বেগম  ০১৭৪৯৪১০৪২০");
                intent.putExtra("Mobile","০১৭৪৯৪১০৪২০");
                startActivity(intent);

            }
        });

        gunaigasUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwo.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৬");
                intent.putExtra("Nameandnumber","মোছাঃ লিপি বেগম  ০১৭২৩৯৭৪১৪১");
                intent.putExtra("Mobile","০১৭২৩৯৭৪১৪১");
                startActivity(intent);

            }
        });

        gunaigasUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwo.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৭");
                intent.putExtra("Nameandnumber","মোঃ আবু বক্কর সিদ্দিক   ০১৭১৮৮৭৭২৪৯");
                intent.putExtra("Mobile","০১৭১৮৮৭৭২৪৯");
                startActivity(intent);

            }
        });

        gunaigasUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwo.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৮");
                intent.putExtra("Nameandnumber","জাহাঙ্গীর হোসাঈন   ০১৭২৫৭৩৬৫৬০");
                intent.putExtra("Mobile","০১৭২৫৭৩৬৫৬০");
                startActivity(intent);

            }
        });

        gunaigasUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwo.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৯");
                intent.putExtra("Nameandnumber","মোঃ নুর-ই-আলম   ০১৭১৮৯১০৪৫৯");
                intent.putExtra("Mobile","০১৭১৮৯১০৪৫৯");
                startActivity(intent);

            }
        });

        gunaigasUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwo.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","২০");
                intent.putExtra("Nameandnumber","জনাব মিজানুর রহমান   ০১৭১৯৩৫৯৫২৬");
                intent.putExtra("Mobile","০১৭১৯৩৫৯৫২৬");
                startActivity(intent);

            }
        });

        gunaigasUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwo.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","২১");
                intent.putExtra("Nameandnumber","মাহফুজুল হাসান   ০১৭২৩৭৬৫২২৯");
                intent.putExtra("Mobile","০১৭২৩৭৬৫২২৯");
                startActivity(intent);

            }
        });

        gunaigasUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwo.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","২২");
                intent.putExtra("Nameandnumber","জনাব নরেন্দ্র নাথ সরকার   ০১৭২২৮৭০৪১৯");
                intent.putExtra("Mobile","০১৭২২৮৭০৪১৯");
                startActivity(intent);

            }
        });

        gunaigasUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwo.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","২৩");
                intent.putExtra("Nameandnumber","মোঃ আতিকুর রহমান   ০১৭৮১১৬৬৯৯৩");
                intent.putExtra("Mobile","০১৭৮১১৬৬৯৯৩");
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
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTwo.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
