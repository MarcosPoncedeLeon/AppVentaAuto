package com.example.ventaauto.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ventaauto.Model.Automovil;
import com.example.ventaauto.R;
import java.util.List;

public class AutoAdapter extends BaseAdapter {

    private List<Automovil> listadoAutos;


    //constructor
    public AutoAdapter(List<Automovil> lista) {this.listadoAutos = lista;}


    @Override
    public int getCount() {
        return listadoAutos.size();
    }

    @Override
    public Automovil getItem(int position) {

        return listadoAutos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();  //del item seleccionado obtengo el id0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vista; //creo una vista

        //filtro. veo si esta completo el convertView(cantidad de celdas para completar la pantalla).
        if(convertView == null){
            vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_lista_autos, parent,false);
        }else{
            vista = convertView;
        }

        Automovil item = getItem(position);

        TextView txtMarca  = vista.findViewById(R.id.txtMarca);
        TextView txtModelo =  vista.findViewById(R.id.txtModelo);
        TextView txtAnio =  vista.findViewById(R.id.txtAnio);
        TextView txtPrecio = vista.findViewById(R.id.txtPrecio);

        txtMarca.setText(item.getMarca());
        txtModelo.setText(item.getModelo());
        // txtAnio.setText(item.getAnio());
        //txtPrecio.setText(item.getPrecio());

        return vista;
    }
}
