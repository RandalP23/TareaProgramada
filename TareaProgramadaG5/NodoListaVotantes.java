
public class NodoListaVotantes
{
    Votante dato;
    NodoListaVotantes siguiente;
    
    public NodoListaVotantes (Votante dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    
    public Votante getDato(){
        return dato;
    }
}