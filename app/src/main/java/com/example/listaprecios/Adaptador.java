package com.example.listaprecios;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderAdaptador> {

    ArrayList<Avistamiento> aProductos;

    public Adaptador(ArrayList<Avistamiento> aProductos) {
        this.aProductos = aProductos;
    }

    @NonNull
    @Override
    public ViewHolderAdaptador onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vw = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_adatador,null,false);
        return new ViewHolderAdaptador(vw);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderAdaptador holder, int position) {
        holder.asignarDatos(aProductos.get(position));
    }

    @Override
    public int getItemCount() {
        return aProductos.size();
    }

    public class ViewHolderAdaptador extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tv;
        TextView tv2;
        TextView tv3;
        Button mapButton;

        public ViewHolderAdaptador(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.idTextViewAdaptador);
            tv2 = itemView.findViewById(R.id.idTextViewAdaptador2);
            tv3 = itemView.findViewById(R.id.idTextViewAdaptador3);
            mapButton = itemView.findViewById(R.id.idMapButton);
            mapButton.setOnClickListener(this);
        }

        public void asignarDatos(Avistamiento producto) {
            tv.setText(producto.getNombre());
            tv2.setText(producto.getLatitud());
            tv3.setText(producto.getLongitud());
        }

        public void verEnMapa(View v)
        {
            Intent intento = new Intent(v.getContext(), MapsActivity.class);
            intento.putExtra("sitename", tv.getText().toString());
            intento.putExtra("sitelat", tv2.getText().toString());
            intento.putExtra("sitelong", tv3.getText().toString());
            v.getContext().startActivity(intento);
        }

        @Override
        public void onClick(View view) {
            verEnMapa(view);
        }
    }
}
