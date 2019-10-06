package com.example.dni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class LetraAnimadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_animada);

        Intent intent = getIntent();

        char letra = intent.getCharExtra("letra", '@');

        TextView tv = (TextView)findViewById(R.id.textLetra);
        tv.setText(String.valueOf(letra));
        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.animacion);
        tv.startAnimation(animacion);
    }
}
