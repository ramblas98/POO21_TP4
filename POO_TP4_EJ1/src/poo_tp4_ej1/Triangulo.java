
package poo_tp4_ej1;

public class Triangulo extends Figura{
    private double base;
    private double altura;
    private double l1,l2,l3;

    public Triangulo(double base, double altura, double l1, double l2, double l3) {
        this.base = base;
        this.altura = altura;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
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

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }
    
    @Override
    public double area(){
        return (this.altura*this.base)/2;
    }
    
    @Override 
    public double perimetro(){
        return this.l1+this.l2+this.l3;
    }
    
    public void clasificacion(){
        if(this.l1==this.l2 && this.l2==this.l3){
            System.out.println("Triangulo Equilatero");
        }
        else if(this.l1==this.l2 || this.l2==this.l3 || this.l1==this.l3){
            System.out.println("Triangulo Isosceles");
        }
        else{
            System.out.println("Triangulo Escaleno");
        }
    }
    
    public boolean esRectangulo(){
        // Obtener la hipotenusa, los catetos, y sus cuadrados
            double hh = this.l1, c1 = this.l2, c2 = this.l3;
            if ( this.l1 > this.l2 && this.l1 > this.l3 ) { hh = this.l1; c1 = this.l2; c2 = this.l3; }
            if ( this.l2 > this.l1 && this.l2 > this.l3 ) { hh = this.l2; c1 = this.l1; c2 = this.l3; }
            if ( this.l3 > this.l1 && this.l3 > this.l1 ) { hh = this.l3; c1 = this.l1; c2 = this.l2; }
            double HH = hh * hh, C1 = c1 * c1, C2 = c2 * c2;
            
            if(HH == C1+C2){
                return true;
            }
            else{
                return false;
            }
    }
}
