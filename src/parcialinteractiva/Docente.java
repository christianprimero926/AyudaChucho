/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialinteractiva;

/**
 *
 * @author camiu
 */
public class Docente extends Empleado {
    
    //Variables
    private String gradoAcademico;
    private int cantidadPublicaciones;
    private String asignatura;
    
    public Docente (String nombre, int cedula, String gradoAcademico, int cantidadPublicaciones, String asignatura){
        super(nombre, cedula, TipoEmpleado.DOCENTE.getValue());
        this.gradoAcademico = gradoAcademico;
        this.cantidadPublicaciones = cantidadPublicaciones;
        this.asignatura = asignatura;
        
        
        
    }

    /**
     * @return the gradoAcademico
     */
    public String getGradoAcademico() {
        return gradoAcademico;
    }

    /**
     * @param gradoAcademico the gradoAcademico to set
     */
    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    /**
     * @return the cantidadPublicaciones
     */
    public int getCantidadPublicaciones() {
        return cantidadPublicaciones;
    }

    /**
     * @param cantidadPublicaciones the cantidadPublicaciones to set
     */
    public void setCantidadPublicaciones(int cantidadPublicaciones) {
        this.cantidadPublicaciones = cantidadPublicaciones;
    }

    /**
     * @return the asignatura
     */
    public String getAsignatura() {
        return asignatura;
    }

    /**
     * @param asignatura the asignatura to set
     */
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    
    @Override
    public String toString () {
        return "Profesor docente: " + gradoAcademico + " " + cantidadPublicaciones + " " + asignatura;
     }
    
    
}
