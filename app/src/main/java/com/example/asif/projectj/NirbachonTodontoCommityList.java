package com.example.asif.projectj;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NirbachonTodontoCommityList extends AppCompatActivity {

    ImageButton nirbachonTodontoComityCallOne,NirbachonTodontoComityCallTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nirbachon_todonto_commity_list);

        nirbachonTodontoComityCallOne=findViewById(R.id.nirbachon_todonto_comity_call_one);
        NirbachonTodontoComityCallTwo=findViewById(R.id.nirbachon_todonto_comity_call_two);

        nirbachonTodontoComityCallOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭২১৬৬৭২৯৮"));
                startActivity(callIntent);

            }
        });

        NirbachonTodontoComityCallTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০১৭১৭১৩৪৯৬৫"));
                startActivity(callIntent);

            }
        });
    }
}
