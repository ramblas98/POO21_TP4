
package poo_tp4_ej2;


public class Masajista extends IntegranteEquipo{
    private String titulacion;
    private String aniosExperiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, String aniosExperiencia) {
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Masajista(String titulacion, String aniosExperiencia, int id, String nombres, String apellidos, int edad) {
        super(id, nombres, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public String getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(String aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    
     @Override
    public void concentrarse(){
        System.out.println(this.getApellidos()+" de profesion "+ this.getTitulacion()+ " concentro ");
        
    }
    
    @Override
    public void viajar(){
        System.out.println(this.getApellidos()+ " viajo con el equipo");
    }
}
