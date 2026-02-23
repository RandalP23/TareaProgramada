
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ListaDoblePadron
{
    NodoListaDoble cabeza;
    NodoListaDoble cola;
    
    
    public void agregarCanton(Canton dato){
        NodoListaDoble nuevo = new NodoListaDoble(dato);
        String nombre = dato.getNombre().toLowerCase();
        
        if(cabeza == null){
            cola = nuevo; 
            cabeza = nuevo;
        }else{
            if(nombre.compareTo(
            cabeza.dato.getNombre().toLowerCase()) < 0){
                nuevo.siguiente = cabeza;
                cabeza.anterior = nuevo;
                cabeza = nuevo;
            }else{
                NodoListaDoble actual = cabeza;
                
                while(actual.siguiente != null && nombre.compareTo(
                actual.siguiente.dato.getNombre().toLowerCase()) > 0){
                    actual =  actual.siguiente;
                }
                
                if(actual.siguiente == null){
                    actual.siguiente = nuevo;
                    nuevo.anterior = actual;
                    cola = nuevo;
                }else{
                    nuevo.siguiente = actual.siguiente;
                    nuevo.anterior = actual;
                    actual.siguiente.anterior = nuevo;
                    actual.siguiente = nuevo;
                }
            }
        }
    }
    
    public Canton buscarCanton (String nombre){
        
        NodoListaDoble actual = cabeza;
        Canton encontrado = null;
        String cantonBuscado = nombre.toLowerCase();
        boolean esta = false;
        
        while(actual != null && esta == false){
            if(actual.dato.getNombre().toLowerCase().equals(cantonBuscado)){
                encontrado = actual.dato;
                esta = true;
            }
            actual = actual.siguiente;
        }
        return encontrado;
    }
    
    public void cargarVotantes(){
        String ruta = JOptionPane.showInputDialog("Digite la ruta del archivo de los votantes");
        
        try(FileReader fr = new FileReader(ruta);
        BufferedReader br = new BufferedReader(fr)){
            String linea = br.readLine();
            while(linea!= null){
                String [] partes = linea.split(";");
                
                String nombre = partes[0];
                int cedula = Integer.parseInt(partes[1]);
                int edad = Integer.parseInt(partes[2]);
                String domicilioElectoral = partes[3];
                String correo = partes[4];
                
                Votante nuevo = new Votante(nombre, cedula,
                edad, domicilioElectoral, correo);
                
                Canton canton = buscarCanton(domicilioElectoral);
                
                if(canton == null){
                    canton = new Canton(domicilioElectoral);
                    agregarCanton(canton);
                }
                
                canton.agregarVotante(nuevo);
                
                
                linea = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }
    
    public void agregarVotante(){
        String nombre = JOptionPane.showInputDialog("Digite el nombre del votante");
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la cédula del votante"));
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del votante"));
        String domicilio = JOptionPane.showInputDialog("Digite el domicilio electoral (canton) del votante ");
        String correo = JOptionPane.showInputDialog("Digite el correo electrónico del votante");
        
        Votante nuevo = new Votante(nombre, cedula,
                edad, domicilio, correo);
        
        Canton canton = buscarCanton(domicilio);
                
        if(canton == null){
                    canton = new Canton(domicilio);
                    agregarCanton(canton);
                }
                
        canton.agregarVotante(nuevo);
    }
    
    public Votante buscarVotante(int cedula){
        NodoListaDoble actual = cabeza;
        Votante buscado = null;
        boolean encontrado = false;
        
        while(actual != null && encontrado == false){
            buscado = actual.dato.buscarVotante(cedula);
            if(buscado != null){
                encontrado = true;
            }else{
                actual = actual.siguiente;
            }
        }
        
        return buscado;
    }

}