
package Modelo;

/**
 *
 * @author Pablo_Fuentes
 */
public class ModeloLogico {

private String [] espanol = new String[10];
private String [] ingles = new String[10];


/*CONTROLADOR VACIO*/
public ModeloLogico (){

}

    public String[] getEspanol() {
        return espanol;
    }

    public void setEspanol(String[] espanol) {
        this.espanol = espanol;
    }

    public String[] getIngles() {
        return ingles;
    }

    public void setIngles(String[] ingles) {
        this.ingles = ingles;
    }

public String ValoresIngles(int indice){

ingles[0]="good";
ingles[1]="your";
ingles[2]="year";
ingles[3]="into";
ingles[4]="people";
ingles[5]="take";
ingles[6]="know";
ingles[7]="him";
ingles[8]="just";
ingles[9]="like";

    return ingles[indice];
}

public String ValoresEspanol (int indice){

espanol[0]="bueno";
espanol[1]="tu/tus (posesivo)";
espanol[2]="año";
espanol[3]="dentro de, en, contra";
espanol[4]="gente, personas";
espanol[5]="tomar";
espanol[6]="saber, conocer";
espanol[7]="él";
espanol[8]="solo, justo, acabar de";
espanol[9]="gustar, como (adv.)";

return espanol[indice];
}


}
