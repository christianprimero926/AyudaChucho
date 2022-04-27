/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialinteractiva;

/**
 *
 * @author chris
 */
public enum TipoEmpleado {

    /**
     *
     */
    DOCENTE("docente"), PERSONALADMIN("Personal Administrativo");

    private String value;

    private TipoEmpleado(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
