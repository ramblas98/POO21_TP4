
package poo_tp4_ej6;

public class AutoGNC extends Auto{

    public AutoGNC() {
    }

    public AutoGNC(double combustible, double km) {
        super(combustible, km);
    }
    
    

    @Override
    double precioUnidadCombustible() {
        return Auto.getPrecioGNC();
    }

    @Override
    public double consumo(double kilometraje) {
        return (super.consumo(kilometraje)/3);
    }

    @Override
    public void recorre(double kilometraje) {
        if(kilometraje>100){
            System.out.println("Se recomienda no realizar el recorrido");
        }
        else{
           super.recorre(kilometraje);
           if(this.getCombustible()<this.consumo(20)){
               System.out.println("Necesita urgente una carga de combustible");
           }
        }
    }
    
    
}
