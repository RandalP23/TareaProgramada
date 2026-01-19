
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
    public void setNombrePartido (String nombrePartido){
        this.nombrePartido = nombrePartido;
    }
    
    public void setCedulaJuridica(int cedulaJuridica){
        this.cedulaJuridica = cedulaJuridica;
    }
    
    public void setColoresBandera(String coloresBandera){
        this.coloresBandera = coloresBandera;
    }
    
    public void setPresidenteEjecutivo(String presidenteEjecutivo){
        this.presidenteEjecutivo = presidenteEjecutivo;
    }
    
    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }
    //Fin metodos setters
}
