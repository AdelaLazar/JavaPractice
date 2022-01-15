package ClasaAbstracta;

import org.junit.Test;

public class AbstractTest {

    @Test

    public void testAutomat(){
        PersoanaInginerAbstract Florin= new PersoanaInginerAbstract("Florin","Matei");
        Florin.proiecteaza();
        Florin.executie();
        Florin.afiseazaVarsta(25);

        PersoanaItistAbstract Alex= new PersoanaItistAbstract("Alex","Dorha");
        Alex.scrieCod();
        Alex.ruleazaAplicatii();
        Alex.afiseazaVarsta(27);

        PersoanaInginerItistAbstract Superman= new PersoanaInginerItistAbstract("Superman", "Erou");
        Superman.scrieCod();
        Superman.ruleazaAplicatii();
        Superman.proiecteaza();
        Superman.executie();


    }
}
