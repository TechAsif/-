package com.example.asif.projectj;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;



public class MainButtonSevenActivity extends AppCompatActivity {

    Button vumiOfficeStaf,UpiSocib,polliBidduthButton,fireServicesButton,
    thanaButton,abasonSongKeranto,hospital,redCrecent,UpojelaSashtoPoribarkolponamontronaloy,controlRoom;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_seven);




        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbarlayout);
        //getSupportActionBar().setTitle("       অন্যান্য");


        redCrecent=findViewById(R.id.red_crecent);
        controlRoom=findViewById(R.id.control_room);
        UpojelaSashtoPoribarkolponamontronaloy=findViewById(R.id.upojela_sashto_poribar_prikolpona_kormokorta);


        vumiOfficeStaf=findViewById(R.id.vumi_office_staf);
        UpiSocib=findViewById(R.id.upi_socib);
        polliBidduthButton=findViewById(R.id.polli_bidduth_button);
        fireServicesButton=findViewById(R.id.fire_services_button);
        thanaButton=findViewById(R.id.thana_button);
        abasonSongKeranto=findViewById(R.id.abason_songkranto);
        hospital=findViewById(R.id.hospital);


        redCrecent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenActivity.this,RedCrecentList.class);
                startActivity(intent);
            }
        });

        controlRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenActivity.this,ControlRoomList.class);
                startActivity(intent);
            }
        });

        UpojelaSashtoPoribarkolponamontronaloy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenActivity.this,SashtoPoribarPorikolponaMontronaloyList.class);
                startActivity(intent);
            }
        });



        vumiOfficeStaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenActivity.this,MainButtonSevenLevelSix.class);
                startActivity(intent);
            }
        });

        UpiSocib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenActivity.this,UpiSocibList.class);
                startActivity(intent);
            }
        });

        polliBidduthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenActivity.this,UlipurPolliBidduthList.class);
                startActivity(intent);
            }
        });

        thanaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenActivity.this,UlipurThanaList.class);
                startActivity(intent);
            }
        });

        fireServicesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenActivity.this,UlipurFireServices.class);
                startActivity(intent);
            }
        });

        abasonSongKeranto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenActivity.this,AbasonSongkerantoList.class);
                startActivity(intent);
            }
        });

        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenActivity.this,HospitalList.class);
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
                Intent intent=new Intent(MainButtonSevenActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
