package com.example.encarta.newethioencarta;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.encarta.newethioencarta.view.*;
import com.example.encarta.newethioencarta.viewethiopianhistory.TableHelper;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.listeners.TableDataClickListener;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;

public class tableview extends AppCompatActivity {
TextView textView;
    TableView<String[]> tb;
    TableHelper tableHelper;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tableview);

        tableHelper=new TableHelper(this);
        tb= (TableView<String[]>) findViewById(R.id.tav);
        tb.setColumnCount(1);
        tb.setHeaderBackgroundColor(Color.parseColor("#6789dcaa"));
        tb.setHeaderAdapter(new SimpleTableHeaderAdapter(this,tableHelper.getSpaceProbeHeaders()));
        tb.setSaveEnabled(true);

        Button viewm=(Button) findViewById(R.id.view);
        viewm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MYSQLClient(tableview.this).Retrive(tb);
            }
        });

        tb.addDataClickListener(new TableDataClickListener<String[]>() {
            @Override
            public void onDataClicked(int rowIndex, String[] clickedData) {
                Toast.makeText(tableview.this,((String[])clickedData)[1],Toast.LENGTH_SHORT).show();

            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.languge) {
            Intent Setting=new Intent(tableview.this,Languge.class);
            startActivities(new Intent[]{Setting});
        }
        if (id == R.id.Gotohome) {
            Intent Setting=new Intent(tableview.this,Home.class);
            startActivities(new Intent[]{Setting});
        }

        return super.onOptionsItemSelected(item);
    }
}
