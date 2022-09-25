package com.example.encarta.newethioencarta.eduon;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class educonn {
    public static Object connect(String urlAddress) {
        try {
            URL urleh = new URL( urlAddress );
            HttpURLConnection con = (HttpURLConnection) urleh.openConnection();

            //SET CON PROPERTIES
            con.setRequestMethod( "GET" );
            con.setConnectTimeout( 15000 );
            con.setReadTimeout( 15000 );
            con.setDoInput( true );

            return con;

        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "Error " + e.getMessage();

        } catch (IOException e) {
            e.printStackTrace();
            return "Error " + e.getMessage();

        }
    }
}
