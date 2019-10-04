package com.example.dni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    char array[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularLetra(View view) {

        TextView dniView = findViewById(R.id.dni);
        String dniString = dniView.getText().toString();
        float dniNumero = Float.parseFloat(dniString);

        int resultado = (int) (dniNumero%23);
        Log.d("MIAPP", "resultado: " + resultado);
        Log.d("MIAPP", "LETRA: " + array[resultado]);



    }
}
