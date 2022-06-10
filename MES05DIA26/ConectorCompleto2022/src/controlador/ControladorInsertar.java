
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import modelo.Extras;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.frmInsertar;

/**
 * SE TIENE QUE IMPLEMANTAR
 * @author Pablo_Fuentes
 */
public class ControladorInsertar implements ActionListener {
    frmInsertar vIn = new frmInsertar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();

public ControladorInsertar(frmInsertar vIn, PaisVO pvo, PaisDAO pdao){

this.vIn = vIn;
this.pvo = pvo;
this.pdao = pdao;

vIn.btnRegistrar.addActionListener(this);
vIn.btnCancelar.addActionListener(this);

}

private void registrarPais(){

this.pvo.setNombrePais(this.vIn.txtnombre.getText());
this.pvo.setCapitalPais(this.vIn.txtCapital.getText());
this.pvo.setPoblacionPais(Long.parseLong(this.vIn.txtPoblacion.getText()));
this.pvo.setFechaIngPais(Extras.fechaHoy());
/* this.pdao.insertar(pvo);*/

/*para que tire el mensaje */

if(pdao.insertar(pvo)==true){

vIn.jopMensaje.showMessageDialog(vIn,"DatosRegistrados correctamente");
this.vIn.txtnombre.setText("");
this.vIn.txtCapital.setText("");
this.vIn.txtPoblacion.setText("");
} else {

vIn.jopMensaje.showMessageDialog(vIn,"Error, Datos no registrados");
this.vIn.txtnombre.setText("");
this.vIn.txtCapital.setText("");
this.vIn.txtPoblacion.setText("");

}


}



@Override
public void actionPerformed (ActionEvent e){

if(e.getSource()== vIn.btnRegistrar){

    if(!this.vIn.txtnombre.getText().equals("")&&
        !this.vIn.txtCapital.getText().equals("")&&
        !this.vIn.txtPoblacion.getText().equals("")) {

this.registrarPais();
}

else {

this.vIn.jopMensaje.showMessageDialog(vIn,"Debe de ingresar información en todos los campos");

}
}

if(e.getSource()== vIn.btnCancelar){

vIn.dispose();

}
}
}
