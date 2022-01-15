package ClasaAbstracta;

public class PersoanaInginerItistAbstract extends PersoanaAbstract{

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

    @Override
    public void scrieCod() {
        System.out.println("Itistul scrie cod");

    }

    @Override
    public void ruleazaAplicatii() {
        System.out.println("Itistul ruleaza aplicatii");

    }
}
