
import controlador.ControladorActualizar;
import controlador.ControladorEliminar;
import controlador.ControladorInsertar;
import controlador.ControladorMenu;
import controlador.ControladorMostrar;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.frmActualizar;
import vista.frmEliminar;
import vista.frmInsertar;
import vista.frmMenu;
import vista.frmMostrar;


/**
 *
 * @author Pablo_Fuentes
 */
public class ConectorCompleto2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        frmMenu fm = new frmMenu();
        frmInsertar fi = new frmInsertar();
        frmMostrar fms = new frmMostrar();
        frmActualizar fac = new frmActualizar();
        frmEliminar feli = new frmEliminar();
        
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();

        ControladorMenu cm = new ControladorMenu(fm, fi, fms, fac,feli);
        ControladorInsertar ci = new ControladorInsertar(fi, pvo, pdao);
        ControladorMostrar cmo = new ControladorMostrar(fms, pvo, pdao);
        ControladorActualizar cac = new ControladorActualizar (fac, pvo, pdao);
        ControladorEliminar celi = new ControladorEliminar(feli, pvo, pdao);
        
        fm.setVisible(true);
        fm.setLocationRelativeTo(null);
        
        
        
    }
    
}
