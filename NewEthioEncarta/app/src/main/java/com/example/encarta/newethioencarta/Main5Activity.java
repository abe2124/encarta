package com.example.encarta.newethioencarta;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.example.encarta.newethioencarta.eduon.Downloadedu;
import com.example.encarta.newethioencarta.envon.Downloadenv;


import static com.example.encarta.newethioencarta.UrlClass.ServiceType.educationp;
import static com.example.encarta.newethioencarta.UrlClass.ServiceType.envaromentp;

public class Main5Activity extends AppCompatActivity {

    String url=envaromentp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        final ListView lv= (ListView) findViewById(R.id.lv);
        final Downloadenv d=new Downloadenv(this,url,lv);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //EXECUTE DOWNLOAD
                d.execute();
            }
        });
    }
}

