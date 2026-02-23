

public class NodoArbol
{
   CandidatoPresidencial dato;
   NodoArbol izquierdo, derecho;
   
   public NodoArbol(CandidatoPresidencial dato){
       this.dato = dato;
       izquierdo = null;
       derecho = null;
   }
}