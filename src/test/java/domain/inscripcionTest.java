package domain;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class inscripcionTest {


    Materia fisicaII = new Materia();
    Materia fisicaI = new Materia();
    Materia aMI = new Materia();
    Materia matSup = new Materia();
    Inscripcion inscripcion= new Inscripcion();

    @Test
    public void laInscripcionEsAceptada() {
        fisicaII.agregarCorrelativas(fisicaI);
        matSup.agregarCorrelativas(aMI);

        inscripcion.agregarMateriasSolicitadas(fisicaII, matSup);
        Alumno alumno= inscripcion.getAlumnoAInscribir();

        alumno.aprobarMaterias(fisicaI, aMI);

        Assert.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void laInscripcionEsRechazada(){
        fisicaII.agregarCorrelativas(fisicaI);
        matSup.agregarCorrelativas(aMI);

        inscripcion.agregarMateriasSolicitadas(fisicaII, matSup);
        Alumno alumno= inscripcion.getAlumnoAInscribir();

        alumno.aprobarMaterias(aMI);

        Assert.assertFalse(inscripcion.aprobada());
    }

}
