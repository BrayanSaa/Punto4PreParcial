package org.example;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Reporte {

    private float notaMaximo;
    private float notaMinima;
    private float notaPromedio;
    private int numeroGanaron;
    private int numeroPerdieron;
    private String nombre;
    private List<EstudianteNotaDTO> estudiantes;
    private DoubleSummaryStatistics summaryStatistics;




    public Reporte(String nombre, List<EstudianteNotaDTO> notas) {
        this.nombre = nombre;
        this.estudiantes = notas;


        this.summaryStatistics =  notas.stream().mapToDouble(EstudianteNotaDTO::getNota).summaryStatistics();
        this.notaMaximo =(float) summaryStatistics.getMax();
        this.notaMinima= (float) summaryStatistics.getAverage();
        this.notaPromedio = (float) summaryStatistics.getAverage();
        this.numeroGanaron = estudiantes.stream().filter(x -> x.getNota() >= 3.0f).collect(Collectors.toList()).size();
        this.numeroPerdieron = estudiantes.stream().filter(x -> x.getNota() < 3.0f).collect(Collectors.toList()).size();
    }


    public float getNotaMaximo() {
        return notaMaximo;
    }

    public float getNotaMinima() {
        return notaMinima;
    }

    public float getNotaPromedio() {
        return notaPromedio;
    }

    public int getNumeroGanaron() {
        return numeroGanaron;
    }

    public int getNumeroPerdieron() {
        return numeroPerdieron;
    }

    public String getNombre() {
        return nombre;
    }

    public List<EstudianteNotaDTO> ordenarPorNombre(){
        //Hacer una copia
        estudiantes.sort(EstudianteNotaDTOComparator::compareNombre);
        return estudiantes;

    }

    public List<EstudianteNotaDTO> ordenarPorNota(){
        estudiantes.sort(EstudianteNotaDTOComparator::compareNota);
        return estudiantes;
    }

    public List<EstudianteNotaDTO> ordenarPorIdentificacio(){
        estudiantes.sort(EstudianteNotaDTOComparator::compareIdenticacion);
        return estudiantes;
    }


}

