package com.example.encarta.newethioencarta.humans.famous;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import com.example.encarta.newethioencarta.Home;
import com.example.encarta.newethioencarta.Languge;

import com.example.encarta.newethioencarta.R;
import com.example.encarta.newethioencarta.history.MyA;

import java.util.ArrayList;


/*public class Historys extends AppCompatActivity {


    GridLayout mainGrid;    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historys);
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);
    }

    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(Historys.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(Historys.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(Historys.this,EthiHistory.class);
                    intent.putExtra("info","This is activity from card item index  "+finalI);
                    startActivity(intent);

                }
            });
        }
    }
}


*/


public class Efamous_people extends AppCompatActivity {
    ListView listView;
    ArrayList<Integer> idimages;
    ArrayList<String> namelist;
    MyA MyAaHumans;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efamous_people);
        listView = findViewById(R.id.listview);
        idimages = new ArrayList<>();
        namelist = new ArrayList<>();

        idimages = getList();
        namelist = getNamelist();
        MyAaHumans = new MyA(Efamous_people.this, idimages, namelist);
        listView.setAdapter(MyAaHumans);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent ethhistory=new Intent(Efamous_people.this,Abebebikala.class);
                    startActivityForResult(ethhistory,0);
                }
                if(position==1){
                    Intent amhi=new Intent(Efamous_people.this,Afewerktekla.class);
                    startActivityForResult(amhi,1);
                }
                if(position==2){
                    Intent l=new Intent(Efamous_people.this,Aklilulemma.class);
                    startActivityForResult(l,2);
                }
                if(position==3){
                    Intent ethhistory=new Intent(Efamous_people.this,Asteraweke.class);
                    startActivityForResult(ethhistory,3);
                }
                if(position==4){
                    Intent amhi=new Intent(Efamous_people.this,Haddisalemayehu.class);
                    startActivityForResult(amhi,4);
                }
                if(position==5){
                    Intent l=new Intent(Efamous_people.this,Hailegebreslasa.class);
                    startActivityForResult(l,5);
                }
                if(position==6){
                    Intent l=new Intent(Efamous_people.this,Hailegrma.class);
                    startActivityForResult(l,6);
                }
            }
        });
/*listView.setOnClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
Intent intent=new Intent(Efamous_people.this,Scince_and_Nature.class);
startActivity(intent);
    }
}); */}

    public ArrayList<Integer> getList(){
        idimages=new ArrayList<>();
        idimages.add(R.drawable.abebe_bikila);
        idimages.add(R.drawable.afewerk_tekle);
        idimages.add(R.drawable.aklilu_lemma);
        idimages.add(R.drawable.aster_aweke);
        idimages.add(R.drawable.haddis);
        idimages.add(R.drawable.haile_gebrselassie);
        idimages.add(R.drawable.haile_gerima);

        return idimages;
    }
    public ArrayList<String> getNamelist(){
        namelist=new ArrayList<>();
        namelist.add(getString( R.string.abebelist));
        namelist.add(getString( R.string.afewrklis));
        namelist.add(getString( R.string.aklilulist));
        namelist.add(getString( R.string.astarlist));
         namelist.add(getString( R.string.haddislist));
        namelist.add(getString( R.string.hailegbsllist));
         namelist.add(getString( R.string.hailagrmalist));


        return namelist;
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
            Intent Setting=new Intent(Efamous_people.this,Languge.class);
            startActivities(new Intent[]{Setting});
        }
        if (id == R.id.Gotohome) {
            Intent Setting=new Intent(Efamous_people.this,Home.class);
            startActivities(new Intent[]{Setting});
        }

        return super.onOptionsItemSelected(item);
    }
}





