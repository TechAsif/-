package com.example.asif.projectj;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class ExicutiveMegistredList extends AppCompatActivity {

    ImageButton executiveMegistred,ExecutiveMegistredasrafujaman,
    ExcutiveMegistredabulkalam,sajberu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exicutive_megistred_list);

        ExecutiveMegistredasrafujaman=findViewById(R.id.executive_megistred_asrafujaman);
        ExcutiveMegistredabulkalam=findViewById(R.id.executive_megistred_abulkalamajad);
        sajberu=findViewById(R.id.executive_megistred_sajebur_rahman);


        executiveMegistred=findViewById(R.id.executive_megistred_yasin_arafat);

        ExecutiveMegistredasrafujaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১২১৭৫৭২০"));
                startActivity(callIntent);

            }
        });

        ExcutiveMegistredabulkalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১১২৬০৩৪২"));
                startActivity(callIntent);

            }
        });

        sajberu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১১৪৮৪০৩৮"));
                startActivity(callIntent);

            }
        });

        executiveMegistred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭২৩৮৮৫৮৮৮"));
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
                Intent intent=new Intent(ExicutiveMegistredList.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
