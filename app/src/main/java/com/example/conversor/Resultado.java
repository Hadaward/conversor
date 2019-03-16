package com.example.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        Intent receberValor = this.getIntent();
        TextView textView = (TextView) findViewById(R.id.resultado);
        String dinheiro = receberValor.getStringExtra("dinheiro");
        textView.setText(dinheiro);

    }

    public void voltar(View view){
        Intent voltar = new Intent(Resultado.this,MainActivity.class);
        startActivity(voltar);
    }
}
