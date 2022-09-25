package com.example.encarta.newethioencarta.sance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.encarta.newethioencarta.Home;
import com.example.encarta.newethioencarta.Languge;
import com.example.encarta.newethioencarta.MainActivity;
import com.example.encarta.newethioencarta.R;
import com.example.encarta.newethioencarta.heritageon;
import com.example.encarta.newethioencarta.tableview;

public class  Butiful_naturs extends AppCompatActivity implements View.OnClickListener{
    private Button button,abe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_butiful_naturs);

        button=(Button)findViewById(R.id.more);
        abe=(Button)findViewById(R.id.abebebikalan);

        button.setOnClickListener( this );
        abe.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.more:
                Intent intent=new Intent(Butiful_naturs.this,heritageon.class);
                startActivity(intent);
                break;
            case R.id.abebebikalan:
                Intent intentabe=new Intent(Butiful_naturs.this,MainActivity.class);
                startActivity(intentabe);
                break;
        }
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
            Intent Setting=new Intent(Butiful_naturs.this,Languge.class);
            startActivities(new Intent[]{Setting});
        }
        if (id == R.id.Gotohome) {
            Intent Setting=new Intent(Butiful_naturs.this,Home.class);
            startActivities(new Intent[]{Setting});
        }

        return super.onOptionsItemSelected(item);
    }
}
