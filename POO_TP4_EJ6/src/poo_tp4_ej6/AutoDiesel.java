
package poo_tp4_ej6;

public class AutoDiesel extends Auto{

    public AutoDiesel() {
    }

    public AutoDiesel(double combustible, double km) {
        super(combustible, km);
    }
    
    

    @Override
    public double consumo(double kilometraje) {
        return (super.consumo(kilometraje)/2);
    }

    @Override
    double precioUnidadCombustible() {
        return Auto.getPrecioDiesel();
    }
    
    
    
}
