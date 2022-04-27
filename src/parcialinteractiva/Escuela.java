/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialinteractiva;

import java.util.ArrayList;

/**
 *
 * @author camiu
 */
public class Escuela {

    
    private Docente d1;    

//    public void crearlista() {
//        lista1.add(d1);
//    }

    public void agregarAsignatura(ArrayList<Empleado> lista1, String nuevaAsignatura) {
        d1 = new Docente("julio", 190000, GradoAcademico.DOCTORADO.getValue(), 10, nuevaAsignatura);
        lista1.add(d1);
        System.out.println(lista1);
    }

}
