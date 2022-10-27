package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Diplomado {
    private String nombre;
    private List<Estudiante> estudiantes;
    private int cupo;


    public void registrar(String nombre, String numeroIdentificacion, Genero genero){
        estudiantes.add(new Estudiante(nombre, numeroIdentificacion, genero));
    }

    public Diplomado(String nombre, int cupo) {
        this.nombre = nombre;
        this.cupo = cupo;
        this.estudiantes = new ArrayList<>();
    }
    //MALO EN getIdentificacion.
    public Estudiante buscarEstudiante(String numeroIdentificacion){
        return  estudiantes.stream().filter(x -> x.getNumeroIdentificacion().equals(numeroIdentificacion)).collect(Collectors.toList()).get(0);

    }


    /*
    public Optional<Estudiante> buscarEstudiante(String numeroIdentificacion){
        return  estudiantes.stream().filter(x -> x.getNumeroIdentificacion().equals(numeroIdentificacion)).findFirst();

    }
    */

    public List<Estudiante> buscarGanaron(int parcial){
        return  estudiantes.stream().filter(x -> x.getNota(parcial) >= 3.0f).collect(Collectors.toList());
    }

    public List<Estudiante> buscarPerdieron(int parcial){
        return  estudiantes.stream().filter(x -> x.getNota(parcial) < 3.0f).collect(Collectors.toList());
    }

    public Reporte generarReporte(int parcial){
        List<EstudianteNotaDTO> estudianteNotaDTOS = estudiantes.stream().map(estudiante -> {
            return new EstudianteNotaDTO(estudiante.getNombre(), estudiante.getNumeroIdentificacion(), estudiante.getNota(parcial));

        }).collect(Collectors.toList());


        Reporte reporte = new Reporte("Parcial: "+parcial, estudianteNotaDTOS);

        return reporte;
    }

    public Reporte generarReporte(int parcial, Genero genero){
        List<EstudianteNotaDTO> estudianteNotaDTOS = estudiantes.stream()
                .filter(x -> x.getGenero().equals(genero))
                .map(estudiante -> {
            return new EstudianteNotaDTO(estudiante.getNombre(), estudiante.getNumeroIdentificacion(), estudiante.getNota(parcial));

        }).collect(Collectors.toList());


        Reporte reporte = new Reporte("Parcial: "+parcial, estudianteNotaDTOS);

        return reporte;
    }


}
