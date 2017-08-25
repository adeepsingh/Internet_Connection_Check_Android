package com.example.amar0_000.internet_connection_check;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(amIConnected())  {

            Log.i("TRUE", "User is Connected");
            Toast.makeText(MainActivity.this, "Internet Connection is Available", Toast.LENGTH_LONG).show();

        }   else    {

            Log.i("TRUE", "User is Not Connected");
            Toast.makeText(MainActivity.this, "Internet Connection is Not Available", Toast.LENGTH_LONG).show();

        }

    }

    private boolean amIConnected()  {

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();

        return activeNetworkInfo != null && activeNetworkInfo.isConnected();

    }

}
