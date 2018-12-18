package com.example.asif.projectj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ZoomControls;

import com.bumptech.glide.Glide;

public class PandulUnionMapActivity extends AppCompatActivity {

    ZoomControls zoomControls;
    ImageView analogMapImage;
    int zoomCheck=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pandul_union_map);

        zoomControls=findViewById(R.id.zoom_control_buttom);
        analogMapImage=findViewById(R.id.analog_map);


        analogMapImage = findViewById(R.id.analog_map);
        Glide.with(PandulUnionMapActivity.this)
                .load(R.drawable.pandul)
                .into(analogMapImage);




        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                zoomCheck++;

                float x= analogMapImage.getScaleX();
                float y=analogMapImage.getScaleY();
                analogMapImage.setScaleX(x+1);
                analogMapImage.setScaleY(y+1);

            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(zoomCheck!=0){
                    float x= analogMapImage.getScaleX();
                    float y=analogMapImage.getScaleY();
                    analogMapImage.setScaleX(x-1);
                    analogMapImage.setScaleY(y-1);
                    zoomCheck--;
                }

            }
        });
    }
}
