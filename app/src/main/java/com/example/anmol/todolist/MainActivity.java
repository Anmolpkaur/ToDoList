package com.example.anmol.todolist;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListAdapter.ItemClickCallback {


    static int pos;


    //Main Activity is list activity
    private  RecyclerView View_Recycler;
    public  ListAdapter adap;
    private  ArrayList listdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listdata=(ArrayList)ToDoListData.setListData();
        View_Recycler=(RecyclerView)findViewById(R.id.rec_list);
        View_Recycler.setLayoutManager(new LinearLayoutManager(this));
        adap=new ListAdapter(listdata,this);
        View_Recycler.setAdapter(adap);
        adap.setItemClickCallback(this);
//+++++++++++++++++++++++++++
        ItemTouchHelper itm=new ItemTouchHelper(createHelperCallback());
        itm.attachToRecyclerView(View_Recycler);

        //+++++++++++++++++++++++++

    }

    private ItemTouchHelper.Callback createHelperCallback()
    {
        ItemTouchHelper.SimpleCallback sitc=
                new ItemTouchHelper.SimpleCallback(ItemTouchHelper.UP | ItemTouchHelper.DOWN , ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                removeTask(viewHolder.getAdapterPosition());

            }
        };
        return sitc;
    }

    private  void removeTask(final int loc)
    {
        listdata.remove(loc);
        ToDoListData.descs.remove(loc);
        ToDoListData.titles.remove(loc);
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);

    }

    @Override
    public void onItemClick(int p) {
        //ListItems item=(ListItems)listdata.get(p);
        pos=p;
        Intent i=new Intent(this,DetailActivity.class);
       // Bundle extras=new Bundle();
        //extras.putString(EXTRA_QOUTE,item.getTitle());
        //extras.putString(EXTRA_ATTR,item.());
        //i.putExtra(BUNDLE_EXTRAS,extras);
        startActivity(i);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuinflater=getMenuInflater();
        menuinflater.inflate(R.menu.additemok,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int resid=item.getItemId();
        if(resid==R.id.addtask)
        {
            Intent i=new Intent(this,AddYourTask.class);
            startActivity(i);

        }

        return true;

    }




}
