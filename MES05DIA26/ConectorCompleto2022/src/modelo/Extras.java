
package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Pablo_Fuentes
 */
public class Extras {
    
public static String fechaHoy(){

String fechaHoy;

Date fecha = new Date();

SimpleDateFormat sdf = new SimpleDateFormat("yyy,MM/dd");

fechaHoy = sdf.format(fecha.getTime());

return fechaHoy;
}



}
