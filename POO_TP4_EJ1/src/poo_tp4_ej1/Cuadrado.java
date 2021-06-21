
package poo_tp4_ej1;


public class Cuadrado extends Cuadrilatero{
    private double lado;

    public Cuadrado(double lado, double base, double altura) {
        super(base, altura);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
  

    @Override
    public double area() {
        return super.area(); 
    }

    @Override
    public double perimetro() {
        return this.lado*4;
    }
    
    
}
