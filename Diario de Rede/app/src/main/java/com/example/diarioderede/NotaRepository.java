package com.example.diarioderede;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotaRepository {

    private static final List<Nota> notaList=new ArrayList<>();
    private static long proximoId=1;

    public static  void  adicionar(String texto){
        notaList.add(new Nota(proximoId,texto,new Date()));
    }
    public static List<Nota> getNotaList(){
        return notaList;
    }
}
