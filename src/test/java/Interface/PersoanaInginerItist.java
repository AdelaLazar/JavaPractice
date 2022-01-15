package Interface;

public class PersoanaInginerItist extends PersoanaInterface implements{
    public PersoanaInginerItist(String nume, String prenume) {
        super(nume, prenume);
    }

    Override

    @Override
    public void proiecteaza(){
        System.out.println("InginerulItist proiecteaza");
    }

    public void executie(){
        System.out.println("InginerulItist face executie");
    }



    @Override
    public void scrieCod(){
        System.out.println("InginerulItist scrie cod");

    }
    @Override

    public void ruleazaCod(){
        System.out.println("InginerulItist ruleaqza cod");
    }
}
}
