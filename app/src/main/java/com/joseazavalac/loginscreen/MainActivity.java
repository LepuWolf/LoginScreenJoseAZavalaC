package com.joseazavalac.loginscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Nombre = (EditText) findViewById(R.id.editTextTextPersonName);
        final EditText Contra = (EditText) findViewById(R.id.editTextTextPassword);

        Intent intentDatos = getIntent();
        Usuario u = (Usuario) intentDatos.getParcelableExtra("usuario");

        if(u!=null) {
            Nombre.setText(u.getNombre());
            Contra.setText(u.getContra());
        }

    }

    public void Registro(View view){
        Intent intentR = new Intent(this, RegisterActivity.class);
        startActivity(intentR);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CICLOVIDA" , "paso por onStart()");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CICLOVIDA" , "paso por onResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CICLOVIDA" , "paso por onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CICLOVIDA" , "paso por onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CICLOVIDA" , "paso por onDestroy()");
    }
}