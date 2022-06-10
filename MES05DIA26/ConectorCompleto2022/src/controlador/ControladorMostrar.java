
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.frmMostrar;

/**
 *
 * @author Pablo_Fuentes
 */
public class ControladorMostrar implements ActionListener, WindowListener {
   
    /***IMPLEMENT**/ 
 frmMostrar vMo = new frmMostrar();
 PaisVO pvo = new PaisVO();
 PaisDAO pdao = new PaisDAO();
 
  
public ControladorMostrar(frmMostrar vMo, PaisVO pvo, PaisDAO pdao){

this.vMo = vMo;
this.pvo = pvo;
this.pdao = pdao;

vMo.btnCancelar.addActionListener(this);
vMo.addWindowListener(this);   /* porque con la ventana tambien se va a interactuar*/


}
    
private void mostrar(){
/*** PARA CONFIGUARAR LA TABLA*****/

DefaultTableModel m = new DefaultTableModel();

/** ESTRUCTURA DE LA TABLA***/

m.setColumnCount(0); /*para que la tabla este vacia**/
m.addColumn("Id del País");
m.addColumn("Nombre del País");
m.addColumn("Capital del País");
m.addColumn("Población del País");




/***llenar la tabla*****/

for(PaisVO pvo : pdao.consultar()){

/***SE LLENA POR FILA***/

m.addRow(new Object[]{pvo.getIdPais(),pvo.getNombrePais(),pvo.getCapitalPais(),pvo.getPoblacionPais()});

}



/*** LLAMAR A LA TABLA***/

vMo.tblMostrar.setModel(m);
TableColumn cCero = vMo.tblMostrar.getColumnModel().getColumn(0);
cCero.setMinWidth(10);
cCero.setMaxWidth(75);

/** ASI CON LAS DEMAS****/



}    
    
    @Override
    public void actionPerformed(ActionEvent e) {
/* PARA LOS BOTONES*/       

           if(e.getSource()== vMo.btnCancelar){
           
           vMo.dispose();
           
           }

    }

    @Override
    public void windowOpened(WindowEvent e) {
        
   /* PARA LAS ACCIONES DE WINDOWS */  
    /* PARA QUE SIEMPRE ACTUALICE CUANDO SE ENFOQUE LA VENTANA HAY QUE PONERLO TAMBIEN EN ACTIVATED*/  
    
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
     /* PARA QUE SIEMPRE ACTUALICE CUANDO SE ENFOQUE LA VENTANA*/   
    this.mostrar();   
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
       
    }
   

    
}
