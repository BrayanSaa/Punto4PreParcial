package org.example;

import java.util.Comparator;

public class NotaComparator implements Comparator<EstudianteNotaDTO> {


        @Override
        public int compare(EstudianteNotaDTO o1, EstudianteNotaDTO o2) {
            int r = (int) (o1.getNota() - o2.getNota());

            return r;
    }
}

