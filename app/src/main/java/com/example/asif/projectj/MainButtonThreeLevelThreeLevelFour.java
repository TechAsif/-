package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonThreeLevelThreeLevelFour extends AppCompatActivity {

    Button tethraiUnionKendroOne,tethraiUnionKendroTwo,tethraiUnionKendroThree,tethraiUnionKendroFour,
            tethraiUnionKendroFive,tethraiUnionKendroSix,tethraiUnionKendroSeven,tethraiUnionKendroEight,
            tethraiUnionKendroNine,tethraiUnionKendroTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_three_level_three_level_four);

        tethraiUnionKendroOne=findViewById(R.id.tethrai_union_kendro_one);
        tethraiUnionKendroTwo=findViewById(R.id.tethrai_union_kendro_two);
        tethraiUnionKendroThree=findViewById(R.id.tethrai_union_kendro_three);
        tethraiUnionKendroFour=findViewById(R.id.tethrai_union_kendro_four);
        tethraiUnionKendroFive=findViewById(R.id.tethrai_union_kendro_five);
        tethraiUnionKendroSix=findViewById(R.id.tethrai_union_kendro_six);
        tethraiUnionKendroSeven=findViewById(R.id.tethrai_union_kendro_seven);
        tethraiUnionKendroEight=findViewById(R.id.tethrai_union_kendro_eight);
        tethraiUnionKendroNine=findViewById(R.id.tethrai_union_kendro_nine);
        tethraiUnionKendroTen=findViewById(R.id.tethrai_union_kendro_ten);


        tethraiUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFour.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৩৭");
                intent.putExtra("Nameandnumber","মিজানুর রহমান  ০১৭২২-০৫৪৮৩২");
                intent.putExtra("Mobile","০১৭২২-০৫৪৮৩২");
                startActivity(intent);

            }
        });

        tethraiUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFour.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৩৮");
                intent.putExtra("Nameandnumber","আব্দুল মালেক  ০১৭২৬-৫৪৬৩৯৮");
                intent.putExtra("Mobile","০১৭২৬-৫৪৬৩৯৮");
                startActivity(intent);

            }
        });

        tethraiUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFour.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৩৯");
                intent.putExtra("Nameandnumber","মোঃ শাহীনুর রহমান  ০১৭২১-৭০০৮১০");
                intent.putExtra("Mobile","০১৭২১৭০০৮১০");
                startActivity(intent);

            }
        });

        tethraiUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFour.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৪০");
                intent.putExtra("Nameandnumber","উজ্জল কুমার সরকার  ০১৭১৭০৪৩৫২৮");
                intent.putExtra("Mobile","০১৭১৭০৪৩৫২৮");
                startActivity(intent);

            }
        });

        tethraiUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFour.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৪১");
                intent.putExtra("Nameandnumber","মেওয়ানুল কবির  ০১৭১৭৮১৭৭০১");
                intent.putExtra("Mobile","০১৭১৭৮১৭৭০১");
                startActivity(intent);

            }
        });

        tethraiUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFour.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৪২");
                intent.putExtra("Nameandnumber","রাকিবুল হাসান  ০১৭১৪৬২৬২৮২");
                intent.putExtra("Mobile","০১৭১৪৬২৬২৮২");
                startActivity(intent);

            }
        });

        tethraiUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFour.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৪৩");
                intent.putExtra("Nameandnumber","মিঠু দেব  ০১৭১৫৭৪৯২৬৬");
                intent.putExtra("Mobile","০১৭১৫৭৪৯২৬৬");
                startActivity(intent);

            }
        });

        tethraiUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFour.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৪৫");
                intent.putExtra("Nameandnumber","আশফাকুর রহমান আকন্দ  ০১৭১৭৩৫২৫২৪");
                intent.putExtra("Mobile","০১৭১৭৩৫২৫২৪");
                startActivity(intent);

            }
        });

        tethraiUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFour.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৪৬");
                intent.putExtra("Nameandnumber","আব্দুর রাজ্জাক সরকার  ০১৭১৫২৭০৮০৬");
                intent.putExtra("Mobile","০১৭১৫২৭০৮০৬");
                startActivity(intent);

            }
        });

        tethraiUnionKendroTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFour.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৪৭");
                intent.putExtra("Nameandnumber","মোঃ আনিছুর রহমান  ০১৯২২৯৭৪২৩২");
                intent.putExtra("Mobile","০১৯২২৯৭৪২৩২");
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
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFour.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
