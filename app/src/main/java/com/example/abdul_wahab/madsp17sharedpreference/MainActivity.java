package com.example.abdul_wahab.madsp17sharedpreference;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sp = getSharedPreferences("abc", MODE_PRIVATE);

        if (sp != null && (sp.getInt("k1",-999)!=999) ) {

            SharedPreferences.Editor et = sp.edit();
            et.putInt("k1", 123);
            et.apply();


        }








    }
}
