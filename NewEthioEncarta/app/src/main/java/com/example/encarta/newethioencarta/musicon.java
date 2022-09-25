package com.example.encarta.newethioencarta;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.example.encarta.newethioencarta.ethion.Downloadereh;
import com.example.encarta.newethioencarta.muson.Downloadmuscon;

import static com.example.encarta.newethioencarta.UrlClass.ServiceType.historyp;
import static com.example.encarta.newethioencarta.UrlClass.ServiceType.musicalp;

public class musicon extends AppCompatActivity {

    String url=musicalp
            ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musicon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        final ListView lv= (ListView) findViewById(R.id.lv);
        final Downloadmuscon d=new Downloadmuscon(this,url,lv);

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