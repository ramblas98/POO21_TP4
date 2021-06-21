
package poo_tp4_ej1;


public class Rectangulo extends Cuadrilatero{
    

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }
 
   
    @Override
    public double area(){
        return super.getBase()*super.getAltura();
    }
    
    @Override
    public double perimetro(){
        return (super.getAltura()+super.getBase())*2;
    }
    
  
}
