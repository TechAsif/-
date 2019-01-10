package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonThreeLevelThreeLevelSeven extends AppCompatActivity {

    Button dhamsreniUnionKendroOne,dhamsreniUnionKendroTwo,dhamsreniUnionKendroThree,dhamsreniUnionKendroFour,
            dhamsreniUnionKendroFive,dhamsreniUnionKendroSix,dhamsreniUnionKendroSeven,dhamsreniUnionKendroEight,
            dhamsreniUnionKendroNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_three_level_three_level_seven);

        dhamsreniUnionKendroOne=findViewById(R.id.dhamsreni_union_kendro_one);
        dhamsreniUnionKendroTwo=findViewById(R.id.dhamsreni_union_kendro_two);
        dhamsreniUnionKendroThree=findViewById(R.id.dhamsreni_union_kendro_three);
        dhamsreniUnionKendroFour=findViewById(R.id.dhamsreni_union_kendro_four);
        dhamsreniUnionKendroFive=findViewById(R.id.dhamsreni_union_kendro_five);
        dhamsreniUnionKendroSix=findViewById(R.id.dhamsreni_union_kendro_six);
        dhamsreniUnionKendroSeven=findViewById(R.id.dhamsreni_union_kendro_seven);
        dhamsreniUnionKendroEight=findViewById(R.id.dhamsreni_union_kendro_eight);
        dhamsreniUnionKendroNine=findViewById(R.id.dhamsreni_union_kendro_nine);


        dhamsreniUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSeven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৬৯");
                intent.putExtra("Nameandnumber","মোঃ আসাদুরজামান  ০১৭৩৪৩৮৮৩৬৭");
                intent.putExtra("Mobile","০১৭৩৪৩৮৮৩৬৭");
                startActivity(intent);

            }
        });

        dhamsreniUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSeven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৭০");
                intent.putExtra("Nameandnumber","মোঃ মোস্তফা জামান  ০১৭১৭২৫০৪১৩");
                intent.putExtra("Mobile","০১৭১৭২৫০৪১৩");
                startActivity(intent);

            }
        });

        dhamsreniUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSeven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৭১");
                intent.putExtra("Nameandnumber","মোঃ আল মামুন  ০১৭২৩৫৮৫৩০৪");
                intent.putExtra("Mobile","০১৭২৩৫৮৫৩০৪");
                startActivity(intent);

            }
        });

        dhamsreniUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSeven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৭২");
                intent.putExtra("Nameandnumber","জনাব জুয়েল মিয়া  ০১৭২৩১৫৫৯৫৩");
                intent.putExtra("Mobile","০১৭২৩১৫৫৯৫৩");
                startActivity(intent);

            }
        });

        dhamsreniUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSeven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৭৩");
                intent.putExtra("Nameandnumber","মোঃ কামরুজ্জামান  ০১৭৪৫৮৩২১২৪");
                intent.putExtra("Mobile","০১৭৪৫৮৩২১২৪");
                startActivity(intent);

            }
        });

        dhamsreniUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSeven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৭৪");
                intent.putExtra("Nameandnumber","মোঃ মাহবুবার রহমান সরকার  ০১৭১০৬১০৩১০");
                intent.putExtra("Mobile","০১৭১০৬১০৩১০");
                startActivity(intent);

            }
        });

        dhamsreniUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSeven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৭৫");
                intent.putExtra("Nameandnumber","মোঃ মনিরুজ্জামান  ০১৭০৫৯৫০৫৭৫");
                intent.putExtra("Mobile","০১৭০৫৯৫০৫৭৫");
                startActivity(intent);

            }
        });

        dhamsreniUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSeven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৭৬");
                intent.putExtra("Nameandnumber","জনাব হুমায়ুন কবীর  ০১৭৬৭৫৯২৪২০");
                intent.putExtra("Mobile","০১৭৬৭৫৯২৪২০");
                startActivity(intent);

            }
        });

        dhamsreniUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSeven.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৭৭");
                intent.putExtra("Nameandnumber","জনাব মোজাম্মেল হক  ০১৮৭৪০০৯৪৫৬");
                intent.putExtra("Mobile","০১৮৭৪০০৯৪৫৬");
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
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSeven.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
