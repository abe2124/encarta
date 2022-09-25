package com.example.encarta.newethioencarta.history;

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
import com.example.encarta.newethioencarta.humans.famous.Haddisalemayehu;

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


public class Solo extends AppCompatActivity {
    ListView listView;
    ArrayList<Integer> idimages;
    ArrayList<String> namelist;
    MyA MyAdasolo;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo);
        listView = findViewById(R.id.listviewmodern);
        idimages = new ArrayList<>();
        namelist = new ArrayList<>();

        idimages = getList();
        namelist = getNamelist();
        MyAdasolo = new MyA(Solo.this, idimages, namelist);
        listView.setAdapter(MyAdasolo);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent ethhistory=new Intent(Solo.this,Earlysolomonic.class);
                    startActivityForResult(ethhistory,0);
                }
                if(position==1){
                    Intent amhi=new Intent(Solo.this,Relationseurope.class);
                    startActivityForResult(amhi,1);
                }
                if(position==2){
                    Intent l=new Intent(Solo.this,Abyssinianwar.class);
                    startActivityForResult(l,2);
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
        idimages.add(R.drawable.tedross);
        idimages.add(R.drawable.italy);
        idimages.add(R.drawable.war);
      /*  idimages.add(R.drawable.war);
        idimages.add(R.drawable.war);
        idimages.add(R.drawable.abay);
*/
        return idimages;
    }
    public ArrayList<String> getNamelist(){
        namelist=new ArrayList<>();
        namelist.add("Early Solomonic period (1270–1529) ");
        namelist.add("Relations with Europe and Prester John");
        namelist.add(" The Abyssinian-Adal War (1529–1543)");
       /* namelist.add("Post–World War II period (1941–1974)");
        namelist.add("communist_period_1974-1991");
        namelist.add("Federal Democratic Republic (1991–present)");

*/
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
            Intent Setting=new Intent(Solo.this,Languge.class);
            startActivities(new Intent[]{Setting});
        }
        if (id == R.id.Gotohome) {
            Intent Setting=new Intent(Solo.this,Home.class);
            startActivities(new Intent[]{Setting});
        }

        return super.onOptionsItemSelected(item);
    }
}





