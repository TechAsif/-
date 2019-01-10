package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonThreeLevelThreeLevelOne extends AppCompatActivity {

    Button ulipurPowrosovaKendroOneForPijaiding,ulipurPowrosovaKendroTwoForPijaiding,
            ulipurPowrosovaKendroThreeForPijaiding,ulipurPowrosovaKendroFourForPijaiding,
            ulipurPowrosovaKendroFiveForPijaiding,ulipurPowrosovaKendroSixForPijaiding,
            ulipurPowrosovaKendroSevenForPijaiding,ulipurPowrosovaKendroEightForPijaiding,
            ulipurPowrosovaKendroNineForPijaiding,ulipurPowrosovaKendroTenForPijaiding,
            ulipurPowrosovaKendroElevenForPijaiding,ulipurPowrosovaKendroTwoelveForPijaiding,
            ulipurPowrosovaKendroTherteenForPijaiding,ulipurPowrosovaKendroFourteenForPijaiding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_three_level_three_level_one);

        ulipurPowrosovaKendroOneForPijaiding=findViewById(R.id.ulipur_powrosova_kendro_one_for_pijaiding);
        ulipurPowrosovaKendroTwoForPijaiding=findViewById(R.id.ulipur_powrosova_kendro_two_for_pijaiding);
        ulipurPowrosovaKendroThreeForPijaiding=findViewById(R.id.ulipur_powrosova_kendro_three_for_pijaiding);
        ulipurPowrosovaKendroFourForPijaiding=findViewById(R.id.ulipur_powrosova_kendro_four_for_pijaiding);
        ulipurPowrosovaKendroFiveForPijaiding=findViewById(R.id.ulipur_powrosova_kendro_five_for_pijaiding);
        ulipurPowrosovaKendroSixForPijaiding=findViewById(R.id.ulipur_powrosova_kendro_six_for_pijaiding);
        ulipurPowrosovaKendroSevenForPijaiding=findViewById(R.id.ulipur_powrosova_kendro_seven_for_pijaiding);
        ulipurPowrosovaKendroEightForPijaiding=findViewById(R.id.ulipur_powrosova_kendro_eight_for_pijaiding);
        ulipurPowrosovaKendroNineForPijaiding=findViewById(R.id.ulipur_powrosova_kendro_nine_for_pijaiding);
        ulipurPowrosovaKendroTenForPijaiding=findViewById(R.id.ulipur_powrosova_kendro_ten_for_pijaiding);
        ulipurPowrosovaKendroElevenForPijaiding=findViewById(R.id.ulipur_powrosova_kendro_eleven_for_pijaiding);
        ulipurPowrosovaKendroTwoelveForPijaiding=findViewById(R.id.ulipur_powrosova_kendro_twoelve_for_pijaiding);
        ulipurPowrosovaKendroTherteenForPijaiding=findViewById(R.id.ulipur_powrosova_kendro_therteen_for_pijaiding);
        ulipurPowrosovaKendroFourteenForPijaiding=findViewById(R.id.ulipur_powrosova_kendro_fourteen_for_pijaiding);




        ulipurPowrosovaKendroOneForPijaiding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelOne.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১");
                intent.putExtra("Nameandnumber","মোঃ নবীজুল হক   ০১৭১৯৭৫৩৭৮৫");
                intent.putExtra("Mobile","০১৭১৯৭৫৩৭৮৫");
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroTwoForPijaiding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelOne.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","০২");
                intent.putExtra("Nameandnumber","মমোঃ আতিয়ার রহমান   ০১৭১৭-৫৪১২১৫");
                intent.putExtra("Mobile","০১৭১৭-৫৪১২১৫");
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroThreeForPijaiding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelOne.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","০৩");
                intent.putExtra("Nameandnumber","হাসেম আলী  ০১৭১৬৩২৭১৮৪");
                intent.putExtra("Mobile","০১৭১৬৩২৭১৮৪");
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroFourForPijaiding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelOne.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","০৪");
                intent.putExtra("Nameandnumber","মোঃ শামছুল আলম   ০১৭১৯৩৪৭৬৩৫");
                intent.putExtra("Mobile","০১৭১৯৩৪৭৬৩৫");
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroFiveForPijaiding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelOne.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","০৫");
                intent.putExtra("Nameandnumber","সুশান্ত কুমার রায়   ০১৭৩৮২৬৯৭৫১");
                intent.putExtra("Mobile","০১৭৩৮২৬৯৭৫১");
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroSixForPijaiding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelOne.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","০৬");
                intent.putExtra("Nameandnumber","মোঃ মাহফুজুর রহমান   ০১৭৫৮৬২৬৭৮৬");
                intent.putExtra("Mobile","০১৭৫৮৬২৬৭৮৬");
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroSevenForPijaiding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelOne.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","০৭");
                intent.putExtra("Nameandnumber","মোঃ আলী ইমরান   ০১৭৬১৭৩৭৮৩৪");
                intent.putExtra("Mobile","০১৭৬১৭৩৭৮৩৪");
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroEightForPijaiding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelOne.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","০৮");
                intent.putExtra("Nameandnumber","মোঃ সাইফুল ইসলাম   ০১৭১৭০৮৮৪৬৫");
                intent.putExtra("Mobile","০১৭১৭০৮৮৪৬৫");
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroNineForPijaiding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelOne.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","০৯ ");
                intent.putExtra("Nameandnumber","মোঃ আব্দুল গফফার   ০১৭২২৪১২৩৭৮");
                intent.putExtra("Mobile","০১৭২২৪১২৩৭৮");
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroTenForPijaiding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelOne.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১০");
                intent.putExtra("Nameandnumber","মোঃ ইয়াকুব আলী   ০১৭২২৪৩১৬০০");
                intent.putExtra("Mobile","০১৭২২৪৩১৬০০");
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroElevenForPijaiding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelOne.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১১");
                intent.putExtra("Nameandnumber","মোঃ আব্দুর রব   ০১৭১২৬৩৭০৪৪");
                intent.putExtra("Mobile","০১৭১২৬৩৭০৪৪");
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroTwoelveForPijaiding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelOne.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১২");
                intent.putExtra("Nameandnumber","মোছাঃ নাইস সুলতানা  ০১৭৭১৯১৪৬৬৮");
                intent.putExtra("Mobile","০১৭৭১৯১৪৬৬৮");
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroTherteenForPijaiding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelOne.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৩");
                intent.putExtra("Nameandnumber","মোঃ মাহবুবুল আলম   ০১৭১২১৯২৫৪১");
                intent.putExtra("Mobile","০১৭১২১৯২৫৪১");
                startActivity(intent);

            }
        });

        ulipurPowrosovaKendroFourteenForPijaiding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelOne.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৪");
                intent.putExtra("Nameandnumber","মোঃ আব্দুল বারেক সিদ্দিকী   ০১৭১৯৪৬৯২২৫");
                intent.putExtra("Mobile","০১৭১৯৪৬৯২২৫");
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
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelOne.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
