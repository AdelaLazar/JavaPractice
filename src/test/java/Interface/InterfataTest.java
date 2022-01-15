package Interface;

import org.junit.Test;

public class InterfataTest {

    @Test

    public void testAutomat() {
        PersoanaInginerInterface Florin = new PersoanaInginerInterface("Matei", "Florin");
        Florin.executie();
        Florin.proiecteaza();


        PersoanaitistInterface Alex = new PersoanaitistInterface("Dorha", "Alex");
        Alex.scrieCod();
        Alex.ruleazaAplicatii();

        PersoanaInginerItistInterface Superman= new PersoanaInginerItist();
        Superman.executie();
        Superman.proiecteaza();
        Superman.scrieCod();
        Superman.ruleazaAplicatii();
    }





}
