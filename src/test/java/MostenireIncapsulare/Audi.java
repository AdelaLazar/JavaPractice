package MostenireIncapsulare;

import java.util.List;

public class Audi extends Masina {


    private String culoare;
    private List<String> dotarile;
    private Double pret;
    private String model;


    public Audi(String tipCaroserie, String transmisie, String tractiune, Integer usi, Integer locuri, String culoare, List<String> dotari,Double pret, String model) {
        super(tipCaroserie, transmisie, tractiune, usi, locuri);
        this.culoare= culoare;
        this.dotarile= dotari;
        this.model= model;
        this.pret= pret;


    }

    public void pretfinal(){

        Double pretfinal= pret;

        Integer index= 0;
        while (index<dotarile.size()){
            if(dotarile.get(index).equals("interior piele")){
                pretfinal=pretfinal+ 2.000;
            }
            if(dotarile.get(index).equals("volanul incalzit")){
                pretfinal=pretfinal+ 3.500;
            }
            if(dotarile.get(index).equals("ventilatie scaune")){
                pretfinal=pretfinal+ 1.000;

            }
            if(dotarile.get(index).equals("plafon carbon")){
                pretfinal=pretfinal+ 4.000;
            }
            index++;
        }
        System.out.println("Pretul final al masinii Audi model "+ model+ " este: "+pretfinal);
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public List<String> getDotarile() {
        return dotarile;
    }

    public void setDotarile(List<String> dotarile) {
        this.dotarile = dotarile;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "culoare='" + getCuloare() + '\'' +
                ", dotarile=" + getDotarile() +
                ", pret=" + getPret() +
                ", model='" + getModel() + '\'' +
                ", tipCaroserie='" + getTipCaroserie() + '\'' +
                ", transmisie='" + getTransmisie() + '\'' +
                ", tractiune='" + getTractiune() + '\'' +
                ", usi=" + getUsi() +
                ", locuri=" + getLocuri() +
                '}';
    }
}



