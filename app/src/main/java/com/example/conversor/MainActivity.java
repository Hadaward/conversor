package com.example.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {
    private static int TEMPO_ESPERA = 6000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view){
        Intent intent = new Intent(MainActivity.this,ConversaoActivityRD.class);
        startActivity(intent);

    };

    public void sendMessage2(View view){
        Intent intent = new Intent(MainActivity.this,ConversaoActivityDR.class);
        startActivity(intent);

    };
}
