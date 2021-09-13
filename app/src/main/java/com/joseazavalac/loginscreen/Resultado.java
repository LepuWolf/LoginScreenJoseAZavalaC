package com.joseazavalac.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        final TextView Nombre = (TextView) findViewById(R.id.datoNombre);
        final TextView Telefono = (TextView) findViewById(R.id.datoTelefono);
        final TextView Correo = (TextView) findViewById(R.id.datoCorreo);
        final TextView Contra = (TextView) findViewById(R.id.datoPassword);

        Intent intentDatos = getIntent();
        Usuario u = (Usuario) intentDatos.getParcelableExtra("usuario");


        Nombre.setText(u.getNombre());
        Telefono.setText(u.getTelefono());
        Correo.setText(u.getCorreo());
        Contra.setText(u.getContra());
    }

    public void Volver(View view){
        Intent intentV = new Intent(this, MainActivity.class);
        startActivity(intentV);
    }


}