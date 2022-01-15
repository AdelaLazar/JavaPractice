package Interface;

public class Persoanaitist extends PersoanaInterface{


    public Persoanaitist(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override

    public void scrieCod(){
        System.out.println("Itistul scrie cod");
    }

    @Override

    public void ruleazaAplicatii(){
        System.out.println("Itistul ruleaza aplicatii");
    }




}
