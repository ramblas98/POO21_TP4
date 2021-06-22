
package poo_tp4_ej2;

public class Entrenador extends IntegranteEquipo{
     private int idFederacion;

    public Entrenador() {
    }

    public Entrenador(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(int idFederacion, int id, String nombres, String apellidos, int edad) {
        super(id, nombres, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
     
    
    @Override 
    public void concentrarse(){
        System.out.println("Entrenador "+this.getApellidos()+" nro de Id Federacion "+this.getIdFederacion()+ " Concentro");
        
    }
    
    @Override 
    public void viajar(){
        System.out.println("Entrenador "+this.getApellidos()+" Viajo con el Plantel ");
    }
    
}
