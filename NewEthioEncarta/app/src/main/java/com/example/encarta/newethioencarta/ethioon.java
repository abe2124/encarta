package com.example.encarta.newethioencarta;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.example.encarta.newethioencarta.cultureon.Download;
import com.example.encarta.newethioencarta.ethion.Downloadereh;

import static com.example.encarta.newethioencarta.UrlClass.ServiceType.culturep;
import static com.example.encarta.newethioencarta.UrlClass.ServiceType.historyp;

public class ethioon extends AppCompatActivity {

    String url=historyp
            ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ethioon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        final ListView lv= (ListView) findViewById(R.id.lv);
        final Downloadereh d=new Downloadereh(this,url,lv);

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
