package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonFourActivity extends AppCompatActivity {

    Button armyButton,BgbButton,PullishButon,AnsarbdbButton,rabButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_four);

        armyButton=findViewById(R.id.army_button);
        BgbButton=findViewById(R.id.bgb_button);
        PullishButon=findViewById(R.id.pullish_button);
        AnsarbdbButton=findViewById(R.id.ansar_bdb_button);
        rabButton=findViewById(R.id.rab_button);


        armyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonFourActivity.this,SenabahiniList.class);
                startActivity(intent);
            }
        });

        rabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonFourActivity.this,RabList.class);
                startActivity(intent);
            }
        });


        BgbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonFourActivity.this,BgbList.class);
                startActivity(intent);
            }
        });

        PullishButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonFourActivity.this,PullishList.class);
                startActivity(intent);
            }
        });

        AnsarbdbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonFourActivity.this,AnsarBdbList.class);
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
                Intent intent=new Intent(MainButtonFourActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
