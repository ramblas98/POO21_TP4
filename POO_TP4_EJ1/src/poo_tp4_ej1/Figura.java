
package poo_tp4_ej1;

public class Figura {

    public Figura() {
    }
    
    
    
    public double area(){
        return 0;
    }
    
    public double perimetro(){
        return 0;
    }
    
    public boolean mismaArea(Figura f){
        double area1 = area();
        double area2 = f.area();
        
        if(area1 == area2){
            return true;
        }
        else{
            return false;
        }
    }
    
   
    
}
