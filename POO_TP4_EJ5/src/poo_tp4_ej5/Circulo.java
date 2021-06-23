
package poo_tp4_ej5;

import static java.lang.Math.pow;

public class Circulo extends Figura{
    private double radio;
    
    

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double area(){
        double m;
        m= Math.PI*pow(this.radio,2);
        
        return m;
    }
    
    @Override
     public double perimetro(){
        double n;
        
        n= 2*Math.PI*this.radio;
        
        return n;
    }
     
    @Override
    public void mostrar(){
        System.out.println("El objeto es un Circulo");
    }
}
