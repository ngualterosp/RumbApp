package com.example.rumbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
import java.text.DateFormat;
import java.util.Calendar;

public class Reservas extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private EditText et_nombreR;
    private EditText et_fechaR;
    private Button btn_fechaR;
    private Spinner sp_bares;
    private EditText et_personasR;
    private EditText et_cortesiasR;
    private EditText et_listaR;
    private Spinner sp_promotores;
    private ImageView img_barR;
    private Button btn_reservarR;
    private String part1;
    private String[] parts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservas);

        et_nombreR = (EditText) findViewById(R.id.et_nombreR);
        et_fechaR = (EditText) findViewById(R.id.et_fechaR);
        btn_fechaR = (Button) findViewById(R.id.btn_fechaR);
        btn_fechaR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(), "date picker");
            }
        });


        sp_bares = (Spinner) findViewById(R.id.sp_baresR);
        et_personasR = (EditText) findViewById(R.id.et_personasR);
        et_cortesiasR = (EditText) findViewById(R.id.et_cortesiasR);
        et_listaR = (EditText) findViewById(R.id.et_listaR);
        sp_promotores = (Spinner) findViewById(R.id.sp_promotoresR);
        img_barR = (ImageView) findViewById(R.id.img_barR);
        btn_reservarR = (Button) findViewById(R.id.btn_reservarR);


        String[] bares = {"Selecciona Bar", "Sutton", "Morena", "Adicta", "TierraBomba", "Cangri", "Delicia", "Dembow", "Lío", "Vitoria"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, bares);
        sp_bares.setAdapter(adapter);

        String[] promotores = {"Selecciona Promotor", "Nicolas", "Laura", "Andres", "Promotor1", "Promotor2"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, promotores);
        sp_promotores.setAdapter(adapter1);


    }


    public void btn_reservas2(View view) {

        Intent res2 = new Intent(this, Reservas2.class);

        res2.putExtra("et_nombreR", et_nombreR.getText().toString());
        res2.putExtra("et_fechaR", et_fechaR.getText().toString());
        res2.putExtra("sp_baresR", sp_bares.getSelectedItem().toString());
        res2.putExtra("et_personasR", et_personasR.getText().toString());
        res2.putExtra("et_cortesiasR", et_cortesiasR.getText().toString());
        res2.putExtra("et_listaR", et_listaR.getText().toString());
        res2.putExtra("sp_promotoresR", sp_promotores.getSelectedItem().toString());


        int cont = 0;

        if (et_nombreR.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "Completa el campo NOMBRE", Toast.LENGTH_LONG).show();
            cont++;
        }
        if (et_nombreR.getText().toString().matches("[0-9]+")) {
            Toast.makeText(this, "el campo nombre NO puede contener números", Toast.LENGTH_LONG).show();
            cont++;
        }

        if (et_fechaR.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "Completa el campo FECHA", Toast.LENGTH_SHORT).show();
            cont++;
        }

        if (part1.equals("domingo")) {
            Toast.makeText(this, "No es posible reservar los días DOMINGO", Toast.LENGTH_SHORT).show();
            cont++;
        }
        if (part1.equals("lunes")) {
            Toast.makeText(this, "No es posible reservar los días LUNES", Toast.LENGTH_SHORT).show();
            cont++;
        }
        if (part1.equals("martes")) {
            Toast.makeText(this, "No es posible reservar los días MARTES", Toast.LENGTH_SHORT).show();
            cont++;
        }
        if (part1.equals("miércoles")) {
            Toast.makeText(this, "No es posible reservar los días MIERCOLES", Toast.LENGTH_SHORT).show();
            cont++;
        }
        if (sp_bares.getSelectedItem().toString().equals("Selecciona Bar")) {
            Toast.makeText(this, "Selecciona un Bar", Toast.LENGTH_SHORT).show();
            cont++;
        }
        if (et_personasR.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "Completa el campo PERSONAS", Toast.LENGTH_SHORT).show();
            cont++;
        }
        if (et_cortesiasR.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "Completa el campo CORTESIAS", Toast.LENGTH_SHORT).show();
            cont++;
        } else {
            String personas = et_personasR.getText().toString();
            String cortesias = et_cortesiasR.getText().toString();
            int personasnum = Integer.parseInt(personas);
            int cortesiasnum = Integer.parseInt(cortesias);
            int resultado = (cortesiasnum * 100) / personasnum;

            if (resultado > 30) {
                Toast.makeText(this, "El numero de cortesias NO puede ser mayor al 30% de personas totales", Toast.LENGTH_SHORT).show();
                cont++;
            }
        }

        if (et_listaR.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "Completa el campo LISTA", Toast.LENGTH_SHORT).show();
            cont++;
        }
        if (sp_promotores.getSelectedItem().toString().equals("Selecciona Promotor")) {
            Toast.makeText(this, "Selecciona un promotor", Toast.LENGTH_SHORT).show();
            cont++;
        }

        if (cont == 0) {
            startActivity(res2);
            cont = 0;
        } else {
            cont = 0;
        }
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String current = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());
        parts = current.split(",");
        part1 = parts[0];
        et_fechaR.setText(current);
    }
}

