package com.example.ventaauto.Pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ventaauto.R;

public class descripcionAuto extends AppCompatActivity {

    private TextView txtMarc,textModels,textanio,textCombus,textPuertas,textKilo,textValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_auto);

        asociar();




    }




    
    public void asociar(){
        txtMarc = findViewById(R.id.txtMarc);
        textModels = findViewById(R.id.txtModelo);
        textanio = findViewById(R.id.textanio);
        textCombus = findViewById(R.id.textCombus);
        textPuertas = findViewById(R.id.textPuertas);
        textKilo = findViewById(R.id.textKilo);
        textValor = findViewById(R.id.textValor);
    }
}