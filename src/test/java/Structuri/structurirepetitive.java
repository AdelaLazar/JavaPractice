package Structuri;

import org.junit.Test;

public class structurirepetitive {
    @Test
    public void testautomat(){


       printamnumerele();
       printamnumerelewhile();

    }
    // aici printam primele 200 de numere
    public void printamnumerele () {
        for (Integer index = 1; index <= 200; index++) {

            System.out.println(index);
        }


    }
    public void printamnumerelewhile (){
        Integer index = 1;
        while(index<=200) {
        System.out.println(index);
        index++;
        }
    }

}
 //cele mai intalnite structuri repetitive :for si while




