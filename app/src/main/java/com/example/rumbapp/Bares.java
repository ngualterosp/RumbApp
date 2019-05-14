package com.example.rumbapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Bares extends AppCompatActivity {
    Context contexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        contexto=this;

    }

    public void Selecccion(View view) {

     //   switch (view.getId()) {
       //     case R.id.Sutton:
                //new dialogo_sutton(contexto);
         //       break;

        //}
    }
}
