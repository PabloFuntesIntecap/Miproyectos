
package Controlador;

import Modelo.ModeloLogico;
import Vista.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Pablo_Fuentes
 */
public class controlador implements ActionListener, WindowListener {

   

frmPrincipal vista = new frmPrincipal ();
ModeloLogico modelo = new ModeloLogico();

// CONSTRUCTOR//

public controlador (frmPrincipal vista, ModeloLogico modelo){

this.vista = vista;
this.modelo = modelo;


this.vista.cmbTraducir.addActionListener(this);
this.vista.addWindowListener(this);
}

public void agregaritems(){

this.vista.cbxLista.removeAllItems();

for(int i=0; i<10;i++){
this.vista.cbxLista.addItem(this.modelo.ValoresEspanol(i));
}

}
private void traducir(){

 
 int indice = this.vista.cbxLista.getSelectedIndex();
String traduccion = this.modelo.ValoresIngles(indice);

this.vista.jOptionPane1.showMessageDialog(this.vista,traduccion);

}



@Override
public void actionPerformed (ActionEvent e) {

if(e.getSource()==vista.cmbTraducir)
this.traducir();

}   

    @Override
    public void windowOpened(WindowEvent e) {
       this.agregaritems();
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
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }


}
