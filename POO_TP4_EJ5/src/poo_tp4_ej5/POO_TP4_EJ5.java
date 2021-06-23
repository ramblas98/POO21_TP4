
package poo_tp4_ej5;


public class POO_TP4_EJ5 {

  
    public static void main(String[] args) {
        Figura[] figura = new Figura[3];
        
        figura[0] = new Rectangulo(4,5);
        figura[1] = new Circulo(7);
        figura[2] = new Cuadrado(6);
        
        for(int i=0;i<figura.length;i++){
            System.out.println(" Area de Figura nro "+i+" = " +figura[i].area() );
            System.out.println("Perimetro de la Figura nro "+i+" = "+figura[i].perimetro());
        }
        
    }
    
}
