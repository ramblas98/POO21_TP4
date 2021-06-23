
package poo_tp4_ej5;

public class Cuadrado extends Cuadrilatero{
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double area(){
        double d;
        d= this.lado*2;
        
        return d;
    }
    
    @Override
    public double perimetro(){
        double d;
        d= this.lado*4;
        return d;
    }

    @Override
    void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
