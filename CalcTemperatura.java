package com.example.bisiestos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CalcTemperatura extends AppCompatActivity {

    private EditText temperatura;
    private Button botonF;
    private Button botonKelvin;
    private String temperaturaGuardada;
    private Double temperaturaFinal;
    private TextView resultadoTexto;
    private String resultado;
    private double temperaturaInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_temperatura);

        Intent intent = getIntent();


        temperatura = findViewById(R.id.temperaturaIN);


        botonF = findViewById(R.id.botonF);
        botonKelvin = findViewById(R.id.botonKelvin);


        resultadoTexto = findViewById(R.id.resultado);

        botonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temperaturaInt = Integer.parseInt(temperatura.getText().toString());
                temperaturaFinal = (temperaturaInt * 1.8) + 32;
                resultado = "El resultado es: " + temperaturaFinal;
                resultadoTexto.setText(resultado);
            }
        });

        botonKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temperaturaInt = Integer.parseInt(temperatura.getText().toString());
                temperaturaFinal = temperaturaInt + 273.15;
                resultado = "El resultado es: " + temperaturaFinal;
                resultadoTexto.setText(resultado);
            }
        });

    }

}



