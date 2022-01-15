package POLIMORFISM;

public class Caine extends Animal {


    public Caine(String rasa, String talie, String culoare) {
        super(rasa, talie, culoare);

    }

    //Polimorfismul dinamic.

    @Override
    public void scoateSunet() {
        System.out.println("Cainele latra");
    }

    public void apeleazaMetodaParinte(){
        super.scoateSunet();
    }

    //Polimorfismul static.

    public void cumparaProduse(){
        System.out.println("Nu am cumparat niciun produs");
    }

    public void cumparaProduse(String Produs1){
        System.out.println("Am cumparat un produs:"+ Produs1 );
    }

    public void cumparaProduse(Integer Produs1){
        System.out.println("Am cumparat un produs:"+ Produs1 );
    }

    //pOLIMORFISMUL SE POATE APLICA IN METODA RETURN DOAR PRIN NR. PARAMETRILOR.

    public Integer getCaine(){
        return 1;
    }

    public int getCaine(String numar){
        return 1;
    }

    // Metoda return= putem aplica polimorfismul static.
    //Putem aplica polimorfismul static doar la nivel de nr. de parametri.











}
