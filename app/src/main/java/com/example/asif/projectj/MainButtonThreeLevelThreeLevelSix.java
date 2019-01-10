package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonThreeLevelThreeLevelSix extends AppCompatActivity {

    Button doldoliaUnionKendroOne,doldoliaUnionKendroTwo,doldoliaUnionKendroThree,doldoliaUnionKendroFour,
            doldoliaUnionKendroFive,doldoliaUnionKendroSix,doldoliaUnionKendroSeven,doldoliaUnionKendroEight,
            doldoliaUnionKendroNine,doldoliaUnionKendroTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_three_level_three_level_six);


        doldoliaUnionKendroOne=findViewById(R.id.doldolia_union_kendro_one);
        doldoliaUnionKendroTwo=findViewById(R.id.doldolia_union_kendro_two);
        doldoliaUnionKendroThree=findViewById(R.id.doldolia_union_kendro_three);
        doldoliaUnionKendroFour=findViewById(R.id.doldolia_union_kendro_four);
        doldoliaUnionKendroFive=findViewById(R.id.doldolia_union_kendro_five);
        doldoliaUnionKendroSix=findViewById(R.id.doldolia_union_kendro_six);
        doldoliaUnionKendroSeven=findViewById(R.id.doldolia_union_kendro_seven);
        doldoliaUnionKendroEight=findViewById(R.id.doldolia_union_kendro_eight);
        doldoliaUnionKendroNine=findViewById(R.id.doldolia_union_kendro_nine);
        doldoliaUnionKendroTen=findViewById(R.id.doldolia_union_kendro_ten);



        doldoliaUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSix.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৫৯");
                intent.putExtra("Nameandnumber","জনাব চন্দন কুমার সরকার  ০১৭৩৪৩০৩৪২৯");
                intent.putExtra("Mobile","০১৭৩৪৩০৩৪২৯");
                startActivity(intent);

            }
        });

        doldoliaUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSix.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৬০");
                intent.putExtra("Nameandnumber","জনাব মোঃ শাহিন মিয়া  ০১৭৩৮১১৩৪৯১");
                intent.putExtra("Mobile","০১৭৩৮১১৩৪৯১");
                startActivity(intent);

            }
        });

        doldoliaUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSix.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৬১");
                intent.putExtra("Nameandnumber","মিঃ আব্দুস সোবহান  ০১৭৬৫৯০৬৬২৬");
                intent.putExtra("Mobile","০১৭৬৫৯০৬৬২৬");
                startActivity(intent);

            }
        });

        doldoliaUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSix.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৬২");
                intent.putExtra("Nameandnumber","জনাব নুরননবী মিঞা  ০১৭১৪৭৬৩৩৫০");
                intent.putExtra("Mobile","০১৭১৪৭৬৩৩৫০");
                startActivity(intent);

            }
        });

        doldoliaUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSix.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৬৩");
                intent.putExtra("Nameandnumber","মোঃ আবু সালেক বুলবুল  ০১৭১৮৮৯৮৭৮০");
                intent.putExtra("Mobile","০১৭১৮৮৯৮৭৮০");
                startActivity(intent);

            }
        });

        doldoliaUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSix.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৬৪");
                intent.putExtra("Nameandnumber","মোঃ ফরহাদ হোসেন খন্দকার  ০১৭৫৪০৩৪১১২");
                intent.putExtra("Mobile","০১৭৫৪০৩৪১১২");
                startActivity(intent);

            }
        });

        doldoliaUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSix.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৬৫");
                intent.putExtra("Nameandnumber","জনাব ইউসুব আলী সরকার  ০১৭২২২৫৪৮৯৯");
                intent.putExtra("Mobile","০১৭২২২৫৪৮৯৯");
                startActivity(intent);

            }
        });

        doldoliaUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSix.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৬৬");
                intent.putExtra("Nameandnumber","জনাব অখিল কুমার দাস  ০১৭১৮৯৩৩৯৭১");
                intent.putExtra("Mobile","০১৭১৮৯৩৩৯৭১");
                startActivity(intent);

            }
        });

        doldoliaUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSix.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৬৭");
                intent.putExtra("Nameandnumber","জনাব শহীদুল্ল্যাহ সরকার  ০১৭১৮৯৩৩৬৩৭");
                intent.putExtra("Mobile","০১৭১৮৯৩৩৬৩৭");
                startActivity(intent);

            }
        });

        doldoliaUnionKendroTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSix.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৬৮");
                intent.putExtra("Nameandnumber","জনাব খোরশেদ আলম  ০১৭১০২৬৫৪২৪");
                intent.putExtra("Mobile","০১৭১০২৬৫৪২৪");
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
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelSix.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
