package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class alumnoTest {
    Materia matSup = new Materia();
    Materia algebra = new Materia();
    Alumno alumno = new Alumno();

    @Test
    public void alumnoTiene2MateriasAprobadas(){
        alumno.aprobarMaterias(matSup, algebra);
        Assert.assertEquals(2, alumno.getMateriasAprobadas().size());
    }

}

