package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonThreeLevelThreeLevelFive extends AppCompatActivity {

    Button durgapurUnionKendroOne,durgapurUnionKendroTwo,durgapurUnionKendroThree,durgapurUnionKendroFour,
            durgapurUnionKendroFive,durgapurUnionKendroSix,durgapurUnionKendroSeven,durgapurUnionKendroEight,
            durgapurUnionKendroNine,durgapurUnionKendroTen,durgapurUnionKendroEleven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_three_level_three_level_five);


        durgapurUnionKendroOne=findViewById(R.id.durgapur_union_kendro_one);
        durgapurUnionKendroTwo=findViewById(R.id.durgapur_union_kendro_two);
        durgapurUnionKendroThree=findViewById(R.id.durgapur_union_kendro_three);
        durgapurUnionKendroFour=findViewById(R.id.durgapur_union_kendro_four);
        durgapurUnionKendroFive=findViewById(R.id.durgapur_union_kendro_five);
        durgapurUnionKendroSix=findViewById(R.id.durgapur_union_kendro_six);
        durgapurUnionKendroSeven=findViewById(R.id.durgapur_union_kendro_seven);
        durgapurUnionKendroEight=findViewById(R.id.durgapur_union_kendro_eight);
        durgapurUnionKendroNine=findViewById(R.id.durgapur_union_kendro_nine);
        durgapurUnionKendroTen=findViewById(R.id.durgapur_union_kendro_ten);
        durgapurUnionKendroEleven=findViewById(R.id.durgapur_union_kendro_eleven);


        durgapurUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFive.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৪৮");
                intent.putExtra("Nameandnumber","শুধুাংশু কুমার সরকার  ০১৭১২৫৩৭৯৮৪");
                intent.putExtra("Mobile","০১৭১২৫৩৭৯৮৪");
                startActivity(intent);

            }
        });

        durgapurUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFive.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৪৯");
                intent.putExtra("Nameandnumber","মিঃ আতাউর রহমান  ০১৭১৬২০৩৮৬০");
                intent.putExtra("Mobile","০১৭১৬২০৩৮৬০");
                startActivity(intent);

            }
        });

        durgapurUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFive.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৫০");
                intent.putExtra("Nameandnumber","এসএম শরিফুল ইসলাম  ০১৭১৮৫৬৬২৬৫");
                intent.putExtra("Mobile","০১৭১৮৫৬৬২৬৫");
                startActivity(intent);

            }
        });

        durgapurUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFive.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৫১");
                intent.putExtra("Nameandnumber","আবুল কালাম আজাদ  ০১৭৮০৬১২৩৫৪");
                intent.putExtra("Mobile","০১৭৮০৬১২৩৫৪");
                startActivity(intent);

            }
        });

        durgapurUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFive.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৫২");
                intent.putExtra("Nameandnumber","জনাব পুতুল চন্দ্র রায়  ০১৭৩৭৭২৫৩৭৩");
                intent.putExtra("Mobile","০১৭৩৭৭২৫৩৭৩");
                startActivity(intent);

            }
        });

        durgapurUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFive.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৫৩");
                intent.putExtra("Nameandnumber","জনাব পুতুল চন্দ্র রায়  ০১৭৩৭৭২৫৩৭৩");
                intent.putExtra("Mobile","০১৭৩৭৭২৫৩৭৩");
                startActivity(intent);

            }
        });

        durgapurUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFive.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৫৪");
                intent.putExtra("Nameandnumber","মোঃ বরকত উল্ল্যাহ  ০১৭২১৭৬৫০৩১");
                intent.putExtra("Mobile","০১৭২১৭৬৫০৩১");
                startActivity(intent);

            }
        });

        durgapurUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFive.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৫৫");
                intent.putExtra("Nameandnumber","মোঃ নজরুল ইসলাম  ০১৭৪০১১০২৭৫");
                intent.putExtra("Mobile","০১৭৪০১১০২৭৫");
                startActivity(intent);

            }
        });

        durgapurUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFive.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৫৬");
                intent.putExtra("Nameandnumber","হরিগোপাল রায়  ০১৭৪৬০৯৩০১১");
                intent.putExtra("Mobile","০১৭৪৬০৯৩০১১");
                startActivity(intent);

            }
        });

        durgapurUnionKendroTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFive.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৫৭");
                intent.putExtra("Nameandnumber","মিজানুর রহমান  ০১৭১৭২৯২৯৪৬");
                intent.putExtra("Mobile","০১৭১৭২৯২৯৪৬");
                startActivity(intent);

            }
        });

        durgapurUnionKendroEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFive.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৫৮");
                intent.putExtra("Nameandnumber","মোঃ আতিকুল আলম  ০১৭৭৩১০৭৯৫৯");
                intent.putExtra("Mobile","০১৭৭৩১০৭৯৫৯");
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
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFive.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
