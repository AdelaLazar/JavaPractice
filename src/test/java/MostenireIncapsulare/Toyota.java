package MostenireIncapsulare;

import java.util.List;

public class Toyota extends Masina {

    private String culoare;
    private List<String> dotarile;
    private Double pret;
    private String model;
    private String motorizare;



    public Toyota(String tipCaroserie, String transmisie, String tractiune, Integer usi, Integer locuri, String culoare, List<String> dotarile, Double pret, String model, String motorizare) {
        super(tipCaroserie, transmisie, tractiune, usi, locuri);
        this.culoare = culoare;
        this.dotarile = dotarile;
        this.pret = pret;
        this.model = model;
        this.motorizare = motorizare;
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

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMotorizare() {
        return motorizare;
    }

    public void setMotorizare(String motorizare) {
        this.motorizare = motorizare;
    }

    public void pretfinal() {
        Double pretfinal = pret;

        Integer index = 0;
        while (index < dotarile.size()) {
            if (dotarile.get(index).equals("interior piele")) {
                pretfinal = pretfinal + 2.000;
            }
            if (dotarile.get(index).equals("volanul incalzit")) {
                pretfinal = pretfinal + 3.500;
            }
            if (dotarile.get(index).equals("ventilatie scaune")) {
                pretfinal = pretfinal + 1.000;

            }
            if (dotarile.get(index).equals("plafon carbon")) {
                pretfinal = pretfinal + 4.000;
            }
            index++;
        }
        System.out.println("Pretul final al masinii Toyota model " + model + " este: " + pretfinal);
    }

    public void infoMasina(){
        System.out.println("Detaliile despre masina Toyota model "+ model+" sunt urmatoarele:");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "tipCaroserie='" + getTipCaroserie() + '\'' +
                ", transmisie='" + getTransmisie()+ '\'' +
                ", tractiune='" + getTractiune() + '\'' +
                ", usi=" + getUsi() +
                ", locuri=" + getLocuri() +
                ", culoare='" + getCuloare() + '\'' +
                ", dotarile=" + getDotarile() +
                ", pret=" + getPret() +
                ", model='" + getModel() + '\'' +
                ", motorizare='" + getMotorizare()+ '\'' +
                '}';
    }
}
