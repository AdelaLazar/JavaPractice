package obiectConstructor;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CursantTest {
    @Test
    public void testautomat(){
        System.out.println("---obiectul1---");
        Cursant LazarAdela=new Cursant("Lazar","Adela",30,2.500, 'F',true, Arrays.asList("Automation","Manual","DataBase") );
        LazarAdela.dateCursant();
        System.out.println("---obiectul1 modificat");
        LazarAdela.prenume="Adela-Carla";
        LazarAdela.verificadiplomabac();

        System.out.println("---obiectul2---");

        Cursant ManolacheMariCarmen=new Cursant("Manolache","MariCarmen",23, 2.55,'F',true, Arrays.asList("Automation"));
        ManolacheMariCarmen.dateCursant();
        ManolacheMariCarmen.verificadiplomabac();

        System.out.println("---romandescurcaret---");
        Cursant MareleAlb=new Cursant("Marele", "Alb", 25,'M',true, Arrays.asList("Programare","Design"));
        MareleAlb.dateCursant();

        System.out.println("Dorha Alex");
        Cursant DorhaAlex=new Cursant("Dorha","Alex", 27, 2.55,'M', true, "Automation");
        DorhaAlex.dateCursant();



    }

}
