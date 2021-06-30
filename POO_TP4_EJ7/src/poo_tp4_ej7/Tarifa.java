
package poo_tp4_ej7;

public class Tarifa {
    private static  double bajadaDiurna;
    private static double bajadaNocturna;

    public Tarifa() {
    }

    public static double getBajadaDiurna() {
        return bajadaDiurna;
    }

    public static void setBajadaDiurna(double bajadaDiurna) {
        Tarifa.bajadaDiurna = bajadaDiurna;
    }

    public static double getBajadaNocturna() {
        return bajadaNocturna;
    }

    public static void setBajadaNocturna(double bajadaNocturna) {
        Tarifa.bajadaNocturna = bajadaNocturna;
    }
    
    
}
