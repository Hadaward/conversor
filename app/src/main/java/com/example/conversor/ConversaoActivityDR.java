package com.example.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class ConversaoActivityDR extends AppCompatActivity {
    private double dolarValue = 3.83;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversao_dr);

    }

    public void sendMessage(View view){
        Intent calc = new Intent(ConversaoActivityDR.this,Resultado.class);
        EditText real = findViewById(R.id.dolarToReal);
        Double calculo = Double.valueOf(real.getText().toString())*dolarValue;
        String dinheiro = "R$"+String.valueOf(calculo);
        calc.putExtra("calc",dinheiro);
        startActivity(calc);
    }

    public void voltar(View view){
        Intent voltar = new Intent(ConversaoActivityDR.this,MainActivity.class);
        startActivity(voltar);
    }
}
