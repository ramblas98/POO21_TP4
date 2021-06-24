
package poo_tp4_ej6;

public abstract class Auto {
    private static double precioNafta;
    private static double precioDiesel;
    private static double precioGNC;

    public static double getPrecioNafta() {
        return precioNafta;
    }

    public static void setPrecioNafta(double aPrecioNafta) {
        precioNafta = aPrecioNafta;
    }

    public static double getPrecioDiesel() {
        return precioDiesel;
    }

    public static void setPrecioDiesel(double aPrecioDiesel) {
        precioDiesel = aPrecioDiesel;
    }

    public static double getPrecioGNC() {
        return precioGNC;
    }

    public static void setPrecioGNC(double aPrecioGNC) {
        precioGNC = aPrecioGNC;
    }
    private double combustible;
    private double km;

    public Auto() {
        Auto.precioDiesel = 52.56;
        Auto.precioGNC = 24;
        Auto.precioNafta = 57.01;
        this.combustible = 0;
        this.km = 0;
    }

    public Auto(double combustible, double km) {
        this.combustible = combustible;
        this.km = km;
        Auto.precioDiesel = 52.56;
        Auto.precioGNC = 24;
        Auto.precioNafta = 57.01;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
    
    
    public void cargar(double importe){
        this.combustible+= importe/this.precioUnidadCombustible();
        System.out.println("Carga de Combustible:"+this.combustible);
    }
    
    public void recorre(double kilometraje){
        if(this.combustible >= this.consumo(kilometraje)){
            this.km+=kilometraje;
            this.combustible -= this.consumo(kilometraje);
            System.out.println("Kilometros recorridos: "+this.km);
        }
        else{
            System.out.println("El auto no tiene suficiente combustible para realizar el recorrido que desea. Cargue mas combustible.");
        }
    }
    
    public double consumo(double kilometraje){
        return kilometraje/16;
    }
    
    abstract double precioUnidadCombustible();
}
