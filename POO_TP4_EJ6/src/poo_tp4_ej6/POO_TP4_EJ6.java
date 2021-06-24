
package poo_tp4_ej6;

public class POO_TP4_EJ6 {

    public static void main(String[] args) {
         Auto[] autito = new Auto[3];
         
         autito[0] = new AutoNaftero(45,7);
         autito[1] = new AutoDiesel(7,25);
         autito[2] = new AutoGNC(5,36);
         
         
         autito[0].cargar(300);
         autito[1].cargar(300);
         autito[2].cargar(300);
         
         autito[0].recorre(100);
         autito[1].recorre(100);
         autito[2].recorre(100);
         
    }
    
}
