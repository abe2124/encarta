package com.example.encarta.newethioencarta.viewethiopianhistory;

import android.content.Context;

import com.example.encarta.newethioencarta.view.SetterClass;

import java.util.ArrayList;

/**
 * Created by Encarta on 4/29/2018.
 */

public class TableHelper {
    Context c;
    private  String[] spaceProbeHeaders={"eduinformation"};
    private String[][]box;
    public TableHelper(Context cxt){
        this.c=cxt;
    }
    public String[] getSpaceProbeHeaders(){

        return spaceProbeHeaders;
    }
    public String[][] returnspaceProbaArray(ArrayList<com.example.encarta.newethioencarta.view.SetterClass> spacecraft){
        SetterClass s;
        box=new String[spacecraft.size()][1];
        for (int i=0;i<spacecraft.size();i++){
            s=spacecraft.get(i);

            box[i][0]=s.getInformation();

        }
        return box;

    }
}
