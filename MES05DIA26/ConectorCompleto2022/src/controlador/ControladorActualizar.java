
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import modelo.Extras;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.frmActualizar;

/**
 *
 * @author Pablo_Fuentes
 */
public class ControladorActualizar implements ActionListener, WindowListener, MouseListener {

    /**implementar **/ 
    
    frmActualizar fac = new frmActualizar();
    
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();
    
    
    /***SE CREA UN CONTRUCTOR **/
    
    public ControladorActualizar (frmActualizar fac, PaisVO pvo, PaisDAO pdao){
    
    this.fac = fac;
    this.pvo = pvo;
    this.pdao = pdao;
    

    /****ACTUACIONES ENTRE LA VENTANA Y EL BOTON QUE EXISTE*/
    
    
    fac.btnActualizar.addActionListener(this);
    fac.addWindowListener(this);
    fac.tblActualizar.addMouseListener(this);
    
    }
    
    
    
    
  private void MostrarTabla (){
  
  DefaultTableModel m = new DefaultTableModel(){ /*** ESTO SE HACE PARA NO PODER EDITAR EL TEXTO EN LA TABLA*/
  
  @Override
          public boolean isCellEditable(int row, int column){
  
          return false;
          }
  }; /* HASTA QUI TERMINA EL TEXTO PARA EVITAR QUE SE EDITE LA TABLA*/
  
  
m.setColumnCount(0); /*para que la tabla este vacia**/
m.addColumn("Id del País");
m.addColumn("Nombre del País");
m.addColumn("Capital del País");
m.addColumn("Población del País");

  
for(PaisVO pvo : pdao.actualizarTabla()){

/***SE LLENA POR FILA***/

m.addRow(new Object[]{pvo.getIdPais(),pvo.getNombrePais(),pvo.getCapitalPais(),pvo.getPoblacionPais()});

}
  
/******PARA LLAMAR LA TABLA****/

fac.tblActualizar.setModel(m);



  }  
    
private void setDatosPais(){

//*APLICACION DEL GET SELECTD ROW* AQUI SE ESTA LLENANDO LOS CUADROS DE TEXTO EDITABLES//

int numRow;

numRow = fac.tblActualizar.getSelectedRow();

/*ASIGNANDO LOS VALORES A LOS CUADROS DE TEXTO */

fac.txtIdPais.setText(String.valueOf(fac.tblActualizar.getValueAt(numRow,0)));
fac.txtNombre.setText(String.valueOf(fac.tblActualizar.getValueAt(numRow,1)));
fac.txtCapital.setText(String.valueOf(fac.tblActualizar.getValueAt(numRow,2)));
fac.txtPoblacion.setText(String.valueOf(fac.tblActualizar.getValueAt(numRow,3)));
}
 
private void accioActualizar(){

/***ENVIANDO LOS DATOS DE LOS CUADROS DE TEXTO AL CONTROLADOR*/

this.pvo.setIdPais(Integer.parseInt(fac.txtIdPais.getText()));
this.pvo.setNombrePais(fac.txtNombre.getText());
this.pvo.setCapitalPais(fac.txtCapital.getText());
this.pvo.setPoblacionPais(Long.parseLong(fac.txtPoblacion.getText()));
this.pvo.setFechaActPais(Extras.fechaHoy());

if(pdao.actualizar(pvo)==true){

fac.optActulaizar.showMessageDialog(fac,"Datos actualizados correctamente");

fac.txtIdPais.setText("");
fac.txtNombre.setText("");
fac.txtCapital.setText("");
fac.txtPoblacion.setText("");

} else {

fac.optActulaizar.showMessageDialog(fac,"Error: Datos no actualizados");

fac.txtIdPais.setText("");
fac.txtNombre.setText("");
fac.txtCapital.setText("");
fac.txtPoblacion.setText("");

}




}


    @Override
    public void actionPerformed(ActionEvent e) {
    
      if(e.getSource().equals(fac.btnActualizar)){
      
           if(!fac.txtIdPais.getText().equals("")){
            
               this.accioActualizar();
               this.MostrarTabla();
           
           } else  {fac.optActulaizar.showMessageDialog(fac,"Debe elegir con doble clic un pais para actualizar");}
      
      
      }  
        
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
    /* PARA LAS ACCIONES DE WINDOWS */  
    /* PARA QUE SIEMPRE ACTUALICE CUANDO SE ENFOQUE LA VENTANA HAY QUE PONERLO TAMBIEN EN ACTIVATED*/  
    
    this.MostrarTabla();

    }

    @Override
    public void windowClosing(WindowEvent e) {
      
        /* PARA RESETEAR CUALQUIER DATO ACTIVADO ANTERIORMENTE */
 
        fac.txtIdPais.setText("");
        fac.txtNombre.setText("");
        fac.txtCapital.setText("");
        fac.txtPoblacion.setText("");
    
        
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
        
           /* PARA LAS ACCIONES DE WINDOWS */  
    /* PARA QUE SIEMPRE ACTUALICE CUANDO SE ENFOQUE LA VENTANA HAY QUE PONERLO TAMBIEN EN ACTIVATED*/  
    
    this.MostrarTabla();


    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
    @Override
 public void mouseClicked(MouseEvent e){
 
     if (e.getClickCount()==2){
     
         this.setDatosPais();
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
