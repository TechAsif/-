package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class NodiParaParGhatButton extends AppCompatActivity {

    Button nodiParaparGhatButtonOne,nodiParaparGhatButtonTwo,nodiParaparGhatButtonThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nodi_para_par_ghat_button);

        nodiParaparGhatButtonOne=findViewById(R.id.nodiparapar_ghat_button_one);
        nodiParaparGhatButtonTwo=findViewById(R.id.nodiparapar_ghat_button_two);
        nodiParaparGhatButtonThree=findViewById(R.id.nodiparapar_ghat_button_three);


        nodiParaparGhatButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(NodiParaParGhatButton.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.679307");
                intent.putExtra("Lang","89.692749");
                String title = "সাহেবের আলগা বাগুয়া/ পালের ঘাট, হাতিয়া";
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        nodiParaparGhatButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(NodiParaParGhatButton.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.742560");
                intent.putExtra("Lang","89.683249");
                String title = "বেগমগঞ্জ বুড়াবুড়ি ঘাট";
                intent.putExtra("Title",title);
                startActivity(intent);

            }
        });

        nodiParaparGhatButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(NodiParaParGhatButton.this,MapsActivityDemo.class);
                intent.putExtra("Lat","25.640602");
                intent.putExtra("Lang","89.555833");
                String title = "থেতরাই ও বজরা হোকডাঙ্গা ঘাট";
                intent.putExtra("Title",title);
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
                Intent intent=new Intent(NodiParaParGhatButton.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
