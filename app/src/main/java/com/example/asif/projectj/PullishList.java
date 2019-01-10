package com.example.asif.projectj;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class PullishList extends AppCompatActivity {

    ImageButton pullish,pullishCallOne,pullishCallTwo,staikingOfficierONe,staikingOfficierTwo,
    staikingOfficierThree,staikingOfficierFour;

    ImageButton pullishMobileTeamOne,pullishMobileTeamTwo,pullishMobileTeamThree,
            pullishMobileTeamFour,pullishMobileTeamFive,pullishMobileTeamSix,
            pullishMobileTeamSeven,pullishMobileTeamEight,pullishMobileTeamNine,
            pullishMobileTeamTen,pullishMobileTeamEleven,pullishMobileTeamTwoelve,
            pullishMobileTeamTherteen,pullishMobileTeamFourTeen,pullishMobileTeamFifteen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pullish_list);

        pullishCallOne=findViewById(R.id.pullish_call_one);
        pullishCallTwo=findViewById(R.id.pullish_call_two);

        pullish=findViewById(R.id.pullish_call);

        staikingOfficierONe=findViewById(R.id.staiking_officier_one);
        staikingOfficierTwo=findViewById(R.id.staiking_officier_two);
        staikingOfficierThree=findViewById(R.id.staiking_officier_three);
        staikingOfficierFour=findViewById(R.id.staiking_officier_four);


        pullishMobileTeamOne=findViewById(R.id.pullish_mobile_team_one);
        pullishMobileTeamTwo=findViewById(R.id.pullish_mobile_team_two);
        pullishMobileTeamThree=findViewById(R.id.pullish_mobile_team_three);
        pullishMobileTeamFour=findViewById(R.id.pullish_mobile_team_four);
        pullishMobileTeamFive=findViewById(R.id.pullish_mobile_team_five);
        pullishMobileTeamSix=findViewById(R.id.pullish_mobile_team_six);
        pullishMobileTeamSeven=findViewById(R.id.pullish_mobile_team_seven);
        pullishMobileTeamEight=findViewById(R.id.pullish_mobile_team_eight);
        pullishMobileTeamNine=findViewById(R.id.pullish_mobile_team_nine);
        pullishMobileTeamTen=findViewById(R.id.pullish_mobile_team_ten);
        pullishMobileTeamEleven=findViewById(R.id.pullish_mobile_team_eleven);
        pullishMobileTeamTwoelve=findViewById(R.id.pullish_mobile_team_twoelve);
        pullishMobileTeamTherteen=findViewById(R.id.pullish_mobile_team_therteen);
        pullishMobileTeamFourTeen=findViewById(R.id.pullish_mobile_team_fourteen);
        pullishMobileTeamFifteen=findViewById(R.id.pullish_mobile_team_fifteen);





        pullishCallOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৩৩৭৩৯২০"));
                startActivity(callIntent);

            }
        });

        pullishCallTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৩৩৭৩৯২৪"));
                startActivity(callIntent);

            }
        });


        pullish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৩৩৭৩৯৩১"));
                startActivity(callIntent);

            }
        });


//        staiking officier

        staikingOfficierONe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৩৩৭৩৯৩১"));
                startActivity(callIntent);

            }
        });

        staikingOfficierTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭০৬৪৯৯৪৯৯"));
                startActivity(callIntent);

            }
        });

        staikingOfficierThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৩৩৭৩৯৩৮"));
                startActivity(callIntent);

            }
        });

        staikingOfficierFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৮১৪২৭২৩০৫"));
                startActivity(callIntent);

            }
        });


//        pullish mobile team call

        pullishMobileTeamOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৪৫৬৯৪৬২"));
                startActivity(callIntent);

            }
        });

        pullishMobileTeamTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৬২০৬৬৯০"));
                startActivity(callIntent);

            }
        });

        pullishMobileTeamThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৯৫৪০৪৩১"));
                startActivity(callIntent);

            }
        });

        pullishMobileTeamFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৭৩৪১৭৩৫"));
                startActivity(callIntent);

            }
        });

        pullishMobileTeamFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭৩৮২৪৪৭৫৫"));
                startActivity(callIntent);

            }
        });

        pullishMobileTeamSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭৩১৭২৭৮৬৫"));
                startActivity(callIntent);

            }
        });


        pullishMobileTeamSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৭০৮৮২৮৪"));
                startActivity(callIntent);

            }
        });

        pullishMobileTeamEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭৯৭৮৯০৩২১"));
                startActivity(callIntent);

            }
        });

        pullishMobileTeamNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৬৬৯৬৯৯৭"));
                startActivity(callIntent);

            }
        });

        pullishMobileTeamTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৯০২৯১৪৪"));
                startActivity(callIntent);

            }
        });

        pullishMobileTeamEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১০০৭৭৪৬৬"));
                startActivity(callIntent);

            }
        });


        pullishMobileTeamTwoelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৬৩৬৪০৭৮"));
                startActivity(callIntent);

            }
        });

        pullishMobileTeamTherteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭৮৬৪৭০৬৪৫"));
                startActivity(callIntent);

            }
        });

        pullishMobileTeamFourTeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৯৫৮৩৮৯২"));
                startActivity(callIntent);

            }
        });

        pullishMobileTeamFifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৯৯৯৭৩৪৩২০"));
                startActivity(callIntent);

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
                Intent intent=new Intent(PullishList.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
