package com.example.diarioderede;


import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textEstadoRede;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textEstadoRede=findViewById(R.id.estadoRede);
        String estadoRede=NetworkUtils.getNetworkType(this);
        textEstadoRede.setText(estadoRede);



    }
}