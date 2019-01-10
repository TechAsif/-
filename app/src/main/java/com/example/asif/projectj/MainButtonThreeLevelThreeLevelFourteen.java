package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonThreeLevelThreeLevelFourteen extends AppCompatActivity {

    Button saheberalgaUnionKendroOne,saheberalgaUnionKendroTwo,saheberalgaUnionKendroThree,saheberalgaUnionKendroFour,
            saheberalgaUnionKendroFive,saheberalgaUnionKendroSix,saheberalgaUnionKendroSeven,saheberalgaUnionKendroEight,
            saheberalgaUnionKendroNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_three_level_three_level_fourteen);


        saheberalgaUnionKendroOne=findViewById(R.id.saheberalga_union_kendro_one);
        saheberalgaUnionKendroTwo=findViewById(R.id.saheberalga_union_kendro_two);
        saheberalgaUnionKendroThree=findViewById(R.id.saheberalga_union_kendro_three);
        saheberalgaUnionKendroFour=findViewById(R.id.saheberalga_union_kendro_four);
        saheberalgaUnionKendroFive=findViewById(R.id.saheberalga_union_kendro_five);
        saheberalgaUnionKendroSix=findViewById(R.id.saheberalga_union_kendro_six);
        saheberalgaUnionKendroSeven=findViewById(R.id.saheberalga_union_kendro_seven);
        saheberalgaUnionKendroEight=findViewById(R.id.saheberalga_union_kendro_eight);
        saheberalgaUnionKendroNine=findViewById(R.id.saheberalga_union_kendro_nine);



        saheberalgaUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFourteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৩৩");
                intent.putExtra("Nameandnumber","মনোরঞ্জন কুমার দাস  ০১৭১৮৯৩৬২৩৭");
                intent.putExtra("Mobile","০১৭১৮৯৩৬২৩৭");
                startActivity(intent);

            }
        });

        saheberalgaUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFourteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৩৪");
                intent.putExtra("Nameandnumber","সঞ্জিব কুমার সরকার  ০১৭২৪২২৮২৭০");
                intent.putExtra("Mobile","০১৭২৪২২৮২৭০");
                startActivity(intent);

            }
        });

        saheberalgaUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFourteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৩৫");
                intent.putExtra("Nameandnumber","মোঃ আখতারুল ইসলাম  ০১৭১২২৫৬৬৩৪");
                intent.putExtra("Mobile","০১৭১২২৫৬৬৩৪");
                startActivity(intent);

            }
        });

        saheberalgaUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFourteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৩৬");
                intent.putExtra("Nameandnumber","মোঃ শাহ্ নেওয়াজ  ০১৭১৮৬৭৪৭৮৯");
                intent.putExtra("Mobile","০১৭১৮৬৭৪৭৮৯");
                startActivity(intent);

            }
        });

        saheberalgaUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFourteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৩৭");
                intent.putExtra("Nameandnumber","মোঃ সিরাজুল ইসলাম  ০১৯৩৮৮৭৯০৮০");
                intent.putExtra("Mobile","০১৯৩৮৮৭৯০৮০");
                startActivity(intent);

            }
        });

        saheberalgaUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFourteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৩৮");
                intent.putExtra("Nameandnumber","এ কে এম আনোয়ারুল ইসলাম  ০১৭১২৫৫৯৯৩৮");
                intent.putExtra("Mobile","০১৭১২৫৫৯৯৩৮");
                startActivity(intent);

            }
        });

        saheberalgaUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFourteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৩৯");
                intent.putExtra("Nameandnumber","মোঃ মিজানুর রহমান  ০১৭১৬৪৫৬৩৭৬");
                intent.putExtra("Mobile","০১৭১৬৪৫৬৩৭৬");
                startActivity(intent);

            }
        });

        saheberalgaUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFourteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৪০");
                intent.putExtra("Nameandnumber","মোঃ নুর ইসলাম সরকার  ০১৭৩৮৭৯৫৭৩৮");
                intent.putExtra("Mobile","০১৭৩৮৭৯৫৭৩৮");
                startActivity(intent);

            }
        });

        saheberalgaUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFourteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৪১");
                intent.putExtra("Nameandnumber","মোঃ খায়রুজ্জামান   ০১৭৬৮৯৮৯২৩৯");
                intent.putExtra("Mobile","০১৭৬৮৯৮৯২৩৯");
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
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelFourteen.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
