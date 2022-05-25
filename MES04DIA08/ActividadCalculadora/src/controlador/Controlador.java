
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import modeloLogico.ModeloLogico;
import vista.frmPrincipal;


public class Controlador implements ActionListener,WindowListener  {
    
    
    //CREANDO LOS MODELOS DE VISTA Y CONTROLADOR
    frmPrincipal vista = new frmPrincipal();
    ModeloLogico modelo = new ModeloLogico();
    
    
    //CONSTRUCTOR DEL CONTROLADOR
    
    public Controlador (frmPrincipal vista, ModeloLogico modelo){
    
    this.vista = vista;
    this.modelo = modelo;
    
    //ACTIVANDO TODOS LOS BOTONES:
    
    this.vista.btnAbsoluto.addActionListener(this);
    this.vista.btnCoseno.addActionListener(this);
    this.vista.btnDividir.addActionListener(this);
    this.vista.btnMultiplicar.addActionListener(this);
    this.vista.btnPotencia.addActionListener(this);
    this.vista.btnRedondeo.addActionListener(this);
    this.vista.btnResta.addActionListener(this);
    this.vista.btnSeno.addActionListener(this);
    this.vista.btnSuma.addActionListener(this);
    this.vista.mmiGuardar.addActionListener(this);
    this.vista.tbnTangente.addActionListener(this);
    this.vista.btnModulo.addActionListener(this);
    this.vista.addWindowListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        //PROCEDIMIENTOS ESPECIALES
        
   if (e.getSource()==vista.btnAbsoluto){
       if(this.modelo.validacionEspecial(this.vista.txtResultado.getText())==true){
       this.modelo.absoluto(Double.parseDouble(this.vista.txtResultado.getText()));
       this.vista.txtResultadoEspecial.setText(Double.toString(this.modelo.getResultadoEspecial()));
       }
       else{
      this.vista.opAvisos.showMessageDialog(this.vista,"VALOR ESPECIAL NO OPERABLE");  
       }
   }     
        
      if (e.getSource()==vista.btnCoseno){
       if(this.modelo.validacionEspecial(this.vista.txtResultado.getText())==true){
       this.modelo.coseno(Double.parseDouble(this.vista.txtResultado.getText()));
       this.vista.txtResultadoEspecial.setText(Double.toString(this.modelo.getResultadoEspecial()));  
  }
       else{
      this.vista.opAvisos.showMessageDialog(this.vista,"VALOR ESPECIAL NO OPERABLE");  
       }
       }    


      if (e.getSource()==vista.btnRedondeo){
       if(this.modelo.validacionEspecial(this.vista.txtResultado.getText())==true){       
       this.modelo.redondeo(Double.parseDouble(this.vista.txtResultado.getText()));
       this.vista.txtResultadoEspecial.setText(Double.toString(this.modelo.getResultadoEspecial()));  
      }
       else{
      this.vista.opAvisos.showMessageDialog(this.vista,"VALOR ESPECIAL NO OPERABLE");  
       }
       }    

  
      if (e.getSource()==vista.btnSeno){
      if(this.modelo.validacionEspecial(this.vista.txtResultado.getText())==true){     
       this.modelo.seno(Double.parseDouble(this.vista.txtResultado.getText()));
       this.vista.txtResultadoEspecial.setText(Double.toString(this.modelo.getResultadoEspecial()));  
   }
       else{
      this.vista.opAvisos.showMessageDialog(this.vista,"VALOR ESPECIAL NO OPERABLE");  
       }
       }    

      
      if (e.getSource()==vista.tbnTangente){
      if(this.modelo.validacionEspecial(this.vista.txtResultado.getText())==true){   
       this.modelo.tangente(Double.parseDouble(this.vista.txtResultado.getText()));
       this.vista.txtResultadoEspecial.setText(Double.toString(this.modelo.getResultadoEspecial()));  
  }
       else{
      this.vista.opAvisos.showMessageDialog(this.vista,"VALOR ESPECIAL NO OPERABLE");  
     }
     }    
   
             
      
      
      
   //PROCEDIMIENTOS NORMALES
   
       if (e.getSource()==vista.btnDividir){
              if (this.modelo.validacion(this.vista.txtValor1.getText(),this.vista.txtValor2.getText())==true){
       this.modelo.division(this.vista.txtValor1.getText(),this.vista.txtValor2.getText());
       this.vista.txtResultado.setText(Double.toString(this.modelo.getResultado()));  
          } else {
       
       this.vista.opAvisos.showMessageDialog(this.vista,"VALOR / VALORES NO VALIDOS");
       }
       }
   
      if (e.getSource()==vista.btnMultiplicar){
                 if (this.modelo.validacion(this.vista.txtValor1.getText(),this.vista.txtValor2.getText())==true){
       this.modelo.multiplicacion(this.vista.txtValor1.getText(),this.vista.txtValor2.getText());
       this.vista.txtResultado.setText(Double.toString(this.modelo.getResultado()));  
          } else {
       
       this.vista.opAvisos.showMessageDialog(this.vista,"VALOR / VALORES NO VALIDOS");
       }
       }
       
      if (e.getSource()==vista.btnPotencia){
            if (this.modelo.validacion(this.vista.txtValor1.getText(),this.vista.txtValor2.getText())==true){     
       this.modelo.potencia(this.vista.txtValor1.getText(),this.vista.txtValor2.getText());
       this.vista.txtResultado.setText(Double.toString(this.modelo.getResultado()));  
          } else {
       
       this.vista.opAvisos.showMessageDialog(this.vista,"VALOR / VALORES NO VALIDOS");
       }
       }
       
      if (e.getSource()==vista.btnResta){
                 if (this.modelo.validacion(this.vista.txtValor1.getText(),this.vista.txtValor2.getText())==true){
       this.modelo.resta(this.vista.txtValor1.getText(),this.vista.txtValor2.getText());
       this.vista.txtResultado.setText(Double.toString(this.modelo.getResultado()));  
          } else {
       
       this.vista.opAvisos.showMessageDialog(this.vista,"VALOR / VALORES NO VALIDOS");
       }
       }         
      
      if (e.getSource()==vista.btnSuma){
       if (this.modelo.validacion(this.vista.txtValor1.getText(),this.vista.txtValor2.getText())==true){
       this.modelo.suma(this.vista.txtValor1.getText(),this.vista.txtValor2.getText());
       this.vista.txtResultado.setText(Double.toString(this.modelo.getResultado()));
       } else {
       
       this.vista.opAvisos.showMessageDialog(this.vista,"VALOR / VALORES NO VALIDOS");
       }
       }
      
      if (e.getSource()==vista.btnModulo){
       if (this.modelo.validacion(this.vista.txtValor1.getText(),this.vista.txtValor2.getText())==true){
       this.modelo.modulo(this.vista.txtValor1.getText(),this.vista.txtValor2.getText());
       this.vista.txtResultado.setText(Double.toString(this.modelo.getResultado()));
       } else {
       
       this.vista.opAvisos.showMessageDialog(this.vista,"VALOR / VALORES NO VALIDOS");
       }
       }
///EVENTO GUARDAR
      if (e.getSource()==vista.mmiGuardar){
    this.guardar();
   }  
      
   }
   
    //OTROS EVENTOS
    private void guardar(){
    
//TOMADO DE EJEMPLO EN CLASE

int cierre = this.vista.fcGuardar.showSaveDialog(vista);

if(cierre != this.vista.fcGuardar.CANCEL_OPTION){
    
modelo.setTexto("Fecha resultado: "+ this.modelo.fecha()+" Resultado: "+this.vista.txtResultado.getText()+" Resultado Especial: "+this.vista.txtResultadoEspecial.getText());
modelo.setRuta(this.vista.fcGuardar.getSelectedFile().toString());
modelo.guardar();
}

        
    
}

    @Override
    public void windowOpened(WindowEvent e) {
     this.vista.lblFecha.setText("Fecha actual es: "+this.modelo.fecha());
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