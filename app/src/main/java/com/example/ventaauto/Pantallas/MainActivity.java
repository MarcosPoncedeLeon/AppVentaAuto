package com.example.ventaauto.Pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ventaauto.Adapter.AutoAdapter;
import com.example.ventaauto.Model.Automovil;
import com.example.ventaauto.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //atributo de la clase
    private ListView listViewAutos;

    //atributo de clase, lista de automovil
    private List<Automovil> stock;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //vinculo atributo con objeto de la vista
        listViewAutos = findViewById(R.id.listViewAutos);

        stock = new ArrayList<Automovil>();
        stock.add(new Automovil(1,"Ford", "Fiesta", 2020 , "Nafta", 15000, 4, 1000000));
        stock.add(new Automovil(2,"Fiat", "Argo", 2018 , "Nafta", 36000, 5, 950000));
        stock.add(new Automovil(3,"Chevrolet", "Onix", 2019 , "Nafta", 30000, 4,970000));
        stock.add(new Automovil(4,"Ford", "Ka", 2018 , "Nafta", 25000, 5, 930000));

        listViewAutos.setAdapter(new AutoAdapter(stock)); //asigno un adapter (AutoAdapter) al listView

        /*
        listViewAutos.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l){
                Automovil item = stock.get(pos);
                Intent aDescripcion = new Intent (MainActivity.this, descripcionAuto.class);
                startActivity(aDescripcion);
            }

        });*/
    }
}