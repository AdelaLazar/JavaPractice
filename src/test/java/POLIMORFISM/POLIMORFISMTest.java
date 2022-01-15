package POLIMORFISM;

import org.junit.Test;

public class POLIMORFISMTest {

    @Test

    public void testAutomat(){

        Caine Labrador= new Caine("GoldenRetriver", "Medie","Alba");
        Labrador.scoateSunet();
        Labrador.apeleazaMetodaParinte();
        Labrador.cumparaProduse();
        Labrador.cumparaProduse("lesa");
        Labrador.cumparaProduse(2);
    }
}
