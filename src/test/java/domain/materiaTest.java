package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class materiaTest {

    Materia fisicaII = new Materia();
    Materia fisicaI = new Materia();
    Materia aMI = new Materia();
    Materia matSup = new Materia();
    List<Materia> materiasAprobadas = new ArrayList<>();

    @Test
    public void materiaCumpleConCondicionDeCorrelativas(){

        fisicaII.agregarCorrelativas(fisicaI, aMI);

        materiasAprobadas.add(fisicaI);
        materiasAprobadas.add(aMI);
        materiasAprobadas.add(matSup);

        Assert.assertTrue(fisicaII.cumpleCorrelatividades(materiasAprobadas));

    }
}