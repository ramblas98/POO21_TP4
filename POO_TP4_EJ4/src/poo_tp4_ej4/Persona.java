
package poo_tp4_ej4;

import java.time.LocalDate;


public class Persona extends SerVivoHablante{
    private String nombre;
    private int edad;
    private LocalDate fNac;

    public Persona(String nombre, int edad, LocalDate fNac) {
        this.nombre = nombre;
        this.edad = edad;
        this.fNac = fNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getfNac() {
        return fNac;
    }

    public void setfNac(LocalDate fNac) {
        this.fNac = fNac;
    }
    
    @Override
    public void hablar(){
        super.hablar();
        System.out.print(", Me llamo "+this.nombre+" y se hablar. Soy Racional. Naci el "+fNac.getDayOfMonth()+"de "+fNac.getMonth()+" de "+fNac.getYear());
        
    }
    
}
