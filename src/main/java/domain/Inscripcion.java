package domain;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
   private Alumno alumnoAInscribir;
   private List<Materia> materiasSolicitadas;

   public boolean aprobada(){
      return alumnoAInscribir.cumpleCorrelatividades(materiasSolicitadas);
   }

   public Inscripcion(Alumno alumnoAInscribir, List<Materia> materiasSolicitadas) {
      this.alumnoAInscribir = alumnoAInscribir;
      this.materiasSolicitadas = materiasSolicitadas;
   }

   public Inscripcion() {
      this.alumnoAInscribir = new Alumno();
      this.materiasSolicitadas = new ArrayList<>();
   }

   public void agregarMateriasSolicitadas(Materia ... materias){
      Collections.addAll(this.materiasSolicitadas, materias);
   }

   public Alumno getAlumnoAInscribir() {
      return alumnoAInscribir;
   }

   public void setAlumnoAInscribir(Alumno alumnoAInscribir) {
      this.alumnoAInscribir = alumnoAInscribir;
   }
}
