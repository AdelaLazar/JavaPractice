package ClasaAbstracta;

public class PersoanaItistAbstract extends PersoanaAbstract{

    public String nume;
    public String prenume;


    @Override
    public void ruleazaAplicatii() {
        System.out.println("Itistul ruleaza");


    }


    @Override
    public void scrieCod() {
        System.out.println("Itistul scrie cod");


    }
}
