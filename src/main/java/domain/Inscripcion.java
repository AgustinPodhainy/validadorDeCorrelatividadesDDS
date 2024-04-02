package domain;


import java.util.List;

public class Inscripcion {
   private Alumno alumnoAInscribir;
   private List<Materia> materiasSolicitadas;

   private boolean aprobada(){
      return alumnoAInscribir.cumpleCorrelatividades(materiasSolicitadas);
   }

   public Alumno getAlumno() {
      return alumnoAInscribir;
   }

   public void setAlumno(Alumno alumno) {
      this.alumnoAInscribir = alumno;
   }

   public List<Materia> getMateriasSolicitadas() {
      return materiasSolicitadas;
   }

   public void setMateriasSolicitadas(List<Materia> materiasSolicitadas) {
      this.materiasSolicitadas = materiasSolicitadas;
   }
}
