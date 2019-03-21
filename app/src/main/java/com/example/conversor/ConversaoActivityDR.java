package com.example.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class ConversaoActivityDR extends AppCompatActivity {
    private NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    private BigDecimal dolarValue = new BigDecimal("3.83");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversao_dr);
    }

    public void onClick(View view){
        EditText real = findViewById(R.id.realToDolar);
        String toStr = String.valueOf(real.getText().toString());
        BigDecimal dolarToReal = (new BigDecimal(toStr).multiply(dolarValue));
        String dinheiro = nf.format(dolarToReal);
        TextView resultado = findViewById(R.id.resultado);
        resultado.setText(dinheiro);

    }

    public void voltar(View view){
        Intent voltar = new Intent(ConversaoActivityDR.this,MainActivity.class);
        startActivity(voltar);
    }
}
