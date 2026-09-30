package com.example.diarioderede;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
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

        Button buttonDiario=findViewById(R.id.verNotas);

        buttonDiario.setOnClickListener(v->{
            Intent intent=new Intent(MainActivity.this,DiarioActivity.class);
            startActivity(intent);
        });






    }
}