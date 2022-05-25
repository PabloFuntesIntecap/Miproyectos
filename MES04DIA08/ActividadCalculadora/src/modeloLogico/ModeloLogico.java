
package modeloLogico;
import java.time.LocalDate;
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
    
//VARIABLES
private String Valor1;
private String Valor2;
private Double Resultado;
private Double resultadoEspecial;
private String ruta;
private String texto;

    public String getValor1() {
        return Valor1;
    }

    public void setValor1(String Valor1) {
        this.Valor1 = Valor1;
    }

    public String getValor2() {
        return Valor2;
    }

    public void setValor2(String Valor2) {
        this.Valor2 = Valor2;
    }

    public Double getResultado() {
        return Resultado;
    }

    public void setResultado(Double Resultado) {
        this.Resultado = Resultado;
    }

    public Double getResultadoEspecial() {
        return resultadoEspecial;
    }

    public void setResultadoEspecial(Double resultadoEspecial) {
        this.resultadoEspecial = resultadoEspecial;
    }
    
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
     public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }   

//VALIDAR DATOS:
public static boolean validacion(String v1, String v2){

	try {
		Integer.parseInt(v1);
                Integer.parseInt(v2);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}    
        
}


public static boolean validacionEspecial (String v1){

	try {
		Double.parseDouble(v1);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	} 

}


//OPERACIONES:

public Double suma(String v1, String v2){


this.Resultado = Double.parseDouble(v1) + Double.parseDouble(v2);

return this.Resultado;

}

public Double resta(String v1, String v2){


this.Resultado = Double.parseDouble(v1) - Double.parseDouble(v2);

return this.Resultado;

}

public Double multiplicacion(String v1, String v2){


this.Resultado = Double.parseDouble(v1) * Double.parseDouble(v2);

return this.Resultado;

}

public Double division(String v1, String v2){


this.Resultado = Double.parseDouble(v1) / Double.parseDouble(v2);

return this.Resultado;

}

public Double modulo(String v1, String v2){


this.Resultado =Double.parseDouble(v1) % Double.parseDouble(v2);

return this.Resultado;

}

public Double potencia(String v1, String v2){


this.Resultado = Math.pow(Double.parseDouble(v1), Double.parseDouble(v2));

return this.Resultado;

}

////OPERACIONES ESPECIALES

public Double absoluto(Double v1){


this.resultadoEspecial = Math.abs(this.Resultado);

return this.resultadoEspecial;

}

///INCOMPATIBILIDADES

public double redondeo(double v1){
    
 this.resultadoEspecial = Double.valueOf(Math.round(this.Resultado));



return this.resultadoEspecial;

}

///

public Double seno(Double v1){


this.resultadoEspecial = Math.sin(this.Resultado);

return this.resultadoEspecial;

}

public Double coseno(Double v1){


this.resultadoEspecial = Math.cos(this.Resultado);

return this.resultadoEspecial;

}

public Double tangente(Double v1){


this.resultadoEspecial = Math.tan(this.Resultado);

return this.resultadoEspecial;

}

public String fecha (){


//formato de la fecha establecida dia/mes/año
String fecha = LocalDate.now().toString();

return fecha; 
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