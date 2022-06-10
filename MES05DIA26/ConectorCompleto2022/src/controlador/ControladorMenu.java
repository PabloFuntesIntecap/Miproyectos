
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.frmActualizar;
import vista.frmEliminar;
import vista.frmInsertar;
import vista.frmMenu;
import vista.frmMostrar;

/**
 *
 * @author Pablo_Fuentes
 */
public class ControladorMenu implements ActionListener {

    frmMenu vMe = new frmMenu();
    frmInsertar vIn = new frmInsertar();
    frmMostrar vMo = new frmMostrar();
    frmActualizar fac = new frmActualizar();
    frmEliminar feli = new frmEliminar();
    
    public ControladorMenu (frmMenu vMe, frmInsertar vIn, frmMostrar vMo, frmActualizar fac, frmEliminar feli){
    
    this.vMe = vMe;
    this.vIn = vIn;
    this.vMo = vMo;
    this.fac = fac;
    this.feli = feli;
    
    vMe.btnInsertar.addActionListener(this);
    vMe.btnMostrar.addActionListener(this);
    vMe.btnActualizar.addActionListener(this);
    vMe.btnEliminar.addActionListener(this);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
      
       if(e.getSource()==this.vMe.btnInsertar){
       this.vIn.setVisible(true);
       this.vIn.setLocationRelativeTo(vMe);
       this.vIn.setResizable(false);
       
       }
        
        if(e.getSource()==this.vMe.btnMostrar){
       this.vMo.setVisible(true);
       this.vMo.setLocationRelativeTo(vMe);
       this.vMo.setResizable(false);
       
       }     
    
        if(e.getSource()==this.vMe.btnActualizar){
       this.fac.setVisible(true);
       this.fac.setLocationRelativeTo(vMe);
       this.fac.setResizable(false);
       
       }     
        
       if(e.getSource()==this.vMe.btnEliminar){
           
           this.feli.setVisible(true);
           this.feli.setLocationRelativeTo(vMe);
           this.feli.setResizable(false);
       }
        
    }
    
    
    
    
}
