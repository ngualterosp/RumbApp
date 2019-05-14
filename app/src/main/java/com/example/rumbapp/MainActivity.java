package com.example.rumbapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_facebook;
    private Button btn_instagram;
    private Button btn_twitter;
    private Button btn_youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_facebook = (Button) findViewById(R.id.btn_facebook);
        btn_instagram = (Button) findViewById(R.id.btn_instagram);
        btn_twitter = (Button) findViewById(R.id.btn_twitter);
        btn_youtube = (Button) findViewById(R.id.btn_youtube);

    }

    // Boton de Facebook
    public void Facebook (View view){

        btn_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.facebook.com/PARTY-STATE-1865151583739323/?ref=br_rs");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

    }

    // Boton de Instagram
    public void Instagram (View view){

        btn_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/party_state/?hl=es-la");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

    }

    // Boton de Twitter
    public void Twitter (View view){

        btn_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://twitter.com/Nicogualteros_");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

    }

    // Boton de Youtube
    public void Youtube (View view){

        btn_youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCakBWClsUQaE2KxPIKCCurw");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

    }


    public void btn_reservas (View view){
        Intent Reservas =  new Intent(this, Reservas.class);
        startActivity(Reservas);
    }


    public void btn_bares (View view){
        Intent Bares =  new Intent(this, Bares.class);
        startActivity(Bares);
    }
 /**
    public void  btn_eventos (View view){
        Intent Eventos = new Intent(this, Eventos.class);
        startActivity(Eventos);
    }
 **/
    public void btn_Hits (View view){
        Intent Hits = new Intent(this, Hits.class);
        startActivity(Hits);
    }



}
