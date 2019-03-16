package com.example.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ConversaoActivityRD extends AppCompatActivity {
    public double realToDolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversao_rd);

    }

    public void sendMessage(View view){
        Intent intent = new Intent(ConversaoActivityRD.this,Resultado.class);
        EditText real = (EditText) findViewById(R.id.realToDolar);
        realToDolar = Double.valueOf(real.getText().toString())/3.83;
        String dinheiro = "US$"+String.format("%.2f",String.valueOf(realToDolar));
        intent.putExtra("dinheiro", dinheiro);
        startActivity(intent);

    }

    public void voltar(View view){
        Intent voltar = new Intent(ConversaoActivityRD.this,MainActivity.class);
        startActivity(voltar);
    }
}
