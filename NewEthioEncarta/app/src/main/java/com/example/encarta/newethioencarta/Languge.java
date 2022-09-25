package com.example.encarta.newethioencarta;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.example.encarta.newethioencarta.humans.cultures.Language;

import java.util.Locale;

public class Languge extends AppCompatActivity {

public Button Chengelang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        LodeLocale();
        setContentView( R.layout.activity_languge );
        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle(getResources().getString( R.string.lp)  );
        Button Chengelang = (Button) findViewById( R.id.changeMyLang );
        Chengelang.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showChengeLanguageDialog();
            }


        } );
    }

    private void showChengeLanguageDialog() {
            final String[] listitems={getString( R.string.amharic),getString( R.string.English)};
            AlertDialog.Builder mBiulder=new AlertDialog.Builder( Languge.this );
            mBiulder.setTitle( R.string.Chose_languge );
            mBiulder.setSingleChoiceItems( listitems, -1, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if(i==0){
                        setLocale("am");
                        recreate();
                    }
                    if(i==1){
                        setLocale("en-rUM");
                        recreate();
                    }
                    dialogInterface.dismiss();

                }
            } );
            AlertDialog mDialog=mBiulder.create();
            mDialog.show();
        }

        private void setLocale(String lang) {
            Locale locale=new Locale(lang);
            Locale.setDefault(locale);
            Configuration config=new Configuration(  );
            config.locale=locale;
            getBaseContext().getResources().updateConfiguration( config,getBaseContext().getResources().getDisplayMetrics());
            SharedPreferences.Editor editor=getSharedPreferences( getString( R.string.Setting),MODE_PRIVATE).edit() ;
            editor.putString( getString( R.string.your_languge),lang );
            editor.apply();

        }
        public void LodeLocale() {
            SharedPreferences prif=getSharedPreferences( getString( R.string.Setting), Activity.MODE_PRIVATE);
            String languge=prif.getString( getString( R.string.your_languge),"" );
            setLocale(languge);
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
            Intent Setting=new Intent(Languge.this,Languge.class);
            startActivities(new Intent[]{Setting});
        }
        if (id == R.id.Gotohome) {
            Intent Setting=new Intent(Languge.this,Home.class);
            startActivities(new Intent[]{Setting});
        }

        return super.onOptionsItemSelected(item);
    }

    }



