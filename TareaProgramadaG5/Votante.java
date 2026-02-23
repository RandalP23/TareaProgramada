

public class Votante
{
    private String nombre;
    private int cedula;
    private int edad;
    private String domicilioElectoral; //Debe de ser un canton
    private boolean emitioVoto;
    private String correo;
    
    //Usamos correo en todos como contacto, ya que el telefono es mas privado 
    
    //Atributos
    
    public Votante(String nombre, int cedula, int edad, String domicilioElectoral,
    String correo){
        this.correo = correo;
        this.emitioVoto = false; //Pues en un inicio nadie ha votado
        this.edad = edad;
        this.nombre = nombre;
        this.cedula = cedula;
        this.domicilioElectoral = domicilioElectoral;
    } //Constructor
    
    //Getters 
    
    public String getCorreo(){
        return correo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCedula(){
        return cedula;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getDomicilio(){
        return domicilioElectoral;
    }
    
    public boolean getEmitioVoto(){
        return emitioVoto;
    }
    //Fin getters
    
    //Setters
    
    public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
    }
    
    public void setNombre (String nuevoNombre){
        nombre = nuevoNombre;
    }
    
    public void setDomicilio (String nuevoDomicilio){
        domicilioElectoral = nuevoDomicilio;
    }
    
    public void setEmitioVoto(boolean emitioVoto){
        this.emitioVoto = emitioVoto;
    }
    
    public void setCorreo(String nuevoCorreo){
        correo = nuevoCorreo;
    }
    //Fin setters
    
    public String toString(){
        return "Nombre: " + nombre + ", Cedula: " + cedula +
        ", Edad: " + edad + ", Correo Electronico: " + correo + 
        ", Domicilio Electoral: " + domicilioElectoral + 
        ", Emitio voto: " + emitioVoto;
    }
}
