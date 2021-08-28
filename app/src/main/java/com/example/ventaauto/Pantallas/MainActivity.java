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
        stock.add(new Automovil(1,"Ford", "Fiesta", 2020 , "Nafta", 15000, 4, 1000000, R.drawable.fordfiesta));
        stock.add(new Automovil(2,"Fiat", "Argo", 2018 , "Nafta", 36000, 5, 950000,R.drawable.fiarargo));
        stock.add(new Automovil(3,"Chevrolet", "Onix", 2019 , "Nafta", 30000, 4,970000,R.drawable.onix2019));
        stock.add(new Automovil(4,"Ford", "Ka", 2018 , "Nafta", 25000, 5, 930000, R.drawable.fordka));
        stock.add(new Automovil(5,"volkswagen", "Gol", 2012 , "Nafta", 125000, 5, 650000, R.drawable.gol2012));

        listViewAutos.setAdapter(new AutoAdapter(stock)); //asigno un adapter (AutoAdapter) al listView


        listViewAutos.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l){
                Automovil item = stock.get(pos); //con el metodo get() que recibe la posicion,  obtengo el item seleccinado de la lista

                Intent aDescripcion = new Intent ( );

                aDescripcion.putExtra("EXTRA_FOTO", item.getFoto());
                aDescripcion.putExtra("EXTRA_MARCA", item.getMarca());
                aDescripcion.putExtra("EXTRA_MODELO", item.getModelo());
                aDescripcion.putExtra("EXTRA_ANIO", item.getAnio());
                aDescripcion.putExtra("EXTRA_COMBUS", item.getCombustible());
                aDescripcion.putExtra("EXTRA_PUERTAS", item.getPuertas());
                aDescripcion.putExtra("EXTRA_KILO", item.getKilometros());
                aDescripcion.putExtra("EXTRA_VALOR", item.getPrecio());

                startActivity(aDescripcion);
            }

        });
    }
}