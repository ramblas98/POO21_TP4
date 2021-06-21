
package poo_tp4_ej1;

public class Cuadrilatero extends Figura{
    private double base;
    private double altura;

    public Cuadrilatero(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return 0;
    }

    @Override
    public double area() {
        return this.base*this.altura;
    }
    
    
}
