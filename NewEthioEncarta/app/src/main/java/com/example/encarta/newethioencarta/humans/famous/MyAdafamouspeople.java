package com.example.encarta.newethioencarta.humans.famous;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.encarta.newethioencarta.R;

import java.util.ArrayList;

/**
 * Created by Encarta on 5/17/2018.
 */




public class MyAdafamouspeople extends BaseAdapter {

    private Context context;
    private ArrayList<Integer> listid;
    private ArrayList<String> namelist;

    public MyAdafamouspeople(Context context, ArrayList<Integer> listid, ArrayList<String> namelist) {
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
            convertView = View.inflate(context, R.layout.activity_efamous_people, null);
        }
        ImageView imges=convertView.findViewById(R.id.imageViewhumans);
        TextView textView=convertView.findViewById(R.id.textViewhumans);
        imges.setImageResource(listid.get(Position));
        textView.setText(namelist.get(Position));
        return convertView;
    }


}




/*<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        android:background="@drawable/bg"
        android:weightSum="10"

        app:layout_behavior="@string/appbar_scrolling_view_behavior"
        tools:context="com.example.encarta.newethioencarta.history.Historys"
        >

<RelativeLayout
    android:layout_weight="2"
            android:layout_width="match_parent"
            android:layout_height="0sp"
            >
<TextView
        android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:id="@+id/hader"
                android:text="Ethiopian History"
                android:textSize="34sp"
                android:textColor="#ffff"
                android:layout_centerInParent="true"
                />


</RelativeLayout>

<GridLayout
    android:id="@+id/mainGrid"
            android:columnCount="2"
            android:rowCount="2"
            android:alignmentMode="alignMargins"
            android:columnOrderPreserved="false"
            android:layout_weight="8"
            android:layout_width="match_parent"
            android:layout_height="0sp"
            android:padding="14dp"
            >
<android.support.v7.widget.CardView
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_columnWeight="1"
        android:layout_rowWeight="1"
        android:layout_marginBottom="16dp"
        android:layout_marginLeft="16dp"
        android:layout_marginRight="16dp"
        app:cardElevation="8dp"
        app:cardCornerRadius="8dp"


        >
<LinearLayout
            android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_margin="16dp"
                    android:layout_gravity="center_horizontal|center_vertical"
                    android:orientation="vertical"
                    >
<ImageView
                android:src="@drawable/ethiohistriy"
                        android:layout_gravity="center_horizontal"
                        android:layout_width="wrap_content"
                        android:layout_height="100sp" />
<TextView
                android:text="Prehistory "
                        android:textAlignment="center"
                        android:textColor="#000"
                        android:textSize="18sp"
                        android:textStyle="bold"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        />

</LinearLayout>

</android.support.v7.widget.CardView>


<android.support.v7.widget.CardView
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_columnWeight="1"
        android:layout_rowWeight="1"
        android:layout_marginBottom="16dp"
        android:layout_marginLeft="16dp"
        android:layout_marginRight="16dp"
        app:cardElevation="8dp"
        app:cardCornerRadius="8dp"


        >
<LinearLayout
            android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_margin="16dp"
                    android:layout_gravity="center_horizontal|center_vertical"
                    android:orientation="vertical"
                    >
<ImageView
                android:src="@drawable/axsum"
                        android:layout_gravity="center_horizontal"
                        android:layout_width="wrap_content"
                        android:layout_height="100sp" />
<TextView
                android:text="@string/antiquity_ethiopia_history"
                        android:textAlignment="center"
                        android:textColor="#000"
                        android:textSize="18sp"
                        android:textStyle="bold"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        />

</LinearLayout>

</android.support.v7.widget.CardView>


<android.support.v7.widget.CardView
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_columnWeight="1"
        android:layout_rowWeight="1"
        android:layout_marginBottom="16dp"
        android:layout_marginLeft="16dp"
        android:layout_marginRight="16dp"
        app:cardElevation="8dp"
        app:cardCornerRadius="8dp"


        >
<LinearLayout
            android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_margin="16dp"
                    android:layout_gravity="center_horizontal|center_vertical"
                    android:orientation="vertical"
                    >
<ImageView
                android:src="@drawable/lalibela"
                        android:layout_gravity="center_horizontal"
                        android:layout_width="wrap_content"
                        android:layout_height="100sp" />
<TextView
                android:text="@string/ethiopian_history_middle_ages"
                        android:textAlignment="center"
                        android:textColor="#000"
                        android:textSize="18sp"
                        android:textStyle="bold"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        />

</LinearLayout>

</android.support.v7.widget.CardView>

<android.support.v7.widget.CardView
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_columnWeight="1"
        android:layout_rowWeight="1"
        android:layout_marginBottom="16dp"
        android:layout_marginLeft="16dp"
        android:layout_marginRight="16dp"
        app:cardElevation="8dp"
        app:cardCornerRadius="8dp"


        >
<LinearLayout
            android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_margin="16dp"
                    android:layout_gravity="center_horizontal|center_vertical"
                    android:orientation="vertical"
                    >
<ImageView
                android:src="@drawable/abay"
                        android:layout_gravity="center_horizontal"
                        android:layout_width="wrap_content"
                        android:layout_height="100sp" />
<TextView
                android:text="@string/modern_history_of_ethiopian"
                        android:textAlignment="center"
                        android:textColor="#000"
                        android:textSize="18sp"
                        android:textStyle="bold"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        />

</LinearLayout>

</android.support.v7.widget.CardView>



</GridLayout>


*/