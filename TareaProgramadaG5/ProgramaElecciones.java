
import javax.swing.JOptionPane;
public class ProgramaElecciones
{
    private ListaDoblePadron padronElectoral;
    private ArbolCandidatos candidatos;
    private ListaPartido partidos;
    
    public ProgramaElecciones(){
        padronElectoral = new ListaDoblePadron();
        candidatos = new ArbolCandidatos();
        partidos = new ListaPartido();
        
        partidos.cargarInfoPartidos();
        padronElectoral.cargarVotantes();
        
    }
    
    public void abrirMenu(){
        int opcion = 0;
        
        do{
            try{
                
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
            "Menu Principal\n" + "Digite el numero segun la opcion deseada\n"
            + "1. Incluir un partido\n" + "2. Incluir un candidato\n" +
            "3. Incluir un votante\n" + "4. Registrar un Voto\n" + "5. Salir y mostrar resultados")
            );
            
            switch(opcion){
                case 1: 
                    partidos.agregarPartido();
                    break;
                case 2: 
                     candidatos.insertar();
                    break;
                case 3: 
                    padronElectoral.agregarVotante();
                    break;
                case 4: 
                    registrarVoto();
                    break;   
                case 5: 
                    JOptionPane.showMessageDialog(null, "Cerrando menu");
                    mostrarResultados();
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Opcion invalida");

            }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero valido");
            }
            
      } while (opcion != 5);
    }
    
    public void registrarVoto(){
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del votante"));
        
        Votante votante = padronElectoral.buscarVotante(cedula);
        
        if(votante == null){
            JOptionPane.showMessageDialog(null, "Votante no encontrado");
        } else if(votante.getEmitioVoto() == true){
            JOptionPane.showMessageDialog(null, "Este votante ya emitio su voto");
        }else{
            String nombreCandidato = JOptionPane.showInputDialog("Digite el nombre del candidato por el cual quiere votar");
            
            boolean existeCandidato = candidatos.sumarVoto(nombreCandidato);
            
            if(existeCandidato == false){
                JOptionPane.showMessageDialog(null, "Candidato no encontrado");
            }else{
                votante.setEmitioVoto(true);
                
                JOptionPane.showMessageDialog(null, "Voto registrado con exito");
            }
        }
    }
    
    public void mostrarResultados(){
        int totalDeVotos = candidatos.contarTotalVotos();
        
        if(totalDeVotos == 0){
            System.out.println("No hay votos registrados");
        }else{
            System.out.println("Lso resultados finales son");
            
            mostrarResultadosRec(candidatos.getRaiz(), totalDeVotos);
            
            CandidatoPresidencial ganador = candidatos.obtenerGanador();
            
            System.out.println("EL GANADOR FUE");
            System.out.println(ganador.toString());
            System.out.println("Con un total de: " + ganador.getCantidadVotos() + ", votos ");
        }
    }
    
    private void mostrarResultadosRec(NodoArbol nodo, int totalVotos){
        if(nodo == null){
            return;
        }
        
        CandidatoPresidencial actual = nodo.dato;
        int votos = actual.getCantidadVotos();
        double porcentaje = (votos*100) / totalVotos;
        
        PartidoPolitico partido = partidos.buscarPartido(actual.getPartido());
        
        System.out.println("Resultado");
        System.out.println("Partido: " + partido.getNombrePartido());
        System.out.println("Candidato: " + actual.getNombre());
        System.out.println("Votos obtenidos: " + votos);
        System.out.println("Porcentaje de votos: " + String.format("%.2f", porcentaje) + "%");
        System.out.println("......");
    }
}