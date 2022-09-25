package com.example.encarta.newethioencarta.history;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.encarta.newethioencarta.R;

import java.util.ArrayList;

/**
 * Created by Encarta on 5/13/2018.
 */

class MyAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Integer> listid;
    private ArrayList<String> namelist;

    public MyAdapter(Context context, ArrayList<Integer> listid, ArrayList<String> namelist) {
        this.context = context;
        this.listid = listid;
        this.namelist = namelist;
    }

    @Override
    public int getCount() {
        return namelist.size();
    }

    @Override
    public Object getItem(int Position) {
        return namelist.get(Position);
    }

    @Override
    public long getItemId(int Position) {
        return Position;
    }

    @Override
    public View getView(int Position, View convertView, ViewGroup viewGroup) {

        if(convertView == null) {
            convertView = View.inflate(context, R.layout.historis, null);
        }
        ImageView imges=convertView.findViewById(R.id.imageView2);
        TextView textView=convertView.findViewById(R.id.textView);
        imges.setImageResource(listid.get(Position));
        textView.setText(namelist.get(Position));
        return convertView;
    }


}


