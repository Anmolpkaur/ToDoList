package com.example.anmol.todolist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DetailActivity extends AppCompatActivity {
    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewpager=(ViewPager)findViewById(R.id.viewpager);
        ScrollAdapter adapter=new ScrollAdapter(getSupportFragmentManager());
        int p=MainActivity.pos;
        //adapter=new ScrollAdapter(this);
        viewpager.setAdapter(adapter);
        viewpager.setCurrentItem(p);
    }

}
