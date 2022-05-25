
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloLogico;
import vista.frmPrincipal;

/**
 *
 * @author Pablo_Fuentes
 */

//PASO 1 IMPLEMANTAR EL ACTIONLISTENER LUEGO CREAR LOS METODOS ABSTRACTOS OVERRIDE
//PASO 2 CREAR LOS OBJETOS DE LAS CLASES VISTA Y MODELO

public class Controlador implements ActionListener {
 
frmPrincipal vista = new frmPrincipal();
ModeloLogico modelo = new ModeloLogico();

//CONTRUCTOR DEL CONTROLADOR

public Controlador (frmPrincipal vista, ModeloLogico modelo){

this.vista = vista;
this.modelo = modelo;

this.vista.mmsiAbrir.addActionListener(this);
this.vista.mmsiGuardar.addActionListener(this);
this.vista.mmsiTodasMayus.addActionListener(this);
this.vista.mmsiTodasMinus.addActionListener(this);
this.vista.mmsiTodasNegrita.addActionListener(this);


}   
private void abrir(){
//TOMADO DE EJEMPLO EN CLASE

int cierre = this.vista.fcDirectorio.showOpenDialog(vista);

if(cierre != this.vista.fcDirectorio.CANCEL_OPTION){
    
modelo.setRuta(vista.fcDirectorio.getSelectedFile().toString());
modelo.abrir();
vista.txtArea.setText(modelo.getTexto());

}

}


private void guardar(){
    
//TOMADO DE EJEMPLO EN CLASE

int cierre = this.vista.fcDirectorio.showSaveDialog(vista);

if(cierre != this.vista.fcDirectorio.CANCEL_OPTION){
    
modelo.setTexto(vista.txtArea.getText());
modelo.setRuta(vista.fcDirectorio.getSelectedFile().toString());
modelo.guardar();
}
}

@Override
public void actionPerformed (ActionEvent e) {

if (e.getSource()==vista.mmsiAbrir){

this.abrir();

}

if (e.getSource()==vista.mmsiGuardar){

this.guardar();

}

if (e.getSource()==vista.mmsiTodasMayus){


this.vista.txtArea.setText(this.modelo.Mayusculas(this.vista.txtArea.getText()));

}

if (e.getSource()==vista.mmsiTodasMinus){

this.vista.txtArea.setText(this.modelo.Minusculas(this.vista.txtArea.getText()));

}

if (e.getSource()==vista.mmsiTodasNegrita){

//EN EL MODELO LOGICO SE CREA UN OBJETO TIPO FONT PARA PODER APLICARLO AL CONTROLADOR
this.vista.txtArea.setFont(this.modelo.Negritas());

}

}


}
