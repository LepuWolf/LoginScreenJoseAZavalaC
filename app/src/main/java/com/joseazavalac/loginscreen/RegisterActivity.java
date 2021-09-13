package com.joseazavalac.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void Cancelar(View view){
        Intent intentC = new Intent(this, MainActivity.class);
        startActivity(intentC);
    }

    public void  Guardar(View view){
        EditText idnombre = findViewById(R.id.editTextTextPersonName2);
        EditText idtelefono = findViewById(R.id.editTextPhone);
        EditText idcorreo = findViewById(R.id.editTextTextEmailAddress);
        EditText idcontra = findViewById(R.id.txtPassword);

        String nombre = idnombre.getText().toString();
        String telefono = idtelefono.getText().toString();
        String correo = idcorreo.getText().toString();
        String contra = idcontra.getText().toString();

        Intent intentDatos = new Intent(this, MainActivity.class);
        Usuario usuario = new Usuario(nombre,telefono,correo,contra);
        intentDatos.putExtra("usuario", usuario);
        startActivity(intentDatos);

    }
}