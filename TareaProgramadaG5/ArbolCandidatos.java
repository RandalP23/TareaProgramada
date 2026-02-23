
import javax.swing.JOptionPane;
public class ArbolCandidatos
{
    NodoArbol raiz;
    
    public void insertar(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del candidato");
        String nacionalidad = JOptionPane.showInputDialog("Ingrese la nacionalidad del candidato");
        String correo = JOptionPane.showInputDialog("Ingrese el correo del candidato");
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del candidato"));
        int partido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del partido al que pertenece el candidato"));
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del candidato"));
    
        CandidatoPresidencial nuevoCandidato = new CandidatoPresidencial(cedula, nombre, partido, edad, nacionalidad, correo);
    
        raiz = insertarRec(raiz, nuevoCandidato);
    
    }
    
    private NodoArbol insertarRec(NodoArbol nodo, CandidatoPresidencial nuevoCandidato){
        if(nodo == null){
            return new NodoArbol(nuevoCandidato);
        }
        if(nuevoCandidato.getNombre().toLowerCase().compareTo(nodo.dato.getNombre().toLowerCase())< 0){
            nodo.izquierdo = insertarRec(nodo.izquierdo, nuevoCandidato);
        }else if(nuevoCandidato.getNombre().toLowerCase().compareTo(nodo.dato.getNombre().toLowerCase()) > 0){
            nodo.derecho = insertarRec(nodo.derecho, nuevoCandidato);
        }
        return nodo;
    }
    
    
    public boolean sumarVoto(String nombre){
        return sumarVotoRec(raiz, nombre);
    }
    
    
    private boolean sumarVotoRec(NodoArbol nodo, String nombre){
        if(nodo == null){
            return false;
        }
        
        if(nombre.toLowerCase().compareTo(nodo.dato.getNombre().toLowerCase()) == 0){
            nodo.dato.agregarVoto();
            return true;
            
        }else if(nombre.toLowerCase().compareTo(nodo.dato.getNombre().toLowerCase()) < 0){
            return sumarVotoRec(nodo.izquierdo, nombre);
        }else{
            return sumarVotoRec(nodo.derecho, nombre);
        }
    }
    
    public CandidatoPresidencial obtenerGanador(){
        return obtenerGanadorRec(raiz, null);
    }
    
    private CandidatoPresidencial obtenerGanadorRec(NodoArbol nodo, CandidatoPresidencial ganador){
        if(nodo == null){
            return ganador;
        }
        if(ganador == null || nodo.dato.getCantidadVotos() > ganador.getCantidadVotos()){
            ganador = nodo.dato;
        }
        
        ganador = obtenerGanadorRec(nodo.izquierdo, ganador);
        ganador = obtenerGanadorRec(nodo.derecho, ganador);
        
        return ganador;
    }
    
    public int contarTotalVotos(){
        return contarTotalVotosRec(raiz);
    }
    
    private int contarTotalVotosRec(NodoArbol nodo){
        if(nodo == null){
            return 0;
        }
        
        return nodo.dato.getCantidadVotos() + contarTotalVotosRec(nodo.izquierdo) +
        contarTotalVotosRec(nodo.derecho);
    }
    
    public NodoArbol getRaiz(){
        return raiz;
    }
}