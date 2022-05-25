
package actividad02;


import controlador.Controlador;
import modelo.ModeloLogico;
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
ModeloLogico ml = new ModeloLogico();
Controlador  c = new Controlador(principal, ml);

/// CONFIGURACION DE LA VENTANA

principal.setVisible(true);
principal.setLocationRelativeTo(null);
principal.setResizable(false);


    }
    
}
