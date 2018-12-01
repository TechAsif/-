package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainButtonThreeActivity extends AppCompatActivity {

    Button mainButtonThreeLevelOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_three);

        mainButtonThreeLevelOne = findViewById(R.id.reterning_officier);
        mainButtonThreeLevelOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainButtonThreeActivity.this,MainButtonThreeLevelOneActivity.class);
                startActivity(intent);
            }
        });
    }
}
