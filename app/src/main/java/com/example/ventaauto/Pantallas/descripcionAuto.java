package com.example.ventaauto.Pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ventaauto.R;

public class descripcionAuto extends AppCompatActivity {

    private TextView txtMarc,textModels,textanio,textCombus,textPuertas,textKilo,textValor;
    private ImageView imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_auto);

        asociar();

        Intent receptor = getIntent();


        imageView3.setImageResource (receptor.getIntExtra("EXTRA_FOTO", 0));
        txtMarc.setText(receptor.getStringExtra("EXTRA_MARCA"));
        //textModels.setText(receptor.getStringExtra("EXTRA_MODELO"));
                         //convierto a String el valor entero recibido
        textanio.setText(String.valueOf(receptor.getIntExtra("EXTRA_ANIO", 0)));
        textCombus.setText(receptor.getStringExtra("EXTRA_COMBUS"));
        textPuertas.setText((String.valueOf(receptor.getIntExtra("EXTRA_PUERTAS", 0))));
        textKilo.setText(String.valueOf(receptor.getIntExtra("EXTRA_KILO", 0)));
        textValor.setText(String.valueOf(receptor.getIntExtra("EXTRA_VALOR", 0)));




    }




    
    public void asociar(){
        imageView3 = findViewById(R.id.imageView3);
        txtMarc = findViewById(R.id.txtMarc);
        textModels = findViewById(R.id.txtModelo);
        textanio = findViewById(R.id.textanio);
        textCombus = findViewById(R.id.textCombus);
        textPuertas = findViewById(R.id.textPuertas);
        textKilo = findViewById(R.id.textKilo);
        textValor = findViewById(R.id.textValor);
    }
}