import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ListaPartido
{
    NodoLista cabeza;
    
    public void agregarPartido() {
        String nombre = JOptionPane.showInputDialog("Digite el nombre del partido");
        int cedulaJuridica = Integer.parseInt(JOptionPane.showInputDialog("Digite la cédula juridica del partido"));
        String colores = JOptionPane.showInputDialog("Digite los colores de la bandera del partido");
        String presiEjecutivo = JOptionPane.showInputDialog("Digite el presidente ejecutivo del partido");
        String correo = JOptionPane.showInputDialog("Digite el correo electrónico del partido");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del partido"));
        PartidoPolitico nuevoPartido = new PartidoPolitico (nombre,cedulaJuridica,colores,presiEjecutivo, correo, id);
        
        insertarPartido(nuevoPartido);
    }
    
    public void insertarPartido(PartidoPolitico partido){
        NodoLista nuevo = new NodoLista(partido);
        
        if(cabeza == null){
            cabeza = nuevo;
        }else{
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        }
        
    }
    
    public void cargarInfoPartidos(){
        String ruta = JOptionPane.showInputDialog("Digite la ruta del archivo de los partidos");
        
        try(FileReader fr = new FileReader(ruta);
        BufferedReader br = new BufferedReader(fr)){
            String linea = br.readLine();
            while(linea!= null){
                String [] partes = linea.split(";");
                
                String nombre = partes[0];
                int cedula = Integer.parseInt(partes[1]);
                String presEjec = partes[2];
                String correo = partes[3];
                String colores = partes[4];
                int id = Integer.parseInt(partes[5]);
                
                PartidoPolitico nuevo = new PartidoPolitico(nombre, cedula, presEjec, correo, colores, id);
                
                insertarPartido(nuevo);
                
                linea = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }
    
    public PartidoPolitico buscarPartido(int id){
        NodoLista actual = cabeza;
        PartidoPolitico encontrado = null;
        boolean existe = false;
        
        while(actual != null && existe == false){
            if(actual.dato.getId() == id){
                encontrado = actual.dato;
                existe = true;
            }else{
                actual = actual.siguiente;
            }
        }
        
        return encontrado;
    }
}