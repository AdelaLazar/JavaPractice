package ClasaAbstracta;

public class PersoanaInginerAbstract extends PersoanaAbstract{

    public String nume;
    public String prenume;

    @Override
    public void proiecteaza() {
        System.out.println("Inginerul proiecteaza");
    }

    @Override
    public void executie() {
        System.out.println("Inginerul executa");

    }


    }

