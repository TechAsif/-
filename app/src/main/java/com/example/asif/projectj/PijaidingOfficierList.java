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
import android.widget.TextView;

public class PijaidingOfficierList extends AppCompatActivity {

    TextView pijaidingOfficierSerialNumber,PijaidingOfficierNumandMobileNumber;
    ImageButton pijaidingOfficierCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pijaiding_officier_list);

        pijaidingOfficierSerialNumber=findViewById(R.id.pijaiding_officier_kendro_serial_number);
        PijaidingOfficierNumandMobileNumber=findViewById(R.id.pijaiding_officier_num_and_mobile);
        pijaidingOfficierCall=findViewById(R.id.pijaiding_officier_call);



        String Cromiknong=getIntent().getExtras().getString("Cromiknong");
        String Nameandnumber=getIntent().getExtras().getString("Nameandnumber");
        final String Mobile=getIntent().getExtras().getString("Mobile");


        pijaidingOfficierSerialNumber.setText(Cromiknong);
        PijaidingOfficierNumandMobileNumber.setText(Nameandnumber);

        pijaidingOfficierCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+Mobile));
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
                Intent intent=new Intent(PijaidingOfficierList.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
