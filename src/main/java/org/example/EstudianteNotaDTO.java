package org.example;

import java.util.List;

public class EstudianteNotaDTO {

    private String nombre;
    private  String numeroIdentificacion;
    private Float nota;

    public EstudianteNotaDTO(String nombre, String numeroIdentificacion, Float nota) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public Float getNota() {
        return nota;
    }
}




