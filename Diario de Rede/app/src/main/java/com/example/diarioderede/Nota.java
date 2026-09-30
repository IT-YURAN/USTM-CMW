package com.example.diarioderede;

import java.util.Date;

public class Nota {

    Long id;
    String nota;
    Date dataHora;

    public Nota(Long id, String nota, Date dataHora) {
        this.id = id;
        this.nota = nota;
        this.dataHora = dataHora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "id=" + id +
                ", nota='" + nota + '\'' +
                ", dataHora=" + dataHora +
                '}';
    }
}
