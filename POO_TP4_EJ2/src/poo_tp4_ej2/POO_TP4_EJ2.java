
package poo_tp4_ej2;


public class POO_TP4_EJ2 {

    public static void main(String[] args) {
       IntegranteEquipo[] equipo1 = new IntegranteEquipo[13];
        IntegranteEquipo[] equipo2 = new IntegranteEquipo[13];
        
       
        equipo1[0]= new Entrenador(2234,343981,"Ignacio","Arpe",44);
        equipo1[1]= new Futbolista("Arquero",76.3,3543019,"Fabricio","Almada",32);
        equipo1[2]= new Futbolista("Defensor",75.2,239751,"Luciano","Motesi",21);
        equipo1[3]= new Futbolista("Defensor",74.31,12828,"Ramiro","Rodriguez",23);
        equipo1[4]= new Futbolista("Defensor",77.32,32521,"Maxi","Celio",29);
        equipo1[5]= new Futbolista("Defensor",78.82,203267,"Jesus","Pastrana",31);
        equipo1[6]= new Futbolista("Mediocampista",76.12,3453465,"Enrique","Portales",32);
        equipo1[7]= new Futbolista("Mediocampista",75.32,372981,"Iñaki","Feccuci",29);
        equipo1[8]= new Futbolista("Mediocampista",72.98,435190,"Narciso","Cruz",22);
        equipo1[9]= new Futbolista("Mediocampista",77.91,235283,"Juan Fernando","Basualdo",25);
        equipo1[10]= new Futbolista("Delantero",81.32,343461,"Lucas","Patrico",31);
        equipo1[11]=new Futbolista("Delantero",79.21,433172,"Rafael","Sandoval",23);
        equipo1[12]= new Masajista("Kinesiologo","TRECE",23554351,"Ana","Arroyo",42);
        
        
        equipo2[0]= new Entrenador(566546,129433,"Miguel","Gamarra",56);
        equipo2[1]= new Futbolista("Arquero",78.1,32498321,"Esteban","Lopez",29);
        equipo2[2]= new Futbolista("Defensor",79.4,918282,"Pedro","Lopez",29);
        equipo2[3]= new Futbolista("Defensor",79.2,272512,"Carlos","Heriberto",26);
        equipo2[4]= new Futbolista("Defensor",81.2,555321,"Gael","Ficus",24);
        equipo2[5]= new Futbolista("Defensor",80.45,1246474,"Julio","Walter",31);
        equipo2[6]= new Futbolista("Mediocampista",76.9,8282475,"Agustin","Erazu",20);
        equipo2[7]= new Futbolista("Mediocampista",77.21,7632891,"Ivan","Rodriguez",27);
        equipo2[8]= new Futbolista("Mediocampista",81.2,6342234,"Mario","Tello",24);
        equipo2[9]= new Futbolista("Mediocampista",71.4,5417111,"Nicolas","Fernandez",28);
        equipo2[10]= new Futbolista("Delantero",79.7,98347923,"Carlos","Camacho",37);
        equipo2[11]=new Futbolista("Delantero",85.2,81261311,"Juan","Polo",29);
        equipo2[12]= new Masajista("Kinesiologo","ONCE",85854982,"Ruth","Bonifacio",49);
        
       for(int i=0;i<13;i++){
           equipo1[i].concentrarse();
           equipo1[i].viajar();
           equipo2[i].concentrarse();
           equipo2[i].viajar();
       }
    }
    
}
