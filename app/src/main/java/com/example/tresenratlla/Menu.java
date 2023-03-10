package com.example.tresenratlla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Menu extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_logout:
               Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                return true;
            case R.id.action_options:
                Intent i2 = new Intent(this, Opciones.class);
                startActivity(i2);
                return true;
            case R.id.action_acerca:
                Intent i3 = new Intent(this, AcercaDe.class);
                startActivity(i3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }




    public void jugar(View view) {
        Intent i = new Intent(getApplicationContext(), Juego.class);
        startActivity(i);
    }
    public void perfil(View view) {
        Intent i2 = new Intent(getApplicationContext(), Perfil.class);
        startActivity(i2);
    }
    public void historial(View view) {
        Intent i3 = new Intent(getApplicationContext(), Historial.class);
        startActivity(i3);
    }
}