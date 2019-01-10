package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonThreeLevelThreeLevelTherteen extends AppCompatActivity {

    Button hatiaUnionKendroOne,hatiaUnionKendroTwo,hatiaUnionKendroThree,hatiaUnionKendroFour,
            hatiaUnionKendroFive,hatiaUnionKendroSix,hatiaUnionKendroSeven,hatiaUnionKendroEight,
            hatiaUnionKendroNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_three_level_three_level_therteen);

        hatiaUnionKendroOne=findViewById(R.id.hatia_union_kendro_one);
        hatiaUnionKendroTwo=findViewById(R.id.hatia_union_kendro_two);
        hatiaUnionKendroThree=findViewById(R.id.hatia_union_kendro_three);
        hatiaUnionKendroFour=findViewById(R.id.hatia_union_kendro_four);
        hatiaUnionKendroFive=findViewById(R.id.hatia_union_kendro_five);
        hatiaUnionKendroSix=findViewById(R.id.hatia_union_kendro_six);
        hatiaUnionKendroSeven=findViewById(R.id.hatia_union_kendro_seven);
        hatiaUnionKendroEight=findViewById(R.id.hatia_union_kendro_eight);
        hatiaUnionKendroNine=findViewById(R.id.hatia_union_kendro_nine);



        hatiaUnionKendroOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTherteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১২৪");
                intent.putExtra("Nameandnumber","জনাব সামিউল হক  ০১৯২২৭০৫১৫৪");
                intent.putExtra("Mobile","০১৯২২৭০৫১৫৪");
                startActivity(intent);

            }
        });

        hatiaUnionKendroTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTherteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১২৫");
                intent.putExtra("Nameandnumber","মোঃ মতিয়ার রহমান  ০১৭১৭৭৪৩৮৮৮");
                intent.putExtra("Mobile","০১৭১৭৭৪৩৮৮৮");
                startActivity(intent);

            }
        });

        hatiaUnionKendroThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTherteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১২৬");
                intent.putExtra("Nameandnumber","জনাব মোঃ জাহাঙ্গীর আলম  ০১৭১৯৪৬২৩৩৫");
                intent.putExtra("Mobile","০১৭১৯৪৬২৩৩৫");
                startActivity(intent);

            }
        });

        hatiaUnionKendroFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTherteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১২৭");
                intent.putExtra("Nameandnumber","মোঃ রেজাউল কবির  ০১৭২৯৪০৩২২৫");
                intent.putExtra("Mobile","০১৭২৯৪০৩২২৫");
                startActivity(intent);

            }
        });

        hatiaUnionKendroFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTherteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১২৮");
                intent.putExtra("Nameandnumber","আতাউর রহমান  ০১৭২২২০৫৩৬১");
                intent.putExtra("Mobile","০১৭২২২০৫৩৬১");
                startActivity(intent);

            }
        });

        hatiaUnionKendroSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTherteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১২৯");
                intent.putExtra("Nameandnumber","মোঃ কেরামত আলী সরকার  ০১৭১৬৩৪৭১৪৭");
                intent.putExtra("Mobile","০১৭১৬৩৪৭১৪৭");
                startActivity(intent);

            }
        });

        hatiaUnionKendroSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTherteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৩০");
                intent.putExtra("Nameandnumber","মোছাঃ সেলিনা খাতুন  ০১৭১৭৪৫২৩৭৯");
                intent.putExtra("Mobile","০১৭১৭৪৫২৩৭৯");
                startActivity(intent);

            }
        });

        hatiaUnionKendroEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTherteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৩১");
                intent.putExtra("Nameandnumber","মোঃ মিলন  ০১৭৩৪৬৯৯০৩০");
                intent.putExtra("Mobile","০১৭৩৪৬৯৯০৩০");
                startActivity(intent);

            }
        });

        hatiaUnionKendroNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTherteen.this,PijaidingOfficierList.class);
                intent.putExtra("Cromiknong","১৩২");
                intent.putExtra("Nameandnumber","মোঃ আলিমুজ্জামান ০১৭২১৭৬৩১৮০");
                intent.putExtra("Mobile","০১৭২১৭৬৩১৮০");
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
                Intent intent=new Intent(MainButtonThreeLevelThreeLevelTherteen.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
