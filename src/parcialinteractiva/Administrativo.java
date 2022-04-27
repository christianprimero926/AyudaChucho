/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialinteractiva;

/**
 *
 * @author camiu
 */
public class Administrativo extends Empleado {
    
    private String facultad;
    private String tecnologia;
    
    public Administrativo(String nombre, int cedula, String facultad, String tecnologia){
        
        super(nombre, cedula, TipoEmpleado.PERSONALADMIN.getValue());
        this.facultad = facultad;
        this.tecnologia = tecnologia;
        
    }

    /**
     * @return the facultad
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * @param facultad the facultad to set
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    /**
     * @return the tecnologia
     */
    public String getTecnologia() {
        return tecnologia;
    }

    /**
     * @param tecnologia the tecnologia to set
     */
    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
    
    @Override
     public String toString () {
        return "Profesor administrativo: " + facultad +  tecnologia;
     }
    
    
}
