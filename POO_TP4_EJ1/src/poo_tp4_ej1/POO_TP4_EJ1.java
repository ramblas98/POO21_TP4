
package poo_tp4_ej1;

import java.util.Scanner;


public class POO_TP4_EJ1 {


    public static void main(String[] args) {
        Figura figuras[] ;
        double aleatorio;
        Scanner teclado = new Scanner(System.in);
        figuras = new Figura[10];
        
        //Creando los Objectos aleatorios
        for(int i=0;i<10;i++){
           aleatorio = Math.random();
           if(aleatorio>0.5){
               System.out.println("Digite la base:");
               double b = teclado.nextDouble();
               System.out.println("Digite la altura:");
               double a = teclado.nextDouble();
               figuras[i] = new Rectangulo(b,a);
           }
           else{
               System.out.println("Digite el radio:");
               double r = teclado.nextDouble();
               figuras[i] = new Circulo(r);
           }
        }
        
        //Mostrando Resultados
        
        for(int i=0;i<figuras.length;i++){
            System.out.println(figuras[i].getClass()+ " y su area es: "+figuras[i].area());
        }
    }
    
}
