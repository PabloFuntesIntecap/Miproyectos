
package mes04dia01;

import Controlador.controlador;
import Modelo.ModeloLogico;
import Vista.frmPrincipal;

/**
 *
 * @author Pablo_Fuentes
 */
public class Mes04Dia01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
frmPrincipal principal = new frmPrincipal();
ModeloLogico ml = new ModeloLogico();
controlador c = new controlador(principal,ml);


principal.setVisible(true);
principal.setLocationRelativeTo(null);
principal.setResizable(false);


    }
    
}
