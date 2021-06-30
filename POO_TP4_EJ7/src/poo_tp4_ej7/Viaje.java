
package poo_tp4_ej7;

import java.time.LocalTime;
import java.util.Scanner;

public class Viaje {
    private String origen;
    private String destino;
    private int distanciaKm;
    private LocalTime tiempoEsperaEnMin;
    private long identificacion;
    private static LocalTime horaSolicitada[];
    Scanner teclado = new Scanner(System.in);


    public Viaje() {
        this.distanciaKm = 0;
        this.identificacion = 0;
        this.tiempoEsperaEnMin = LocalTime.MIDNIGHT;
        Viaje.horaSolicitada = new LocalTime[23];
    }

    public Viaje(String origen, String destino, int distanciaKm, LocalTime tiempoEsperaEnMin, long identificacion) {
        this.origen = origen;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
        this.tiempoEsperaEnMin = tiempoEsperaEnMin;
        this.identificacion = identificacion;
        Viaje.horaSolicitada = new LocalTime[23];
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(int distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public LocalTime getTiempoEsperaEnMin() {
        return tiempoEsperaEnMin;
    }

    public void setTiempoEsperaEnMin(LocalTime tiempoEsperaEnMin) {
        this.tiempoEsperaEnMin = tiempoEsperaEnMin;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }
    
    public void solicitarHora(LocalTime hora){
        if(Viaje.horaSolicitada[hora.getHour()] == null){
            Viaje.horaSolicitada[hora.getHour()] = hora;
        }
        else{
            System.out.println("No se puede realizar el viaje, el horario esta ocupado");
        }       
    }
    
    public void realizadoCancelado(LocalTime hora, boolean b){
        if(b == true){
            System.out.println("Viaje Realizado");
        }
        else{
            System.out.println("Viaje cancelado");
        }
        
        Viaje.horaSolicitada[hora.getHour()] = null;
    }
}
