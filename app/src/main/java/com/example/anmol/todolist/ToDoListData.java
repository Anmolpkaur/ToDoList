package com.example.anmol.todolist;

import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anmol on 11/4/2016.
 */
public class ToDoListData {

    //private static final String[] titles={"MC Assignment","Bath","Take Sleep","Meditate","Have Fun","Make others laugh"};
    //private static final String[] descs={"MC Assignmenddt","Bathdd","Take Sleepdd","Meditatedd","Have Fundd","Make others laughdd"};



    static List<ListItems> todo=new ArrayList<>();
    static List<String> titles=new ArrayList<>();
    static List<String> descs=new ArrayList<>();

    public static List getTitles() {
        return titles;
    }

    public static List getDescs() {
        return descs;
    }

    public static List<ListItems> setListData()
    {
       // List<ListItems> todo=new ArrayList<>();

      /*  for(int i=0;i<3;i++)
        {
            for(int j=0;j<titles.length;j++)
            {
                ListItems item=new ListItems();
                item.setTitle(titles[j]);
                todo.add(item);
            }
        }*/


        return todo;
    }
}
