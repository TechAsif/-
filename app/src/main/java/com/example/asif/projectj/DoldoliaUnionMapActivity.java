package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ZoomControls;

import com.bumptech.glide.Glide;

public class DoldoliaUnionMapActivity extends AppCompatActivity {

    ZoomControls zoomControls;
    ImageView analogMapImage;
    int zoomCheck=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doldolia_union_map);

        analogMapImage=findViewById(R.id.analog_map);


        analogMapImage = findViewById(R.id.analog_map);
        Glide.with(DoldoliaUnionMapActivity.this)
                .load(R.drawable.daldolia)
                .into(analogMapImage);





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
                Intent intent=new Intent(DoldoliaUnionMapActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
