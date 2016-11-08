package com.example.anmol.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class AddYourTask extends AppCompatActivity {

    EditText task;
    EditText desc;
    // RecyclerView recView;
    // ListAdapter adap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_your_task);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

     /*   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void addtask(View view)
    {
        task=(EditText)findViewById(R.id.taskinput);
        desc=(EditText)findViewById(R.id.desc_input);
        // MainActivity.insertData(task.getText().toString(),desc.getText().toString());
        ListItems li=new ListItems();
        li.setTitle(task.getText().toString());
        li.setDesc(desc.getText().toString());
        ToDoListData.todo.add(li);
        ToDoListData.titles.add(li.getTitle());
        ToDoListData.descs.add(li.getDesc());

        Intent i =new Intent(this,MainActivity.class);
        startActivity(i);
      /*  recView=(RecyclerView)findViewById(R.id.rec_list);
        recView.setLayoutManager(new LinearLayoutManager(this));
        adap=new ListAdapter(ToDoListData.todo,this);
        recView.setAdapter(adap);*/
        //  adap.setItemClickCallback(this);
        // MainActivity.notifychange();

    }

}
