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

public class UpiSocibList extends AppCompatActivity {

    ImageButton durgapurUpiSocib,begomgonjUpiSocib,hatiaUpiSocib,saheberalgaUpiSocib,gunaigasUpiSocib,
            bojraUpiSocib,tobokpurUpiSocib,dhamsreniUpiSocib,dhornibariUpiSocib,pandulUpiSocib,
            pandulTwoUpiSocib,tethraiUpiSocib,buraburiUpiSocib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upi_socib_list);

        durgapurUpiSocib=findViewById(R.id.durgapur_upi_socib);
        begomgonjUpiSocib=findViewById(R.id.begomgonj_upi_socib);
        hatiaUpiSocib=findViewById(R.id.hatia_upi_socib);
        saheberalgaUpiSocib=findViewById(R.id.saheberalga_upi_socib);
        gunaigasUpiSocib=findViewById(R.id.gunaigas_upi_socib);
        bojraUpiSocib=findViewById(R.id.bojra_upi_socib);
        tobokpurUpiSocib=findViewById(R.id.tobokpur_upi_socib);
        dhamsreniUpiSocib=findViewById(R.id.dhamsreni_upi_socib);
        dhornibariUpiSocib=findViewById(R.id.dharnibari_upi_socib);
        pandulUpiSocib=findViewById(R.id.pandul_upi_socib);
        pandulTwoUpiSocib=findViewById(R.id.pandul_two_upi_socib);
        tethraiUpiSocib=findViewById(R.id.tethrai_upi_socib);
        buraburiUpiSocib=findViewById(R.id.buraburi_upi_socib);

        durgapurUpiSocib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৩৯৩৭৬৬৭"));
                startActivity(callIntent);

            }
        });

        begomgonjUpiSocib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭৪৩৫৮৪৬১৪"));
                startActivity(callIntent);

            }
        });

        hatiaUpiSocib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১০০৫৩৪৫৪"));
                startActivity(callIntent);

            }
        });

        saheberalgaUpiSocib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৬৫৪৬৪৭৪"));
                startActivity(callIntent);

            }
        });

        gunaigasUpiSocib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭২২৪০২৮৩৬"));
                startActivity(callIntent);

            }
        });

        bojraUpiSocib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭২৯৭৩৪৭৩৯"));
                startActivity(callIntent);

            }
        });

        tobokpurUpiSocib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৯০২৭৬৩২"));
                startActivity(callIntent);

            }
        });

        dhamsreniUpiSocib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৯৩৩২০৯০৯৯"));
                startActivity(callIntent);

            }
        });

        dhornibariUpiSocib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৯৮৪২৮০০০৮"));
                startActivity(callIntent);

            }
        });

        pandulUpiSocib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭২১৯২২৪০৯"));
                startActivity(callIntent);

            }
        });

        pandulTwoUpiSocib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৯১৩০৮২২৭৫"));
                startActivity(callIntent);

            }
        });

        tethraiUpiSocib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৮৬৩২০৮২৪৩"));
                startActivity(callIntent);

            }
        });

        buraburiUpiSocib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৪৫৬৫৬৪১"));
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
                Intent intent=new Intent(UpiSocibList.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
