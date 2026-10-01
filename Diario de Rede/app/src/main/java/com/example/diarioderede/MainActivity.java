package com.example.diarioderede;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
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
        EditText editText=findViewById(R.id.edit_nota);

        Button buttovisualizar=findViewById(R.id.verNotas);

        Button buttonadicionar=findViewById(R.id.adicionarButton);

        buttonadicionar.setOnClickListener(v -> {
            String texto=editText.getText().toString().trim();
            if (texto.isEmpty()){
                editText.setError("Escreva uma nota");
                return;
            }
            NotaRepository.adicionar(texto);
        });

        buttovisualizar.setOnClickListener(v->
            startActivity(new Intent(MainActivity.this, DiarioActivity.class)));









    }
}