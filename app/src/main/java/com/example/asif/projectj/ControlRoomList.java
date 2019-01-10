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

public class ControlRoomList extends AppCompatActivity {

    ImageButton upojelaControlRoom,senabahiniControlRoom,BgbControlRoom,jelaControlRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_room_list);

        upojelaControlRoom=findViewById(R.id.upojela_control_room_call);
        BgbControlRoom=findViewById(R.id.bgb_control_room_call);
        senabahiniControlRoom=findViewById(R.id.senabahini_control_room_call);
        jelaControlRoom=findViewById(R.id.jela_control_room_call);


        jelaControlRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০৫৮১৬২৪৪৮"));
                startActivity(callIntent);

            }
        });


        upojelaControlRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০৫৮২৯৫৬৩০৫"));
                startActivity(callIntent);

            }
        });

        senabahiniControlRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০৫৮২৯৫৬৩০৬"));
                startActivity(callIntent);

            }
        });

        BgbControlRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:০৫৮২৯৫৬৩০১"));
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
                Intent intent=new Intent(ControlRoomList.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
