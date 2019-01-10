package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonThreeLevelThreeLevelEight extends AppCompatActivity {

    Button dhornibariUnionKendroOne,dhornibariUnionKendroTwo,dhornibariUnionKendroThree,dhornibariUnionKendroFour,
            dhornibariUnionKendroFive,dhornibariUnionKendroSix,dhornibariUnionKendroSeven,dhornibariUnionKendroEight,
            dhornibariUnionKendroNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_three_level_three_level_eight);

        dhornibariUnionKendroOne=findViewById(R.id.dhornibari_union_kendro_one);
        dhornibariUnionKendroTwo=findViewById(R.id.dhornibari_union_kendro_two);
        dhornibariUnionKendroThree=findViewById(R.id.dhornibari_union_kendro_three);
        dhornibariUnionKendroFour=findViewById(R.id.dhornibari_union_kendro_four);
        dhornibariUnionKendroFive=findViewById(R.id.dhornibari_union_kendro_five);
        dhornibariUnionKendroSix=findViewById(R.id.dhornibari_union_kendro_six);
        dhornibariUnionKendroSeven=findViewById(R.id.dhornibari_union_kendro_seven);
        dhornibariUnionKendroEight=findViewById(R.id.dhornibari_union_kendro_eight);
        dhornibariUnionKendroNine=findViewById(R.id.dhornibari_union_kendro_nine);

        dhornibariUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEight.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৭৮");
                intent.putExtra("Nameandnumber","মোঃ সাজেদুর রহমান  ০১৭১৭৭২৯৩৭২");
                intent.putExtra("Mobile","০১৭১৭৭২৯৩৭২");
                startActivity(intent);

            }
        });

        dhornibariUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEight.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৭৯");
                intent.putExtra("Nameandnumber","জনাব মিজানুর রহমান  ০১৭১৮৬৪৮৯৪৯");
                intent.putExtra("Mobile","০১৭১৮৬৪৮৯৪৯");
                startActivity(intent);

            }
        });

        dhornibariUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEight.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৮০");
                intent.putExtra("Nameandnumber","জনাব হামিদুল ইসলাম  ০১৭৫০৫৩১৬৪১");
                intent.putExtra("Mobile","০১৭৫০৫৩১৬৪১");
                startActivity(intent);

            }
        });

        dhornibariUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEight.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৮১");
                intent.putExtra("Nameandnumber","জনাব রফিকুল ইসলাম আকন্দ  ০১৭১২২৪৮৯৪৩");
                intent.putExtra("Mobile","০১৭১২২৪৮৯৪৩");
                startActivity(intent);

            }
        });

        dhornibariUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEight.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৮২");
                intent.putExtra("Nameandnumber","সুদর্শন কুমার সরকার  ০১৭২৩১৫০৫৩৭");
                intent.putExtra("Mobile","০১৭২৩১৫০৫৩৭");
                startActivity(intent);

            }
        });

        dhornibariUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEight.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৮৩");
                intent.putExtra("Nameandnumber","জনাব আব্দুস শহীদ চৌধুর  ০১৭৫১০০০৪০০");
                intent.putExtra("Mobile","০১৭৫১০০০৪০০");
                startActivity(intent);

            }
        });

        dhornibariUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEight.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৮৪");
                intent.putExtra("Nameandnumber","মোঃ আব্দুর রহিম সরকার  ০১৭১০১৪৪১২৩");
                intent.putExtra("Mobile","০১৭১০১৪৪১২৩");
                startActivity(intent);

            }
        });

        dhornibariUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEight.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৮৫");
                intent.putExtra("Nameandnumber","মনোরঞ্জন রায়  ০১৭৩৫৭৪০৪৩০");
                intent.putExtra("Mobile","০১৭৩৫৭৪০৪৩০");
                startActivity(intent);

            }
        });

        dhornibariUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEight.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৮৬");
                intent.putExtra("Nameandnumber","মনোরঞ্জন রায়  ০১৭৩৫৭৪০৪৩০");
                intent.putExtra("Mobile","০১৭৩৫৭৪০৪৩০");
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
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelEight.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
