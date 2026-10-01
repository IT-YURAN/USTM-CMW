package com.example.diarioderede;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


public class DiarioActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diario);

        ListView listView=findViewById(R.id.listaNotas);
        ArrayAdapter<Nota> adapter=new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,NotaRepository.getNotaList()
        );
        listView.setAdapter(adapter);

       // EditText editText=findViewById(R.id.edit_nota);
    }
}
