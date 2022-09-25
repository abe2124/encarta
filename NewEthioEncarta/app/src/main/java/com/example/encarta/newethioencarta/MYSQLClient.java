package com.example.encarta.newethioencarta;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;
import com.example.encarta.newethioencarta.view.SetterClass;

import com.example.encarta.newethioencarta.viewethiopianhistory.TableHelper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter;

import static com.example.encarta.newethioencarta.UrlClass.ServiceType.agricalture;

/**
 * Created by Encarta on 5/2/2018.
 */

public class MYSQLClient extends Activity {
    private SimpleTableDataAdapter adapter;
    String url=agricalture;
    private Context ctr;
    public MYSQLClient(Context c){
        this.ctr=c;
    }
    public void Retrive(final TableView tb){
        final ArrayList<SetterClass> spacecraft=new ArrayList<>();
        AndroidNetworking.get(url).setPriority(Priority.HIGH)
                .build().getAsJSONArray(new JSONArrayRequestListener() {
            public void onResponse(JSONArray response) {
                JSONObject ob;
                SetterClass sett;
                try{
                    for (int i=0;i<response.length();i++){
                        ob=response.getJSONObject(i);


                        String info=ob.getString("eduinformation");


                        sett=new SetterClass();
                        sett.setInformation(info);


                        spacecraft.add(sett);

                    }
                    adapter=new SimpleTableDataAdapter(ctr,new TableHelper(ctr).returnspaceProbaArray(spacecraft));
                    tb.setDataAdapter(adapter);
                }
                catch (JSONException j){
                    Toast.makeText(ctr,"error"+j.getMessage(),Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onError(ANError anError) {
                anError.printStackTrace();
                Toast.makeText(ctr,"error"+anError.getMessage(),Toast.LENGTH_LONG).show();
            }
        });


    }
}
