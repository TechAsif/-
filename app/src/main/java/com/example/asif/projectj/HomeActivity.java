package com.example.asif.projectj;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {

    /*

     */
    private EditText userName;
    private EditText userPassword;
    private Button logIn;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView background = findViewById(R.id.logo_png);
        Glide.with(HomeActivity.this)
                .load(R.drawable.bangladesh_sarker)
                .into(background);



        /*

         */

        userName = findViewById(R.id.user_name);
        userPassword = findViewById(R.id.user_password);
        logIn=findViewById(R.id.log_in_button);
        info = findViewById(R.id.info_textView);


        /*

         */
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getUsername=userName.getText().toString();
                String getPassword=userPassword.getText().toString();
                if(getUsername.equals("admin") && getPassword.equals("12345")){
                    info.setText("");

                    Intent intent = new Intent(HomeActivity.this,MainActivity.class);
                    userName.setText("");
                    userPassword.setText("");
                    startActivity(intent);

                }else{
                    info.setText("");
                }
            }
        });


    }



}
