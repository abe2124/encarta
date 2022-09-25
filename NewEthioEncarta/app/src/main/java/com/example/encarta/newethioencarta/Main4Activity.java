package com.example.encarta.newethioencarta;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.encarta.newethioencarta.cultureon.Download;
import com.example.encarta.newethioencarta.eduon.Downloadedu;
import com.example.encarta.newethioencarta.mysqllistview.Downloader;

import static com.example.encarta.newethioencarta.UrlClass.ServiceType.agricalture;
import static com.example.encarta.newethioencarta.UrlClass.ServiceType.culturep;
import static com.example.encarta.newethioencarta.UrlClass.ServiceType.educationp;

public class Main4Activity extends AppCompatActivity {

    String url=educationp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        final ListView lv= (ListView) findViewById(R.id.lv);
        final Downloadedu d=new Downloadedu(this,url,lv);

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