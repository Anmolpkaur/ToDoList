package com.example.anmol.todolist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class descFrag extends Fragment {

    TextView desc;     //=(TextView)item_view.findViewById(R.id.description);

    public descFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // getActionBar().setDisplayHomeAsUpEnabled(true);

        View view=inflater.inflate(R.layout.fragment_desc,container,false);
        TextView desc=(TextView)view.findViewById(R.id.description);
        Bundle bundle=getArguments();
        String message=bundle.getString("titlest");
        desc.setText(message);
        return view;
    }

}
