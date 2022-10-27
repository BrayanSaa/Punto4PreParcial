package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiplomadoTest {
    @Test
    void Diplomado() {

        Diplomado diplomado = new Diplomado("Uni", 3);

        Estudiante e1 = new Estudiante("Erik", "1234", Genero.MACULINO);
        Estudiante e2 = new Estudiante("ANA", "1234", Genero.FEMENINO);
        //Como adicionar una nota a aun obejto ya creado?
        diplomado.registrar("Eli", "4321", Genero.FEMENINO);





        try {
            e1.adicionarNota(4.0f);
            e2.adicionarNota(3.0f);

        } catch (Exception e) {
            fail(e);
        }

        Reporte reporte1 = diplomado.generarReporte(0);
        Reporte reporte2 = diplomado.generarReporte(0, Genero.MACULINO);

        ///Probar metodos////


    }
    }