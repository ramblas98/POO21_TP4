
package poo_tp4_ej2;


public class Futbolista extends IntegranteEquipo{
    private String puesto;
    private double peso;

    public Futbolista() {
    }

    public Futbolista(String puesto, double peso) {
        this.puesto = puesto;
        this.peso = peso;
    }

    public Futbolista(String puesto, double peso, int id, String nombres, String apellidos, int edad) {
        super(id, nombres, apellidos, edad);
        this.puesto = puesto;
        this.peso = peso;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public void concentrarse(){
        System.out.println("El jugador "+this.getApellidos()+" se Concentro");
    }
    
    @Override 
    public void viajar(){
        System.out.println("El jugador "+this.getApellidos()+" viajo con el Plantel");
    }

}
