package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainButtonSevenLevelSix extends AppCompatActivity {

    Button upojelaVumiOffice,unionVumiOffice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_seven_level_six);

        upojelaVumiOffice=findViewById(R.id.upojela_vumi_office);
        unionVumiOffice=findViewById(R.id.union_vumi_office);


        upojelaVumiOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenLevelSix.this,UpojelaVumiOfficeStafList.class);
                startActivity(intent);
            }
        });

        unionVumiOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenLevelSix.this,MainButtonSevenLevelSixLevelTwo.class);
                startActivity(intent);
            }
        });
    }
}
