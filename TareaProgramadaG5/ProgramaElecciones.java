
import javax.swing.JOptionPane;
public class ProgramaElecciones
{
    public void abrirMenu(){
        int opcion = 0;
        
        do{
            try{
                
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
            "Menu Principal\n" + "Digite el numero segun la opcion deseada\n"
            + "1. Incluir un partido\n" + "2. Incluir un candidato\n" +
            "3. Incluir un votante\n" + "4. Registrar un Voto\n" + "5. Salir")
            );
            
            switch(opcion){
                case 1: 
                    JOptionPane.showMessageDialog(null, "En construcción");
                    break;
                case 2: 
                    JOptionPane.showMessageDialog(null, "En construcción");
                    break;
                case 3: 
                    JOptionPane.showMessageDialog(null, "En construcción");
                    break;
                case 4: 
                    JOptionPane.showMessageDialog(null, "En construcción");
                    break;   
                case 5: 
                    JOptionPane.showMessageDialog(null, "Cerrando menu");
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Opcion invalida");

            }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero valido");
            }
            
    } while (opcion != 5);
}
}