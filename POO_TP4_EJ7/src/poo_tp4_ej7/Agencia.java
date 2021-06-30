
package poo_tp4_ej7;

import java.util.Scanner;


public class Agencia {
    private Auto autos[];
    private Tarifa tarifa;
    private Viaje viajes;
    Scanner teclado = new Scanner(System.in);
    

    public Agencia() {
        autos = new Auto[10];
    }

    public Agencia(Auto[] autos, Tarifa tarifa, Viaje viajes) {
        this.autos = new Auto[10];
        this.tarifa = tarifa;
        this.viajes = viajes;
    }

    public Auto[] getAutos() {
        return autos;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public Viaje getViajes() {
        return viajes;
    }

    public void setAutos(Auto[] autos) {
        this.autos = autos;
    }
    
    public void agregarMovil(){
        if(this.capacidadAgencia() == true){
            System.out.println("Seleccione el tipo de Auto: ");
            System.out.println("-----------------------------------------------");
            System.out.println("1) Auto Naftero");
            System.out.println("2) Auto Diesel");
            System.out.println("3) Auto GNC");
            int o = teclado.nextInt();
            int firstSearchFree = this.searchFree();
            switch(o){
                 case 1: this.autos[firstSearchFree] = new AutoNaftero();
                         break;
                 case 2: this.autos[firstSearchFree] = new AutoDiesel();
                         break;
                 case 3: this.autos[firstSearchFree] = new AutoGNC();
                         break;
                 default: System.out.println("Opcion incorrecta.");        
            }
        }
        else{
            System.out.println("No se puede agregar Movil , Agencia Llena.");
        }
    }
    
    private boolean capacidadAgencia(){
        int i = 0;
        boolean bandera = false;
        while(i<this.autos.length && bandera == false){
            if(this.autos[i] == null){
                bandera = true;
            }
            else{
                i++;
            }
        }
        
        return bandera;
    }
    
    private int searchFree(){
        int i = 0, captura = 0;
        boolean bandera = false;
        while(i<this.autos.length && bandera == false){
            if(this.autos[i] == null){
                bandera = true;
                captura = i;
            }
            else{
                i++;
            }
        }
        
        return captura;
    }
    
    public void quitarMovil(){
        int exit;
        System.out.println("Seleccione del 0 al 10 que auto ha de eliminar: ");
        exit = teclado.nextInt();
        
        if(this.autos[exit] != null){
            this.autos[exit] = null;
        }
        else{
            System.out.println("No existe el auto.");
        }
    }
    
    public void movilesDisponibles(){
        
    }
}
