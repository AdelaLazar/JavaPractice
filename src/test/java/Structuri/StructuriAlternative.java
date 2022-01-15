package Structuri;

import org.junit.Test;

public class StructuriAlternative {

    //Doua tipuri de structuri= structuri alternative si repetitive.
    //Structura alternativa= if conditie then
    //                                   else
    // Nu este neaparat nevoie sa facem un else la if
    // Putem avea oricate if este nevoie

    @Test
    public void testautomat(){
      verificanumere();
      verificanume("Alexandru","Gheorghe" );
      verificanume("Alexandru","Gheorghe");
      verificanumerecomplex(10,12);
      verificanumerecomplex(10,10);
      verificanumerecomplex(2,1);

    }

    //Verificam daca 5 este mai mare ca 3 5>3
    public void verificanumere(){
        if (5<3){
            System.out.println(" 5 este mai mare ca 3");
        }
        else{
            System.out.println ("5 nu este mai mic ca 3");
        }
    }

    //Verificam daca Alexandru contine Alex
    public void verificanume(String nume,String comparatie){

        if(nume.contains(comparatie)){
            System.out.println("Alexandru contine Alex");
        }
        else{
            System.out.println("Numele Alexandru nu contine cealalta valoare "+ comparatie);
        }

    }

    //Verificam daca un numar este mai mare ca altul cu mai multe cazuri

    public void verificanumerecomplex(Integer nr1,Integer nr2){
        if (nr1>nr2){
            System.out.println(nr1+" este mai mare ca "+nr2);
        }
        if (nr1<nr2){
            System.out.println(nr1+" este mai mic ca "+nr2);
        }
        if (nr1==nr2){
            System.out.println(nr1+" este egal cu "+nr2);
        }
        if (nr1!=nr2){
            System.out.println(nr1+" este diferit de "+nr2);
        }
    }
}
