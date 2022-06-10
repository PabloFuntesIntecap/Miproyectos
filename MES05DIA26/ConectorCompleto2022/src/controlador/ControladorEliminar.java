
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.frmEliminar;

/**
 *
 * @author Pablo_Fuentes
 */
public class ControladorEliminar implements WindowListener, MouseListener {

    
    /**** CREANDO OBJETOS ****/
    
    frmEliminar feli = new frmEliminar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();
    
    
    /***INTERACCION CON LA VENTANA ***/
    
    public ControladorEliminar(frmEliminar feli, PaisVO pvo, PaisDAO pdao){
    
    this.feli = feli;
    this.pvo = pvo;
    this.pdao = pdao;
    
    feli.addWindowListener(this);
    feli.tblEliminar.addMouseListener(this);
    
    
    }
    
    /****PARA MOSTRAR Y ACTULIZAR LA TABLA CUANDO SE ELEIMINA Y SE CARGUE */
    
    private void mostrar(){
    
    DefaultTableModel m = new DefaultTableModel(){
    @Override
    public boolean isCellEditable(int row, int column){
    
        return false;
    }
    
    };
    
    m.setColumnCount(0);
    m.addColumn("Id del País");
    m.addColumn("Nombre del País");
    m.addColumn("Capital del País");
    m.addColumn("Población del País");
    
        for ( PaisVO pvo : pdao.actualizarTabla()){
        m.addRow(new Object[]{
            pvo.getIdPais(),pvo.getNombrePais(),pvo.getCapitalPais(),pvo.getPoblacionPais() });
        
        }
    feli.tblEliminar.setModel(m);
    
    }
    
    /****ACCION ELIMINAR ***************/
    
    private void setDatoEliminar(){
    
    int numRow;
    
    numRow = feli.tblEliminar.getSelectedRow();
    pvo.setIdPais(Integer.parseInt(String.valueOf(feli.tblEliminar.getValueAt(numRow, 0))));
    
    int idPais = feli.opEliminar.showConfirmDialog(feli,"Seguro desea eliminar el país: "+feli.tblEliminar.getValueAt(numRow, 1),"ELIMINAR",2);
    
    if(idPais== feli.opEliminar.OK_OPTION){
    
    this.eliminar();
    
    feli.opEliminar.showMessageDialog(feli,"Registro eliminado correctamente");
    
    
    
        }
    }
    
    private void eliminar(){
    /***ELIMINA CON EL QUERY********/
    
    pvo.getIdPais();
    pdao.eliminar(pvo);
    
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
     
        this.mostrar();
        
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
     
    }

    @Override
    public void windowClosed(WindowEvent e) {
     
    }

    @Override
    public void windowIconified(WindowEvent e) {
     
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
     
    }

    @Override
    public void windowActivated(WindowEvent e) {
    
        this.mostrar();
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
     
    }

    @Override
    public void mouseClicked(MouseEvent e) {
     
        if(e.getClickCount()==2){
            this.setDatoEliminar();
        
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
     
    }

    @Override
    public void mouseReleased(MouseEvent e) {
     
    }

    @Override
    public void mouseEntered(MouseEvent e) {
     
    }

    @Override
    public void mouseExited(MouseEvent e) {
     
    }
    
    
    
    
}
