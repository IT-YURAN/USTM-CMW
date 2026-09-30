package com.example.diarioderede;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import  java.util.List;
import java.util.ArrayList;

public class DiarioActivity extends AppCompatActivity {


    private  final  List<Nota> notaList=new ArrayList<>();
    private  long proximoId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diario);

       // EditText editText=findViewById(R.id.edit_nota);
    }
}
