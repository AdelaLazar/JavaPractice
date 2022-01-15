package Interface;

public class PersoanaInginer extends PersoanaInterface {

    public PersoanaInginer(String nume, String prenume) {
        super(nume, prenume);
    }




     @Override
     public void executie(){
         System.out.println("Inginerul face executie");
     }


    @Override
    public void proiecteqaza(){
        System.out.println("Inginerul proiecteaza");
    }




}


