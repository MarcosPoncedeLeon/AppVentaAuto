package com.example.ventaauto.Pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ventaauto.R;

public class item_lista_autos extends AppCompatActivity {

    private TextView txtMarca, txtModelo, txtAnio, txtPrecio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_lista_autos);

        txtMarca = (TextView) findViewById(R.id.txtMarca);
        txtModelo = (TextView) findViewById(R.id.txtModelo);
        txtAnio = (TextView) findViewById(R.id.txtAnio);
        txtPrecio = (TextView) findViewById(R.id.txtPrecio);


    }
}