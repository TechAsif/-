package com.example.asif.projectj;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class UpojelaVumiOfficeStafList extends AppCompatActivity {

    ImageButton phoneCall,croCekamsaSohokari,najirkam,sarveyer,sartificatePeshkar,SartificateSohokari,
            processServer,processServer2,officeSohayok,office_Sohayok2,chainMan,chainMan2,noisoProhori;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upojela_vumi_office_staf_list);

        phoneCall=findViewById(R.id.prodhanSohokariPhone);
        croCekamsaSohokari=findViewById(R.id.crocekam_sohokari);
        najirkam=findViewById(R.id.najim_kam_kesiar);
        sarveyer=findViewById(R.id.sarvear);
        sartificatePeshkar=findViewById(R.id.sartificat_peshkar);
        SartificateSohokari=findViewById(R.id.sartificat_sohokari);
        processServer=findViewById(R.id.process_server);
        processServer2=findViewById(R.id.process_server2);
        officeSohayok=findViewById(R.id.office_sohayok);
        office_Sohayok2=findViewById(R.id.office_sohayok2);
        chainMan=findViewById(R.id.Chain_man);
        chainMan2=findViewById(R.id.Chain_man2);
        noisoProhori=findViewById(R.id.noiso_prohori);



        phoneCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01797635920"));
                startActivity(callIntent);

            }
        });

        croCekamsaSohokari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01716956010"));
                startActivity(callIntent);

            }
        });

        najirkam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01713735200"));
                startActivity(callIntent);

            }
        });

        sarveyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01751462129"));
                startActivity(callIntent);

            }
        });

        sartificatePeshkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01737131345"));
                startActivity(callIntent);

            }
        });

        SartificateSohokari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01721764632"));
                startActivity(callIntent);

            }
        });

        processServer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01928659290"));
                startActivity(callIntent);

            }
        });

        processServer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01705935838"));
                startActivity(callIntent);

            }
        });

        officeSohayok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01984845599"));
                startActivity(callIntent);

            }
        });

        office_Sohayok2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01750866444"));
                startActivity(callIntent);

            }
        });

        chainMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01722280136"));
                startActivity(callIntent);

            }
        });

        chainMan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01722529638"));
                startActivity(callIntent);

            }
        });

        noisoProhori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01797635920"));
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
                Intent intent=new Intent(UpojelaVumiOfficeStafList.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
