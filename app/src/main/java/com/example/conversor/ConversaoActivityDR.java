package com.example.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static java.lang.String.*;

public class ConversaoActivityDR extends AppCompatActivity {
    public double dolarToReal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversao_dr);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(ConversaoActivityDR.this,Resultado.class);
        EditText dolar = (EditText) findViewById(R.id.dolarToReal);
        dolarToReal = Double.valueOf(dolar.getText().toString())*3.83;
        String dinheiro = "R$"+String.format("%.2f",String.valueOf(dolarToReal));
        intent.putExtra("dinheiro", dinheiro);
        startActivity(intent);

    }

    public void voltar(View view){
        Intent voltar = new Intent(ConversaoActivityDR.this,MainActivity.class);
        startActivity(voltar);
    }
}
