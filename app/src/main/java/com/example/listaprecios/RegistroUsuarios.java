package com.example.listaprecios;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RegistroUsuarios extends AppCompatActivity {

    private EditText oRegUser;
    private EditText oRegPass;
    private EditText oRegName1;
    private EditText oRegName2;
    private Spinner oSpinner;
    private String[] aGender = {"Hombre", "Mujer", "Prefiero no indicar"};
    public static Persona oUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuarios);

        oRegUser = findViewById(R.id.idRegUser);
        oRegPass = findViewById(R.id.idRegPass);
        oRegName1 = findViewById(R.id.idRegName);
        oRegName2 = findViewById(R.id.idRegName2);
        oSpinner = findViewById(R.id.idSpinner);
        oUsuario = new Persona();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, aGender);
        oSpinner.setAdapter(adapter);
    }

    public void Crear(View v)
    {
        //seteamos los datos del usuario
        oUsuario.setUsuario(fromEditTextToString(oRegUser));
        oUsuario.setContraseña(fromEditTextToString(oRegPass));
        oUsuario.setNombre(fromEditTextToString(oRegName1));
        oUsuario.setApellido(fromEditTextToString(oRegName2));
        oUsuario.setGenero(aGender[oSpinner.getSelectedItemPosition()]);
        //avisamos que ya existe el usuario
        MainActivity.IsRegistryCompleted = true;
        //regresamos el usuario al menu principal
        onBackPressed();
    }

    public String fromEditTextToString(EditText obj)
    {
        return obj.getText().toString();
    }
}
