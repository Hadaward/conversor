package com.example.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ConversaoActivity extends AppCompatActivity {
    public double realToDolar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversao);

    }

    public void sendMessage(View view){
        Intent intent = new Intent(ConversaoActivity.this,Resultado.class);
        EditText real = (EditText) findViewById(R.id.realToDolar);
        realToDolar = Double.valueOf(real.getText().toString())/3.83;
        intent.putExtra("dolar", realToDolar);
        startActivity(intent);

    };
}
