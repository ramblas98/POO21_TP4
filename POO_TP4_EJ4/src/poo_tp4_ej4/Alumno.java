
package poo_tp4_ej4;

import java.time.LocalDate;

public class Alumno extends Persona{

    public Alumno(String nombre, int edad, LocalDate fNac) {
        super(nombre, edad, fNac);
    }

    @Override
    public void hablar() {
        System.out.println();
        super.hablar(); 
        System.out.println(". Soy Alumno");
    }
    
    
}
