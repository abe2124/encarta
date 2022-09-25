package com.example.encarta.newethioencarta;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.encarta.newethioencarta.hertages.Heritage;
import com.example.encarta.newethioencarta.history.Historys;
import com.example.encarta.newethioencarta.humans.Humans;
import com.example.encarta.newethioencarta.sance.Scince_and_Nature;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
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
                Intent Setting=new Intent(Home.this,Languge.class);
                startActivities(new Intent[]{Setting});
            }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Search) {
            Intent Search=new Intent(Home.this, com.example.encarta.newethioencarta.MainActivity.class);
            startActivities(new Intent[]{Search});

        if (id == R.id.home) {
            Intent Home = new Intent( Home.this, com.example.encarta.newethioencarta.Home.class );
            startActivities( new Intent[]{Home} );
        }
        } else if (id == R.id.history) {
            Intent History=new Intent(Home.this,Historys.class);
            startActivities(new Intent[]{History});

        } else if (id == R.id.human) {

            Intent Human=new Intent(Home.this,Humans.class);
            startActivities(new Intent[]{Human});

        } else if (id == R.id.music) {

            Intent Human=new Intent(Home.this,Musicandc.class);
            startActivities(new Intent[]{Human});

        } else if (id == R.id.netur) {

            Intent Human=new Intent(Home.this,Scince_and_Nature.class);
            startActivities(new Intent[]{Human});

        } else if (id == R.id.hritage) {
            Intent Human=new Intent(Home.this,Heritage.class);
            startActivities(new Intent[]{Human});

        }
        else if (id == R.id.Help) {
            Intent Human=new Intent(Home.this,help.class);
            startActivities(new Intent[]{Human});

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
