
package poo_tp4_ej2;

public class IntegranteEquipo {
    private int id;
    private String nombres;
    private String apellidos;
    private int edad;

    public IntegranteEquipo() {
    }

    public IntegranteEquipo(int id, String nombres, String apellidos, int edad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
     public void concentrarse(){    
    }
    
    public void viajar(){
    }

}
