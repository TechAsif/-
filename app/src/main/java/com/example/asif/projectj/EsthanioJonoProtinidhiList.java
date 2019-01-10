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

public class EsthanioJonoProtinidhiList extends AppCompatActivity {

     ImageButton tethraiUnionEsthanioJonoprotinidhi,doldoliaUnionEsthanioJonoprotinidhi,durgapurUnionEsthanioJonoprotinidhi,
             pandulUnionEsthanioJonoprotinidhi,buraburiUnionEsthanioJonoprotinidhi,dhornibariUnionEsthanioJonoprotinidhi,
             dhamsreniUnionEsthanioJonoprotinidhi,gunaigasUnionEsthanioJonoprotinidhi,bojraUnionEsthanioJonoprotinidhi,
             tobokpurUnionEsthanioJonoprotinidhi,hatiaUnionEsthanioJonoprotinidhi,begomgonjUnionEsthanioJonoprotinidhi,
             saheberalgaUnionEsthanioJonoprotinidhi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esthanio_jono_protinidhi_list);

        tethraiUnionEsthanioJonoprotinidhi=findViewById(R.id.tethrai_union_esthanio_jonoprotinidhi);
        doldoliaUnionEsthanioJonoprotinidhi=findViewById(R.id.doldolia_union_esthanio_jonoprotinidhi);
        durgapurUnionEsthanioJonoprotinidhi=findViewById(R.id.durgapur_union_esthanio_jonoprotinidhi);
        pandulUnionEsthanioJonoprotinidhi=findViewById(R.id.pandul_union_esthanio_jonoprotinidhi);
        buraburiUnionEsthanioJonoprotinidhi=findViewById(R.id.buraburi_union_esthanio_jonoprotinidhi);
        dhamsreniUnionEsthanioJonoprotinidhi=findViewById(R.id.dhamsreni_union_esthanio_jonoprotinidhi);
        dhornibariUnionEsthanioJonoprotinidhi=findViewById(R.id.dhornibari_union_esthanio_jonoprotinidhi);
        gunaigasUnionEsthanioJonoprotinidhi=findViewById(R.id.gunaigas_union_esthanio_jonoprotinidhi);
        bojraUnionEsthanioJonoprotinidhi=findViewById(R.id.bojra_union_esthanio_jonoprotinidhi);
        tobokpurUnionEsthanioJonoprotinidhi=findViewById(R.id.tobokpur_union_esthanio_jonoprotinidhi);
        hatiaUnionEsthanioJonoprotinidhi=findViewById(R.id.hatia_union_esthanio_jonoprotinidhi);
        begomgonjUnionEsthanioJonoprotinidhi=findViewById(R.id.begomgonj_union_esthanio_jonoprotinidhi);
        saheberalgaUnionEsthanioJonoprotinidhi=findViewById(R.id.saheberalga_union_esthanio_jonoprotinidhi);



        tethraiUnionEsthanioJonoprotinidhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৯৮৮৯৯৬৭৮৮"));
                startActivity(callIntent);

            }
        });

        doldoliaUnionEsthanioJonoprotinidhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৪৬৯২৭১৭"));
                startActivity(callIntent);

            }
        });

        durgapurUnionEsthanioJonoprotinidhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৯৮০৭৯৩৩২৫"));
                startActivity(callIntent);

            }
        });

        pandulUnionEsthanioJonoprotinidhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭৪০৯২৭১৪৯"));
                startActivity(callIntent);

            }
        });

        buraburiUnionEsthanioJonoprotinidhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৩৭৭৪৯০৩"));
                startActivity(callIntent);

            }
        });

        dhornibariUnionEsthanioJonoprotinidhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৬৪৭৯২৮৬"));
                startActivity(callIntent);

            }
        });

        dhamsreniUnionEsthanioJonoprotinidhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭২৮৭২০৪৭৭"));
                startActivity(callIntent);

            }
        });

        gunaigasUnionEsthanioJonoprotinidhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭৪০৬৩৭৪৪৫"));
                startActivity(callIntent);

            }
        });

        bojraUnionEsthanioJonoprotinidhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭৭৪৫৫৩৬৪৩"));
                startActivity(callIntent);

            }
        });

        tobokpurUnionEsthanioJonoprotinidhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭৫৭৮১০০৭৩"));
                startActivity(callIntent);

            }
        });

        hatiaUnionEsthanioJonoprotinidhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৮৯৫৪০৫১"));
                startActivity(callIntent);

            }
        });

        begomgonjUnionEsthanioJonoprotinidhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৬২২১৫৫৭"));
                startActivity(callIntent);

            }
        });

        saheberalgaUnionEsthanioJonoprotinidhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৯৪০০৬৭৪৭৯"));
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
                Intent intent=new Intent(EsthanioJonoProtinidhiList.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
