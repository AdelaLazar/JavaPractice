package ClasaAbstracta;

import org.openqa.selenium.json.JsonOutput;

public class PersoanaAbstract<varsta> {

    //Clase abstracte = pot sau nu sa contina metode abstracte.
    //Clasa care extinde o clasa abstracta= implementeaza toate metodele abstracte.
    //O clasa abstracta poate sa contina un constructor= tot nu putem declara un obiect.
    //Metodele abstracte folosesc cuvantul"abstract".
    //O clasa abstracta poate implementa o interfata.
    //O interfata nu poate extinde o clasa abstract.
    //Metodele ar trebui sa fie publice.


    public abstract void proiecteaza();
    public abstract void executie();
    public abstract void scrieCod();

    public void ruleazaAplicatii();



    public void afiseazaVarsta(Integer varsta) {
        System.out.println("Are varsta de:" + varsta);

    }







}
