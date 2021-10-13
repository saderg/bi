package com.example.bisiestos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonBi;
        Button botonTemp;

        botonBi = findViewById(R.id.botonBisiestos);
        botonTemp = findViewById(R.id.botonTemperatura);

        botonBi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bisiestos(this);
            }
        });

        botonTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temperatura(this);
            }
        });

    }
    public void bisiestos(View.OnClickListener view){
        Intent intent = new Intent(this, CalcBisiestos.class);
        startActivity(intent);
    }
    public void temperatura(View.OnClickListener view){
        Intent intent = new Intent(this, CalcTemperatura.class);
        startActivity(intent);
    }

}