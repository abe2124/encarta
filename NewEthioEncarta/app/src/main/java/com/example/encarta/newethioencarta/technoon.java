package com.example.encarta.newethioencarta;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.example.encarta.newethioencarta.ethion.Downloadereh;
import com.example.encarta.newethioencarta.techon.Downloadtech;

import static com.example.encarta.newethioencarta.UrlClass.ServiceType.historyp;
import static com.example.encarta.newethioencarta.UrlClass.ServiceType.technop;

public class technoon extends AppCompatActivity {

    String url=technop
            ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.technoon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        final ListView lv= (ListView) findViewById(R.id.lv);
        final Downloadtech d=new Downloadtech(this,url,lv);

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
