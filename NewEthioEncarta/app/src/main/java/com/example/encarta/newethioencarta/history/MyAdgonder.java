package com.example.encarta.newethioencarta.history;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.encarta.newethioencarta.R;

import java.util.ArrayList;
/**
 * Created by Encarta on 5/19/2018.
 */

public class MyAdgonder extends BaseAdapter{

    /**
     * Created by Encarta on 5/17/2018.
     */

    private Context context;
    private ArrayList<Integer> listid;
    private ArrayList<String> namelist;

    public MyAdgonder(Context context, ArrayList<Integer> listid, ArrayList<String> namelist) {
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
            convertView = View.inflate(context, R.layout.activity_gonder, null);
        }
        ImageView imges=convertView.findViewById(R.id.imageViewmid);
        TextView textView=convertView.findViewById(R.id.textViewmid);
        imges.setImageResource(listid.get(Position));
        textView.setText(namelist.get(Position));
        return convertView;
    }


}