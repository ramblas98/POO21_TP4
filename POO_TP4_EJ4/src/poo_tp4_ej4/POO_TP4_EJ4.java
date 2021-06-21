
package poo_tp4_ej4;

import java.time.LocalDate;
import java.time.Month;


public class POO_TP4_EJ4 {

    public static void main(String[] args) {
        Loro lorito = new Loro();
        
        lorito.hablar();
        
        Persona persona =  new Persona("Horacio", 31, LocalDate.of(1990, Month.JUNE, 6));
        
        persona.hablar();
        
        Profesor profe = new Profesor("Karla",29, LocalDate.of(1992,8,16));
        
        profe.hablar();
    }
    
}
