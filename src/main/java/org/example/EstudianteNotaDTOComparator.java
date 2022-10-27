package org.example;

public class EstudianteNotaDTOComparator {

    public static int compareNombre(EstudianteNotaDTO e1, EstudianteNotaDTO e2) {
        int r = e1.getNombre().compareTo(e2.getNombre());

        return r;
    }

    public static int compareNota(EstudianteNotaDTO o1, EstudianteNotaDTO o2) {
        int r = (int) (o1.getNota() - o2.getNota());

        return r;
    }

    public static int compareIdenticacion(EstudianteNotaDTO e1, EstudianteNotaDTO e2) {
        int r = e1.getNumeroIdentificacion().compareTo(e2.getNumeroIdentificacion());
        return r;
    }


}
