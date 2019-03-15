package com.example.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        Intent receberValor = this.getIntent();
        Double dolar = receberValor.getDoubleExtra("dolar",0);
        TextView textView = (TextView) findViewById(R.id.resultado);
        textView.setText(dolar.toString());
    }




}
