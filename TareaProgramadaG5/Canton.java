

public class Canton
{
    NodoListaVotantes cabeza;
    private String nombre;
    
    public Canton(String nombre){
        this.nombre = nombre;
    }
    //Metodo para agregar y va ordenando alfabeticamente
    public void agregarVotante(Votante votante){
        NodoListaVotantes nuevo = new NodoListaVotantes(votante);
        String nombre = votante.getNombre().toLowerCase(); // Para comparar sin importar mayusculas y minusculas
        if(cabeza == null) {
            cabeza = nuevo;
        }else{
            if(nombre.compareTo(cabeza.dato.getNombre().toLowerCase()) < 0){
                nuevo.siguiente = cabeza;
                cabeza = nuevo;
            }else{
                NodoListaVotantes actual = cabeza;
                
                while(actual.siguiente != null &&
                nombre.compareTo(actual.siguiente.dato.getNombre().toLowerCase()) > 0){
                    actual = actual.siguiente;
                }
                
                nuevo.siguiente = actual.siguiente;
                actual.siguiente = nuevo;
            }
        }
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Votante buscarVotante(int cedula){
        NodoListaVotantes actual = cabeza;
        Votante votanteBuscado = null;
        boolean encontrado = false;
        
        while(actual != null && encontrado == false){
            if(actual.dato.getCedula() == cedula){
                votanteBuscado = actual.dato;
                encontrado = true;
            }else{
                actual = actual.siguiente;
            }
            
        }
        
        return votanteBuscado;
    }
}