package org.example;

import java.util.*;

public class Estudiante {

    private List<Float> notas;
    private String nombre;
    private  String numeroIdentificacion;
    private Genero genero;

    private DoubleSummaryStatistics summaryStatistics;

    public void adicionarNota(float nota) throws Exception{
        if( nota < 0){
            throw new Exception("La nota no puede ser menor a 0");
        }
        if( nota > 5){
            throw new Exception("La nota no puede ser mayor a 5");
        }

        notas.add(nota);
    }

    public double calcularPromedio(){
        //OptionalDouble resul = notas.stream().mapToDouble(Float::floatValue).average();

        //DoubleSummaryStatistics summary = notas.stream().mapToDouble(Float::floatValue).summaryStatistics();

        return summaryStatistics.getAverage();
    }

    public Estudiante(String nombre, String numeroIdentificacion, Genero genero) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.genero = genero;
        this.notas = new ArrayList<>();
        this.summaryStatistics =  notas.stream().mapToDouble(Float::floatValue).summaryStatistics();
    }

    public Object[] getNotasCopy() {
        Object[] resultado = Arrays.copyOf(notas.toArray(), notas.size());

        return resultado;
    }

    public List<Float> getNotas() {
        return notas;
    }

    public float getNota(int indice){
        //Verificacion
        return notas.indexOf(indice);
    }

    public float getNotasMax(){
        return (float) summaryStatistics.getMax();
    }

    public float getNotasMin(){
        return (float) summaryStatistics.getMin();
    }


    public Genero getGenero() {
        return genero;
    }


    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }
}
