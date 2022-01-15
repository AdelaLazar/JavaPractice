package VariabilaMetoda;

import org.junit.Test;

public class Cursant {

    //Am facut un comentariu
    //Clasa= un sablon de variabile si metode
    //Variabila = Atributul unei clase
    //Metoda = Actiunea unei clase
    //Tot timpul o clasa va avea langa nume cuvantul class
    //O clasa trebuie sa aiba un nume
    //O clasa trebuie sa fie publica => inseamna ca oricine poate sa vada clasa respectiva
    //Variabila = poate sa fie de 2 tipuri: variabila globala sau locala
    //Variabila globala= este vizibila peste tot in clasa noastra
    //Variabila globala structura= public tipVariabila NumeVariabila
    //Variabila locala = este vizibila doar in locul unde am scris
    //Variabila locala structura= TipVariabila NumeVariabila
    //O variabila poate sau nu sa primeasca o valoare
    //Ca sa dam o valoare la o variabila se face cu egal
    //Metodele sunt de 2 feluri:void si return
    //Metoda void structura = public void numemetoda(){}
    //Metoda return structura = public tipvariabila numemetoda(){} (adaug un get in fata)

    public String nume;
    public String prenume;
    public String adresa;
    public Integer adresaNumar;
    public Integer varsta;
    public Double kg;
    public Double experienta;

    @Test
    public void testautomat(){
        inscrierecurs();
        platestetaxa();
        calculeazasuma();
        System.out.println(getsalar());
        System.out.println(getadresa());
    }

    public void inscrierecurs(){
        nume="Maciucian";
        prenume="Daniela";
        adresa="strada Bucegi";
        adresaNumar=10;
        varsta=20;
        kg=54.5;
        experienta=1.5;

        //Afisam o valoare in consola
        //Print = printeaza si ramane cu cursorul pe linia curenta
        //Println = printeaza si dupa trece cu cursorul la linia urmatoare
        System.out.print(nume+" ");
        System.out.println(prenume);
        System.out.print(adresa+" "+adresaNumar);
        System.out.println(varsta);
        System.out.println(kg);
        System.out.println(experienta);

    }

    public void platestetaxa(){
        nume="Maciucian";
        prenume="Daniela";
        //Declaram si initializam o variabila locala
        Double taxa=2.500;

        System.out.println("cursantul cu numele:"+nume+" si prenumele:"+prenume+" a platit taxa de "+String.format("%.3f",taxa));

    }

    public void calculeazasuma(){
      //declaram 3 variabile care adunate sa fie 100
      Integer suma=0;
      Integer valoarea1=30;
      Integer valoarea2=30;
      Integer valoarea3=40;
      suma=valoarea1+valoarea2+valoarea3;
      System.out.println("suma celor 3 variabile este "+suma);

    }

    public Double getsalar(){
        Double salar=1.800;
        return salar;
    }

    public String getadresa(){
        String adresa="Aurel Vlaicu";
        return adresa;
    }
}
