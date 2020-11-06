package com.example.listaprecios;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegistroAves extends AppCompatActivity {

    private EditText oSiteName;
    private EditText oSiteLat;
    private EditText oSiteLong;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_aves);

        oSiteName = findViewById(R.id.idSiteName);
        oSiteLat = findViewById(R.id.idSiteLat);
        oSiteLong = findViewById(R.id.idSiteLong);

    }

    public void Añadir(View v)
    {
        Avistamiento avis = new Avistamiento();
        avis.setNombre(oSiteName.getText().toString());
        avis.setLatitud(oSiteLat.getText().toString());
        avis.setLongitud(oSiteLong.getText().toString());

        MainActivity.aAvistamientos.add(avis);
        onBackPressed();
        Toast.makeText(getApplicationContext(), "Se agregó " + avis.getNombre(), Toast.LENGTH_SHORT).show();
    }
}
