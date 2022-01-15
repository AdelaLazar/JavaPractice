package MostenireIncapsulare;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MostenireTest {

    @Test

    public void testautomat(){

        Audi AudiA3= new Audi("HatchBack", "4x4", "Integrala",4,5,"gri",
        Arrays.asList("interior piele","volan incalzit","ventilatie scaune", "plafon carbon"), 40.000, "A3");

        AudiA3.infoMasina();
        AudiA3.pretfinal();

        Audi AudiA8= new Audi("limuzina", "4x4", "Integrala",2,6,"rosu",
        Arrays.asList("interior piele","ventilatie scaune", "plafon carbon"), 40.000, "A8");

        AudiA8.infoMasina();
        AudiA8.pretfinal();
        AudiA8.setCuloare();




        Toyota Auris= new Toyota( "Compacta", "Manuala", "2x4", 2,6,"rosie",
                Arrays.asList("interior piele", "volan incalzit","ventilatie scaune","plafon carbon"), 35.000, "Auris","hybrid");

        Auris.infoMasina();
        Auris.pretfinal();
    }
}
