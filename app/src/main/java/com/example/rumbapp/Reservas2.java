package com.example.rumbapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Reservas2 extends AppCompatActivity {

    private Button btn_facebook;
    private Button btn_instagram;
    private Button btn_twitter;
    private Button btn_youtube;

    private TextView tv_nombreR;
    private TextView tv_fechaR;
    private TextView tv_baresR;
    private TextView tv_personasR;
    private TextView tv_promotoresR;
    private ImageView img_reservas2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservas2);

        btn_facebook = (Button) findViewById(R.id.btn_facebook);
        btn_instagram = (Button) findViewById(R.id.btn_instagram);
        btn_twitter = (Button) findViewById(R.id.btn_twitter);
        btn_youtube = (Button) findViewById(R.id.btn_youtube);

        tv_nombreR = (TextView) findViewById(R.id.tv_nombreR);
        tv_fechaR = (TextView) findViewById(R.id.tv_fechaR);
        tv_personasR = (TextView) findViewById(R.id.tv_personasR);
        tv_baresR = (TextView) findViewById(R.id.tv_baresR);
        tv_promotoresR = (TextView) findViewById(R.id.tv_promotoresR);
        img_reservas2 = (ImageView) findViewById(R.id.img_reservas2);


        String nombre = getIntent().getStringExtra("et_nombreR");
        String fecha = getIntent().getStringExtra("et_fechaR");
        String personas = getIntent().getStringExtra("et_personasR");
        String bares = getIntent().getStringExtra("sp_baresR");
        String promotores = getIntent().getStringExtra("sp_promotoresR");



        tv_nombreR.setText("Reserva: " + nombre);
        tv_fechaR.setText("Fecha: " + fecha);
        tv_personasR.setText("Personas total: " + personas);
        tv_baresR.setText("Bar:" + bares);
        tv_promotoresR.setText("Promotor:" + promotores);

        if(bares.equals("Morena")){
            img_reservas2.setImageResource(R.drawable.morenar);
        }else if(bares.equals("Sutton")){
            img_reservas2.setImageResource(R.drawable.suttonr);
        }else if(bares.equals("Adicta")){
            img_reservas2.setImageResource(R.drawable.adictar);
        }else if(bares.equals("TierraBomba")){
            img_reservas2.setImageResource(R.drawable.tierrabombar);
        }else if(bares.equals("Cangri")){
            img_reservas2.setImageResource(R.drawable.cangrir);
        }else if(bares.equals("Delicia")){
            img_reservas2.setImageResource(R.drawable.deliciar);
        }else if(bares.equals("Dembow")){
            img_reservas2.setImageResource(R.drawable.dembowr);
        }else if(bares.equals("Lio")){
            img_reservas2.setImageResource(R.drawable.lior);
        }else if(bares.equals("Vitoria")){
            img_reservas2.setImageResource(R.drawable.vitoriar);
        }
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

}
