
package poo_tp4_ej7;

public class AutoNaftero extends Auto{

    public AutoNaftero() {
    }

    public AutoNaftero(double combustible, double km) {
        super(combustible, km);
    }
    
    

    @Override
    double precioUnidadCombustible() {
        return Auto.getPrecioNafta();
    }
    
    @Override
    public void cargar(double importe){
        super.cargar(importe +((importe*10)/100));
    }
}
