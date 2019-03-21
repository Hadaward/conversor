package com.example.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class ConversaoActivityRD extends AppCompatActivity {
    private double dolarValue = 3.83;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversao_rd);

    }

    public void sendMessage(View view){
        Intent calc = new Intent(ConversaoActivityRD.this,Resultado.class);
        EditText real = findViewById(R.id.realToDolar);
        Double calculo = Double.valueOf(real.getText().toString())/dolarValue;
        String dinheiro = "US$"+String.valueOf(calculo);
        calc.putExtra("calc",dinheiro);
        startActivity(calc);
    }

    public void voltar(View view){
        Intent voltar = new Intent(ConversaoActivityRD.this,MainActivity.class);
        startActivity(voltar);
    }
}
