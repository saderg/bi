package com.example.bisiestos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcBisiestos extends AppCompatActivity {

    private Button botonComprobar;
    private EditText anio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_bisiestos);

        Intent intent = getIntent();

        botonComprobar = findViewById(R.id.botonComprobar);
        botonComprobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comprobar();
            }
        });
    }

    public void comprobar() {

        anio = findViewById(R.id.anio);
        int anio2 = Integer.parseInt(anio.getText().toString());

        TextView textView = findViewById(R.id.resultado);
        String resultado;

        if ((anio2 % 4 == 0)) {
            resultado = "Es bisiesto";
            textView.setText(resultado);
        }
        else{
            resultado = "No es bisiesto";
            textView.setText(resultado);
        }

    }
}