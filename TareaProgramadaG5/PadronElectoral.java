
public class PadronElectoral
{
 private Votante[] votantes;
 private int cantidadVotantes;
 
 public PadronElectoral(int cantidadVotantes){
     votantes = new Votante [cantidadVotantes];
     this.cantidadVotantes = cantidadVotantes;
 }
 
 public int getCantidadVotantes(){
     return cantidadVotantes;
 }
 
 //Esta clase aun no la podemos trabajar mucho con la materia vista
}
