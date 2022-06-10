
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Pablo_Fuentes
 */
public interface ConsultasPais {
 
/* la logica tenga mejor control metodo para utilizar la insercion*/

/*01. parametro de tipo clase que contiene todos los metodos de forma publicA, la "p" puede ser cualquier nombre*/
public boolean insertar(PaisVO p);

/*PARA CONFIGUARA LA TABLA DE MOSTRAR*/

public ArrayList<PaisVO> consultar();


/***PARA CONFIGURAR EL FORMULARIO ACTUALIZAR***/


public boolean actualizar (PaisVO p);

public ArrayList<PaisVO> actualizarTabla();


/****PARA ELIMINAR UN REGISTRO*************/
public boolean eliminar(PaisVO p);



   
}



