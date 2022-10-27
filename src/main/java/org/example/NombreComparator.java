package org.example;

import java.util.Comparator;

public class NombreComparator implements Comparator<EstudianteNotaDTO> {


    @Override
    public int compare(EstudianteNotaDTO e1, EstudianteNotaDTO e2) {
        int r = e1.getNombre().compareTo(e2.getNombre());

        return r;
    }
}
