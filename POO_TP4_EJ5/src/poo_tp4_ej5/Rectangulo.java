
package poo_tp4_ej5;

public  class Rectangulo extends Cuadrilatero{
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
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
    public double area(){
        double r;
        r=this.altura*this.base;
        
        return r;
    }
    
    @Override
    public double perimetro(){
         double l;
        
        l=(this.altura*2)+(this.base*2);
        
        return l;
    }
    
    @Override
    public void mostrar(){
        System.out.println("El objeto es un Rectangulo");
    }
}
