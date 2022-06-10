
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Pablo_Fuentes
 */
public class Conector {
    
    private String driver="com.mysql.jdbc.Driver"; /**ayuda hacer el direccionamiento**/
     private String host="127.0.0.1";  /***nombre del host* ip o servidor**Xamp apache** puede ser el localhost**/
    private String user="root"; /*** USUARIO DE CONEXION, USUARIOS PARA VER, MODIFICAR***/
    private String pass=""; 
    private String db="bdconector";
    private String cadena; /***va a tener la informacion de las variables anteriores**/
    
    
    //DECLARACION DE OBJETOS PARA LA CONEXION//
    
    Connection connetion;
    
    Statement statement;
    
    
    // DECLARACION DE METODOS PARA LA CONECCION
    
    //METODO DE CONECTAR
    
    public void conectar(){
    
        this.cadena = "jdbc:mysql://"+this.host +"/"+this.db; //*CREACION DE UN PAD DE UNA CONEXION**/
        
        try {
        
            Class.forName(this.driver).newInstance();
            //**para activar el paquete de la clase driver para que realice la conexion**/
            this.connetion = DriverManager.getConnection(cadena,this.user, this.pass);
           
                 
            
        } catch (Exception e){
            System.err.println("Error[MCon CONECTAR EN CONECTOR]: "+e.getMessage());
      }
    }
    
  // METODO DE DESCONECTAR
    
    public void desconectar(){
    
    try {
     this.connetion.close();
    } catch (Exception e) {
    
            System.err.println("Error [MDes]: "+e.getMessage());
    }
    
    }
    
 /// METODO PARA REALIZAR LAS CONSULTAS DE INSERT UPDATE DELETE;
    
public int consultasMultiples(String query){

int resultado;

try {

    this.conectar();
    this.statement = this.connetion.createStatement();
    resultado = this.statement.executeUpdate(query);

} catch (Exception e) {
System.err.println("Error [MCM CONSULTAS MULTIPLES CONECTOR]: "+e.getMessage());
return 0;
}
return resultado;
}   

// METODO PARA REALIZAR CONSULTAS SELECT

public ResultSet ConsultaDatos (String consulta){


try {

    this.conectar();
    ResultSet resultado = null;
    
    this.statement = this.connetion.createStatement();
    resultado = this.statement.executeQuery(consulta);
    return resultado;
 
} catch (Exception e) {
System.err.println("Error [MCD CONSULTA DATOS EN CONECTOR]: "+e.getMessage());
  
}   
return null; 
} 
 
}
