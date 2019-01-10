package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonThreeActivity extends AppCompatActivity {

    Button prijaidingOfficier,reterningOfficier,nirbachonOfficier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_three);

        prijaidingOfficier=findViewById(R.id.prijaiding_officier);
        reterningOfficier=findViewById(R.id.returning_officier);
        nirbachonOfficier=findViewById(R.id.nirbacn_officier);

        prijaidingOfficier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeActivity.this,PijaidingOfficierPdf.class);
                startActivity(intent);
            }
        });

        reterningOfficier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeActivity.this,ReterningOfficierList.class);
                startActivity(intent);
            }
        });

        nirbachonOfficier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonThreeActivity.this,NIrbaconOfficierList.class);
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
                Intent intent=new Intent(MainButtonThreeActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
