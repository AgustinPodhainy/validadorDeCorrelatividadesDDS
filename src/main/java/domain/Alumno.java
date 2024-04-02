package domain;

import java.util.List;

public class Alumno {

    private List<Materia> materiasAprobadas;

    public boolean cumpleCorrelatividades(List<Materia> materias) {
        return materias.stream().allMatch(m->m.cumpleCorrelatividades(this.materiasAprobadas));
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

}
