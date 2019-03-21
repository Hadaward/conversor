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
    private NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
    private BigDecimal dolarValue = new BigDecimal("3.83");




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversao_rd);

    }

    public void onClick(View view){
        EditText real = findViewById(R.id.realToDolar);
        String toStr = String.valueOf(real.getText().toString());
        BigDecimal realToDolar = new BigDecimal(toStr).divide(dolarValue, RoundingMode.UP);
        String dinheiro = nf.format(realToDolar);
        TextView resultado = findViewById(R.id.resultado);
        resultado.setText(dinheiro);
    }

    public void voltar(View view){
        Intent voltar = new Intent(ConversaoActivityRD.this,MainActivity.class);
        startActivity(voltar);
    }
}
