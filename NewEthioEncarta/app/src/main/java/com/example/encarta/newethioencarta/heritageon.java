package com.example.encarta.newethioencarta;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.example.encarta.newethioencarta.ethion.Downloadereh;
import com.example.encarta.newethioencarta.heron.Downloderheri;

import static com.example.encarta.newethioencarta.UrlClass.ServiceType.heritagep;
import static com.example.encarta.newethioencarta.UrlClass.ServiceType.historyp;

public class heritageon extends AppCompatActivity {

    String url=heritagep
            ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.heritageon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        final ListView lv= (ListView) findViewById(R.id.lv);
        final Downloderheri d=new Downloderheri(this,url,lv);

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