
public class CandidatoPresidencial
{
    private int numeroCedula;
    private String nombreCandidato;
    private PartidoPolitico partido;
    private int edad;
    private int cantidadVotos;
    private String nacionalidad; //Nos sirve para luego en el sistema
    //De las eleccionas validar la nacionalidad
    
    //Atributos
    
    public CandidatoPresidencial(int numeroCedula, String nombre, 
    PartidoPolitico partido, int edad, String nacionalidad){
        this.nacionalidad = nacionalidad;
        this.cantidadVotos = 0;
        this.numeroCedula = numeroCedula;
        this.nombreCandidato = nombre;
        this.edad = edad;
        this.partido = partido;
    } //Constructor
    
    //getters 
    
    public int getNumeroCedula (){
        return numeroCedula;
    }
    
    public String getNombreCandidato (){
        return nombreCandidato;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public int getCantidadVotos(){
        return cantidadVotos;
    }
    
    public String getNacionalidad(){
        return nacionalidad;
    }
    
    public PartidoPolitico getPartido(){
        return partido;
    }
    
    //Fin getters
    
    //Setters 
    
    public void setPartido(PartidoPolitico nuevoPartido){
      partido = nuevoPartido;
    }
    
    public void setVotos(int votos){
        cantidadVotos = votos;
    }
    
    public void setEdad (int nuevaEdad){
        edad = nuevaEdad;
    }
    
    public void setNombre(String nuevoNombre){
        nombreCandidato = nuevoNombre;
    }
    //Fin setters 
}
