package com.jsstech.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {
    ImageView image_view;
    TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        image_view=findViewById(R.id.showimg);
        text_view=findViewById(R.id.showtitle1);

        //get information  from Adapter classes
        image_view.setImageResource(getIntent().getIntExtra("image",0));
        text_view.setText(getIntent().getStringExtra("title"));



    }
}