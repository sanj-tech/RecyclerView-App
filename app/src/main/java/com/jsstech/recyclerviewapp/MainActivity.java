package com.jsstech.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> list;
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerVW);



        list=new ArrayList<>();
        list.add(new Model(R.drawable.burg,"title"));
        list.add(new Model(R.drawable.burger,"title2"));
        list.add(new Model(R.drawable.dhokla,"title3"));
        list.add(new Model(R.drawable.burgersand,"title4"));
        list.add(new Model(R.drawable.dhokla,"title5"));
        list.add(new Model(R.drawable.burger,"title6"));
        list.add(new Model(R.drawable.sandwitch,"title7"));
        list.add(new Model(R.drawable.rasgulla,"title8"));
        list.add(new Model(R.drawable.samosa,"title9"));
        list.add(new Model(R.drawable.burger,"title10"));
        list.add(new Model(R.drawable.dhokla,"title11"));
        list.add(new Model(R.drawable.sandwitch,"title12"));
        list.add(new Model(R.drawable.rasgulla,"title13"));
        list.add(new Model(R.drawable.samosa,"title14"));
        list.add(new Model(R.drawable.burger,"title15"));
        list.add(new Model(R.drawable.dhokla,"title16"));





        adapter=new MyAdapter(MainActivity.this,list);

        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter);




    }

}