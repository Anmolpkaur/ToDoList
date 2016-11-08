package com.example.anmol.todolist;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Anmol on 11/4/2016.
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListHolder>{

    private List<ListItems> listdata;
    private LayoutInflater inflater;
    private ItemClickCallback itemclickcallback;

    public interface ItemClickCallback
    {
        void onItemClick(int p);
    }

    public void setItemClickCallback(final ItemClickCallback itemclickcallback)
    {
        this.itemclickcallback=itemclickcallback;

    }
    public ListAdapter( List<ListItems> listdata,Context c)
    {
        this.inflater=LayoutInflater.from(c);
        this.listdata=listdata;

    }

    @Override
    public ListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.list_item,parent,false);
        return new ListHolder(view);
    }

    @Override
    public void onBindViewHolder(ListHolder holder, int position) {

        ListItems item=listdata.get(position);
        holder.title.setText(item.getTitle());

    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    class ListHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private TextView title;
        private View container;

        public ListHolder(View iView)
        {
            super(iView);
            title=(TextView)iView.findViewById(R.id.title_tv);
            container=iView.findViewById(R.id.container_item);
            container.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            if(view.getId()== R.id.container_item)
            {
              itemclickcallback.onItemClick(getAdapterPosition());
            }



        }
    }




}
