package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonThreeLevelThreeLevelThree extends AppCompatActivity {

    Button tobokpurUnionKendroOne,tobokpurUnionKendroTwo,tobokpurUnionKendroThree,tobokpurUnionKendroFour,
            tobokpurUnionKendroFive,tobokpurUnionKendroSix,tobokpurUnionKendroSeven,tobokpurUnionKendroEight,
            tobokpurUnionKendroNine,tobokpurUnionKendroTen,tobokpurUnionKendroeleven,tobokpurUnionKendroTwoelve,
            tobokpurUnionKendrotherteen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_three_level_three_level_three);


        tobokpurUnionKendroOne=findViewById(R.id.tobokpur_union_kendro_one);
        tobokpurUnionKendroTwo=findViewById(R.id.tobokpur_union_kendro_two);
        tobokpurUnionKendroThree=findViewById(R.id.tobokpur_union_kendro_three);
        tobokpurUnionKendroFour=findViewById(R.id.tobokpur_union_kendro_four);
        tobokpurUnionKendroFive=findViewById(R.id.tobokpur_union_kendro_five);
        tobokpurUnionKendroSix=findViewById(R.id.tobokpur_union_kendro_six);
        tobokpurUnionKendroSeven=findViewById(R.id.tobokpur_union_kendro_seven);
        tobokpurUnionKendroEight=findViewById(R.id.tobokpur_union_kendro_eight);
        tobokpurUnionKendroNine=findViewById(R.id.tobokpur_union_kendro_nine);
        tobokpurUnionKendroTen=findViewById(R.id.tobokpur_union_kendro_ten);
        tobokpurUnionKendroeleven=findViewById(R.id.tobokpur_union_kendro_eleven);
        tobokpurUnionKendroTwoelve=findViewById(R.id.tobokpur_union_kendro_twoelve);
        tobokpurUnionKendrotherteen=findViewById(R.id.tobokpur_union_kendro_therteen);





        tobokpurUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelThree.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","২৪");
                intent.putExtra("Nameandnumber","মোঃ তোফাজ্জেল হক  ০১৭৮২৩৮৬৮১১");
                intent.putExtra("Mobile","০১৭৮২৩৮৬৮১১");
                startActivity(intent);

            }
        });

        tobokpurUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelThree.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","২৫");
                intent.putExtra("Nameandnumber","জনাব হিমাংশু কুমার মন্ডল  ০১৭৩৪১৮০৬৩৩");
                intent.putExtra("Mobile","০১৭৩৪১৮০৬৩৩");
                startActivity(intent);

            }
        });

        tobokpurUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelThree.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","২৬");
                intent.putExtra("Nameandnumber","জনাব আব্দুর রাজ্জাক  ০১৭৬৮৮১০৯১৭");
                intent.putExtra("Mobile","০১৭৬৮৮১০৯১৭");
                startActivity(intent);

            }
        });

        tobokpurUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelThree.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","২৭");
                intent.putExtra("Nameandnumber","জনাব দীনেশ চন্দ্র দাস  ০১৭১০১৪২২৩৪");
                intent.putExtra("Mobile","০১৭১০১৪২২৩৪");
                startActivity(intent);

            }
        });

        tobokpurUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelThree.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","২৮");
                intent.putExtra("Nameandnumber","মোঃ সাজু মিয়া  ০১৭১০৪৯০৮৬৬");
                intent.putExtra("Mobile","০১৭১০৪৯০৮৬৬");
                startActivity(intent);

            }
        });

        tobokpurUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelThree.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","২৯");
                intent.putExtra("Nameandnumber","মোঃ আব্দুল্লাহ আল মামুন  ০১৭১৪৭৬২৯৬৭");
                intent.putExtra("Mobile","০১৭১৪৭৬২৯৬৭");
                startActivity(intent);

            }
        });

        tobokpurUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelThree.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৩০");
                intent.putExtra("Nameandnumber","গোলাম মওলা  ০১৯২১-৪২৫৭৮৮");
                intent.putExtra("Mobile","০১৯২১৪২৫৭৮৮");
                startActivity(intent);

            }
        });

        tobokpurUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelThree.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৩১");
                intent.putExtra("Nameandnumber","ইতি রানী কর্মকার  ০১৭২৫-৬১৮০৮৫");
                intent.putExtra("Mobile","০১৭২৫৬১৮০৮৫");
                startActivity(intent);

            }
        });

        tobokpurUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelThree.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৩২");
                intent.putExtra("Nameandnumber","শাহীনুর আলমগীর  ০১৭১৮৫৪১৭৮৭");
                intent.putExtra("Mobile","০১৭১৮৫৪১৭৮৭");
                startActivity(intent);

            }
        });

        tobokpurUnionKendroTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelThree.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৩৩");
                intent.putExtra("Nameandnumber","দেবাশীষ মজুমদার  ০১৭১০৮৭০৭২৮");
                intent.putExtra("Mobile","০১৭১০৮৭০৭২৮");
                startActivity(intent);

            }
        });

        tobokpurUnionKendroeleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelThree.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৩৪");
                intent.putExtra("Nameandnumber","মোঃ রাকিবুল ইসলাম  ০১৭১৮২৩৬০৪১");
                intent.putExtra("Mobile","০১৭১৮২৩৬০৪১");
                startActivity(intent);

            }
        });

        tobokpurUnionKendroTwoelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelThree.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৩৫");
                intent.putExtra("Nameandnumber","রনজিৎ কুমার বর্মন  ০১৭৩২-৮১৮৮৬২");
                intent.putExtra("Mobile","০১৭৩২৮১৮৮৬২");
                startActivity(intent);

            }
        });

        tobokpurUnionKendrotherteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelThree.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","৩৬");
                intent.putExtra("Nameandnumber","মোঃ ইলিয়াস আলী  ০১৭১৯২৫৭৩২৬");
                intent.putExtra("Mobile","০১৭১৯২৫৭৩২৬");
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
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelThree.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
