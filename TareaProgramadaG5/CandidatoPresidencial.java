
public class CandidatoPresidencial
{
    private int cedula;
    private String nombre;
    private int IdPartido;
    private int edad;
    private int cantidadVotos;
    private String nacionalidad; 
    private String correo;
    //Nos sirve para luego en el sistema
    //De las eleccionas validar la nacionalidad
    
    //Atributos
    
    public CandidatoPresidencial(int numeroCedula, String nombre, 
    int partido, int edad, String nacionalidad, String correo){
        this.correo = correo;
        this.nacionalidad = nacionalidad;
        this.cantidadVotos = 0;
        this.cedula = numeroCedula;
        this.nombre = nombre;
        this.edad = edad;
        this.IdPartido = partido;
    } //Constructor
    
    //getters 
    public String getCorreo(){
        return correo;
    }
    
    public int getNumeroCedula (){
        return cedula;
    }
    
    public String getNombre (){
        return nombre;
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
    
    public int getPartido(){
        return IdPartido;
    }
    
    //Fin getters
    
    //Setters 
    
    public void setPartido(int nuevoPartido){
      IdPartido = nuevoPartido;
    }
    
    public void setEdad (int nuevaEdad){
        edad = nuevaEdad;
    }
    
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    
    public void setNacionalidad(String nuevaNacionalidad){
        nacionalidad = nuevaNacionalidad;
    }
    
    public void setCorreo(String nuevoCorreo){
        correo = nuevoCorreo;
    }
    
    public void agregarVoto(){
        this.cantidadVotos = cantidadVotos + 1;
    }
    //No se hace set votos por que no pueden ser modificador, luego se crearan metodos para agregar votos
    //Fin setters 
    
    public String toString(){
        return "Nombre: " + nombre + ", Cedula: " + cedula +
        ", Partido Politico con id: " + IdPartido + ", Edad: " + edad +
        ", Correo Electronico: " + correo + ", Nacionalidad: " + nacionalidad + 
        ", Cantidad votos: " + cantidadVotos;
    }
}
