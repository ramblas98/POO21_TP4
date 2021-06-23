
package poo_tp4_ej5;

public abstract class Figura {

    public Figura() {
    }
    
    
    
    abstract double area();
    
    public boolean mismaArea(Figura otra){
        double area1=this.area();
        double area2=otra.area();
        
        if(area1==area2){
            return true;
        }
        else{
            return false;
        }
    }
    
    abstract double perimetro();
    abstract void mostrar();
}
