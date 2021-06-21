
package poo_tp4_ej1;

import static java.lang.Math.pow;

public class Circulo extends Figura{
    private double radio;

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
        return Math.PI*pow(this.radio,2);
    }
    
    @Override
    public double perimetro(){
        return 2*Math.PI*this.radio;
    }
    
    
}
 

