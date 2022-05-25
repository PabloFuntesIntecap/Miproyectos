
package actividadcalculadora;

import controlador.Controlador;
import modeloLogico.ModeloLogico;
import vista.frmPrincipal;

/**
 *
 * @author Pablo_Fuentes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    
    frmPrincipal principal = new frmPrincipal();
    ModeloLogico modelo = new ModeloLogico();
    
    Controlador c = new Controlador(principal, modelo);
    
    //MOSTRANDO LA PANTALLA PRINCIPAL
    
    principal.setVisible(true);
    principal.setLocationRelativeTo(null);
    principal.setResizable(false);
    
    }
    
}
