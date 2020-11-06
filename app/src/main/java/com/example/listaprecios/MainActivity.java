package com.example.listaprecios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Avistamiento> aAvistamientos;

    private Button oRegistro1;
    private Button oRegistro2;
    private Button oRegistro3;
    private TextView oWelcome;

    public static boolean IsRegistryCompleted = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aAvistamientos = new ArrayList<>();

        oWelcome = findViewById(R.id.idWelcomeText);
        oRegistro1 = findViewById(R.id.idRegistro1);
        oRegistro2 = findViewById(R.id.idAgregarLista);
        oRegistro3 = findViewById(R.id.button2);

        oRegistro2.setEnabled(false);
        oRegistro3.setEnabled(false);
    }

    @Override
    protected void onResume() {
        super.onResume();

        //si ya tenemos un usuario registrado en la vuelta hacia esta actividad
        //activamos las opciones y bloqueamos el registro
        //finalmente le avisamos que se activaron las opciones
        if (IsRegistryCompleted)
        {
            oWelcome.setText("¡Bienvenido " + RegistroUsuarios.oUsuario.getNombre() + " " + RegistroUsuarios.oUsuario.getApellido() + "!");
            IsRegistryCompleted = false; //lo usaremos una vez la creación, asi que seteamos esto a falso denuevo para evitar que se repita en cada resumen.
            oRegistro1.setEnabled(false);
            oRegistro2.setEnabled(true);
            oRegistro3.setEnabled(true);
            Toast.makeText(getApplicationContext(), "El usuario ha sido creado. Se activaron las opciones de usuario.", Toast.LENGTH_SHORT).show();
        }
    }

    public void RegistroUsuario(View v)
    {
        Intent intento = new Intent(getApplicationContext(), RegistroUsuarios.class);
        startActivity(intento);
    }

    public void RegistroAves(View v)
    {
        Intent intento = new Intent(getApplicationContext(), RegistroAves.class);
        startActivity(intento);
    }

    public void Catalogo(View v)
    {
        Intent intento = new Intent(getApplicationContext(), SecondActivity.class);
        intento.putExtra("aavistamientos", aAvistamientos);
        startActivity(intento);
    }
}