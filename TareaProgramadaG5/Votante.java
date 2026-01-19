

public class Votante
{
    private String nombre;
    private int cedula;
    private int edad;
    private String domicilioElectoral;
    private boolean emitioVoto;
    
    //Atributos
    
    public Votante(String nombre, int cedula, String domicilioElectoral,
    int edad){
        this.emitioVoto = false;
        this.edad = edad;
        this.nombre = nombre;
        this.cedula = cedula;
        this.domicilioElectoral = domicilioElectoral;
    } //Constructor
    
    //Getters 
    
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
    //Fin setters
}
