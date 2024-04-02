package domain;


import java.util.List;

public class Materia {
    private List<Materia> correlativas;

    public boolean cumpleCorrelatividades(List<Materia> materiasAprobadas) {
        return materiasAprobadas.containsAll(this.correlativas);
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }


}
