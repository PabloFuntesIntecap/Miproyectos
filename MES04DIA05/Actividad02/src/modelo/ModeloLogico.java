
package modelo;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


/**
 *
 * @author Pablo_Fuentes
 */
public class ModeloLogico {
    
private String texto;
private String ruta;

// Controlador vacío.

public ModeloLogico(){}

// Creación de Get and Set.
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

// Creación de Get and Set.
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }    
    
    
    
// Procedimientos

public String Mayusculas (String texto){

texto = texto.toUpperCase();

return texto;
}


public String Minusculas (String texto){

texto = texto.toLowerCase();

return texto;

}


public Font Negritas (){

Font n = new Font("Arial",Font.BOLD,13);


return n;
}

public void abrir(){

//TOMADO COMO EJEMPLO EL DE CLASE

File f;
FileReader fr;
BufferedReader br;

this.texto = "";

try{

f = new File(this.ruta);
fr = new FileReader(f);
br = new BufferedReader(fr);

String lineas;

while ((lineas = br.readLine())!=null){

this.texto +=lineas+"\n";

}


}
catch (Exception ex){

System.err.println(ex.getMessage());
}

}


public void guardar(){

    //TOMADO COMO EJEMPLO EL DE CLASE

FileWriter fw;
PrintWriter pw;


try{

fw = new FileWriter(ruta+".txt");
pw = new PrintWriter (fw);

pw.println(this.texto);

fw.close();

   }

catch (Exception ex){

System.err.println(ex.getMessage());
    }
}

}
