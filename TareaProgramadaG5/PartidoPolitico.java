
public class PartidoPolitico
{
    private String nombrePartido;
    private int cedulaJuridica;
    private String coloresBandera;
    private String presidenteEjecutivo;
    private String correoElectronico;
    //Atributos necesarios de la clase
    
    public PartidoPolitico(String nombreDelPartido, int cedulaJuridica, String
    presidenteEjecutivo, String correoElectronico, String coloresBandera){
        this.nombrePartido = nombreDelPartido;
        this.cedulaJuridica = cedulaJuridica;
        this.coloresBandera = coloresBandera;
        this.presidenteEjecutivo = presidenteEjecutivo;
        this.correoElectronico = correoElectronico;  
    } //Fin del constructor
    
    //Metodos getters
    public String getNombrePartido (){
        return nombrePartido;
    }
    
    public int getCedulaJuridica(){
        return cedulaJuridica;
    }
    
    public String getColoresBandera(){
        return coloresBandera;
    }
    
    public String getPresidenteEjecutivo(){
        return presidenteEjecutivo;
    }
    
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    //Fin de los metodos getters
    
    //Metodos setters
    public void setNombrePartido (String nuevoNombre){
        nombrePartido = nuevoNombre;
    }
    
    public void setCedulaJuridica(int ){
        return cedulaJuridica;
    }
    
    public void setColoresBandera(){
        return coloresBandera;
    }
    
    public void setPresidenteEjecutivo(){
        return presidenteEjecutivo;
    }
    
    public void setCorreoElectronico(){
        return correoElectronico;
    }
}
