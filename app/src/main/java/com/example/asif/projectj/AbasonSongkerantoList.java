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

public class AbasonSongkerantoList extends AppCompatActivity {

    ImageButton rdrs,brak,prosikha,dakbangla,hoteloli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abason_songkeranto_list);

        rdrs=findViewById(R.id.abason_sonkeranto_button_one);
        brak=findViewById(R.id.abason_sonkeranto_button_two);
        prosikha=findViewById(R.id.abason_sonkeranto_button_three);
        dakbangla=findViewById(R.id.abason_sonkeranto_button_four);
        hoteloli=findViewById(R.id.abason_sonkeranto_button_five);


        rdrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৮৯৩৩৮৯৪"));
                startActivity(callIntent);

            }
        });

        brak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭৩০৩৪৭০২৭"));
                startActivity(callIntent);

            }
        });

        prosikha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৯৩৬০০৬৪"));
                startActivity(callIntent);

            }
        });

        dakbangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭৩৭৩৫৪১৪০"));
                startActivity(callIntent);

            }
        });

        hoteloli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৯২২৮০১৯৫৭"));
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
                Intent intent=new Intent(AbasonSongkerantoList.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
