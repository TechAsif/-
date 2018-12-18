package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainButtonOneActivity extends AppCompatActivity {

    Button mapButton,kendroOJogaJog,kendrerSobi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_one);

        mapButton=findViewById(R.id.map_button);
        kendroOJogaJog=findViewById(R.id.kendro_o_zogazog_button);
        kendrerSobi=findViewById(R.id.kendrer_sobir_link);


        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneActivity.this,MainButtonOneLevelOneActivity.class);
                startActivity(intent);
            }
        });

        kendroOJogaJog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneActivity.this,MainButtonOneLevelTwoActivity.class);
                startActivity(intent);
            }
        });

    }
}
