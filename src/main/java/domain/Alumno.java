package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {

    private List<Materia> materiasAprobadas;

    public boolean cumpleCorrelatividades(List<Materia> materias) {
        return materias.stream().allMatch(m->m.cumpleCorrelatividades(this.materiasAprobadas));
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public Alumno() {
        this.materiasAprobadas = new ArrayList<>();
    }

    public void aprobarMaterias(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }
}
