package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainButtonSevenActivity extends AppCompatActivity {

    Button vumiOfficeStaf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_seven);

        vumiOfficeStaf=findViewById(R.id.vumi_office_staf);



        vumiOfficeStaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonSevenActivity.this,MainButtonSevenLevelSix.class);
                startActivity(intent);
            }
        });
    }
}
