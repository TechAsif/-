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

public class PrarthiList extends AppCompatActivity {

    ImageButton moi,dhanersish,gamsa,bycycle,langgol,nowka,kaste,hatpakha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prarthi_list);

        moi=findViewById(R.id.moi_marka);
        dhanersish=findViewById(R.id.dhanersish_marka);
        gamsa=findViewById(R.id.gamsa_marka);
        bycycle=findViewById(R.id.bicycle_marka);
        langgol=findViewById(R.id.langgol_marka);
        nowka=findViewById(R.id.nowka_marka);
        kaste=findViewById(R.id.kaste_marka);
        hatpakha=findViewById(R.id.hatpakha_marka);


        moi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৭৫২৪৩২৯"));
                startActivity(callIntent);

            }
        });

        dhanersish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১১৫২৬৪২৬"));
                startActivity(callIntent);

            }
        });

        gamsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭৪১০৭৬২২৪"));
                startActivity(callIntent);

            }
        });

        bycycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৯১০৭৫৭০৩০"));
                startActivity(callIntent);

            }
        });

        langgol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭৮৫৬৬৭৭৭৭"));
                startActivity(callIntent);

            }
        });

        nowka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৫১৫৭৫৩২"));
                startActivity(callIntent);

            }
        });

        kaste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭২৪৫১২৪৯২"));
                startActivity(callIntent);

            }
        });

        hatpakha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১২০২৯৫৫৭"));
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
                Intent intent=new Intent(PrarthiList.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
