
package modelo;

import conexion.Conector;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Pablo_Fuentes
 */
public class PaisDAO implements ConsultasPais {
    

/****01. interaccion de codigo java y codigo sql**/
/*se implementa**/


@Override
public boolean insertar(PaisVO p){

Conector c = new Conector();


    try {
     
     c.conectar();

     String query ="INSERT INTO pais (nombre_pais, "
+ "capital_pais, poblacion_pais, fecha_ingreso_pais) "
+ "VALUES ('" + p.getNombrePais()+"', " 
+ "'"+p.getCapitalPais()+"', "
+p.getPoblacionPais()+ ", "
+"'"+p.getFechaIngPais()+"')"; /*LENGUAJE QUE NOS PERMITIRA HACER UNA INSERCION DE NUESTRA TABLA DE NUESTRA BASE DE DATOS*/    

/* SE USA EL GET PORQUE: COMO SON VARIABLES PRIVADAS HAY QUE IR A JALAR LA INFORMACION*/

c.consultasMultiples(query);
return true;
    } catch (Exception e) {
    
            System.err.println("Error [MInsertar]: "+e.getMessage());
    c.desconectar();
    }
c.desconectar();
return false;
}

/**** CREADO PARA RETORNAR LA VISTA DE DATOS*/

    @Override
    public ArrayList<PaisVO> consultar() {
        
        Conector c = new Conector();
        ArrayList<PaisVO> info = new ArrayList<>();
        
      /***/
          try {
     c.conectar();
     String query = "SELECT p.id_pais, p.nombre_pais, p.capital_pais, p.poblacion_pais FROM bdconector.pais p";
     
     /** ASIGNAR LOS VALORES CONSEGUIDOS DEL QUERY*/
     
     ResultSet rs = c.ConsultaDatos(query);
     
     /* LLENAR EL ARRAY*/
     while(rs.next()){
     
     PaisVO pvo = new PaisVO();
     
     pvo.setIdPais(rs.getInt(1));
     pvo.setNombrePais(rs.getString(2));
     pvo.setCapitalPais(rs.getString(3));
     pvo.setPoblacionPais(rs.getLong(4));
     
     info.add(pvo);
     
     
     }
     
     c.desconectar();

    } catch (Exception e) {
    
            System.err.println("Error [Mostrar en Consulta]: "+e.getMessage());
    c.desconectar();
    }
        
        return info;
    }

    @Override
    public boolean actualizar(PaisVO p) {
       /***METODO PRIVADO EN CONTROLADOR ACTUALIZAR SE LLAMA accionActualizar() */
       
       Conector c = new Conector();
       
       try {
       c.conectar();
       String query ="UPDATE bdconector.pais SET nombre_pais = '"+p.getNombrePais()+"', "+
               "capital_pais = '"+p.getCapitalPais()+"', "+"poblacion_pais = '"+p.getPoblacionPais()+"', "+
               "fecha_actualiza_pais = '"+p.getFechaActPais()+"' WHERE id_pais ="+p.getIdPais();
       
       c.consultasMultiples(query);
       
       
       } catch (Exception e){
       
       System.err.println("ERROR: [MActualizar DAO]: "+ e.getMessage());
       c.desconectar();
       return false;
       }
        c.desconectar();
        return true;
        
    }

    @Override
    public ArrayList<PaisVO> actualizarTabla() {
    
        
        Conector c = new Conector();
        ArrayList<PaisVO> info = new ArrayList<>();
        
      /***/
          try {
     c.conectar();
     String query = "SELECT p.id_pais, p.nombre_pais, p.capital_pais, p.poblacion_pais FROM bdconector.pais p";
     
     /** ASIGNAR LOS VALORES CONSEGUIDOS DEL QUERY*/
     
     ResultSet rs = c.ConsultaDatos(query);
     
     /* LLENAR EL ARRAY*/
     while(rs.next()){
     
     PaisVO pvo = new PaisVO();
     
     pvo.setIdPais(rs.getInt(1));
     pvo.setNombrePais(rs.getString(2));
     pvo.setCapitalPais(rs.getString(3));
     pvo.setPoblacionPais(rs.getLong(4));
     
     
     info.add(pvo);
     
     
     }
     
     c.desconectar();

    } catch (Exception e) {
    
            System.err.println("Error [Mostrar Tabla]: "+e.getMessage());
    c.desconectar();
    }
        
        return info;    
        
    }

  /***********SECCION ELIMINAR ****************/
    
    @Override
    public boolean eliminar(PaisVO p){
    
    Conector c = new Conector();
    
    try{
    c.conectar();
    String query = "DELETE FROM bdconector.pais WHERE id_pais ="+p.getIdPais();
    c.consultasMultiples(query);
    
    } catch (Exception e){
         System.err.println("Error [Eliminar en PAISDAO]: "+e.getMessage());
         c.desconectar();
         return false;
    
    }
    c.desconectar();
    return true;
    
    }
    

}
