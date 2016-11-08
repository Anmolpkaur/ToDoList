package com.example.anmol.todolist;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.BundleCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Anmol on 11/5/2016.
 */
public class ScrollAdapter extends FragmentStatePagerAdapter{

   // private static final List titleslist=ToDoListData.getDescs();

    public ScrollAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public int getCount() {
        return ToDoListData.descs.size();
    }



    @Override
    public Fragment getItem(int i) {

        Fragment fragment=new descFrag();
        Bundle bundle=new Bundle();
      //  int p=MainActivity.pos;

        bundle.putString("titlest",ToDoListData.descs.get(i));
        fragment.setArguments(bundle);

        return fragment;
    }


}
