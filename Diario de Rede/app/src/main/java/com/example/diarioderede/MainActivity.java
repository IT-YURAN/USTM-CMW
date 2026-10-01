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

        Button buttonDiario=findViewById(R.id.verNotas);
        Button buttonvisualizar=findViewById(R.id.diarioButton);


        buttonDiario.setOnClickListener(v->{
            Intent intent=new Intent(MainActivity.this,DiarioActivity.class);
            startActivity(intent);
        });

        buttonvisualizar.setOnClickListener(v -> {
            String texto=editText.getText().toString().trim();
            if (texto.isEmpty()){
                editText.setError("Escreva uma nota");
                return;
            }
            NotaRepository.adicionar(texto);
            editText.setText("");
        });
        buttonvisualizar.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, DiarioActivity.class));
        });




    }
}