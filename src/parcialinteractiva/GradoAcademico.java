/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialinteractiva;

/**
 *
 * @author camiu
 */
public enum GradoAcademico {
    
    MAGISTER("Magister"),DOCTORADO("Doctorado");
    
    private String value;

    private GradoAcademico(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }  
        
    
}
