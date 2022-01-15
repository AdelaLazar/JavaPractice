
package multimi;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    @ Test
    public void testautomat(){

        multiminumereArray();
        multimiprenumeArray();
        multimiprenumelist();
        multimivaloriHashMap();
        multimitariorase();

    }

    public void multiminumereArray(){
        Integer[] numere= new Integer[3];
        numere[0]= 5;
        numere[1]= 6;
        numere[2]= 7;

        for (Integer index= 0; index< numere.length;index++){
            System.out.println(numere[index]);
        }
    }

    public void multimiprenumeArray() {
        String[] prenume = new String[3];
        prenume[0] = "florin";
        prenume[1] = "victor";
        prenume[2] = "ioan";

        for (Integer index = 0; index < prenume.length; index++){
            System.out.println(prenume[index]);
        }
    }

    public void multimiprenumelist(){
        List<String>prenume= new ArrayList<>();
        prenume.add("florin");
        prenume.add("victor");
        prenume.add("ioan");


        for (Integer index= 0; index < prenume.size();index++){
            System.out.println(prenume.get(index));
        }
    }

    public void multimivaloriHashMap(){

        // HashMap functioneaza dupa regula key = value;
        HashMap<String,String> obiectediferite = new HashMap<>();
        obiectediferite.put("fruct","mar");
        obiectediferite.put("legume","morcov");
        obiectediferite.put("haine","bluza");

        for (String key : obiectediferite.keySet()) {
            System.out.println("cheia este" + "key");
            System.out.println("valoarea este" + obiectediferite.get(key));
            System. out.println("prima valoare este");
        }

        Object firstKey = obiectediferite.keySet().toArray()[0];
        Object valueForFirstKey = obiectediferite.get(firstKey);
        System.out.println("prima cheie este" + firstKey.toString());
        System.out.println("prima valoare este" + valueForFirstKey.toString());
    }

    public void multimitariorase(){

        List<String>oraseromania=new ArrayList<>();
        oraseromania.add("Cluj");
        oraseromania.add("Bucuresti");
        oraseromania.add("Iasi");
        List<String> orasespania=new ArrayList<>();
        orasespania.add("Barcelona");
        orasespania.add("Madrid");
        orasespania.add("Valencia");
        orasespania.add("Bilbao");
        HashMap<String,List<String>> tariorase = new HashMap<>();
        tariorase.put("Romania", oraseromania);
        tariorase.put("Spania", orasespania);
        for (String key : tariorase.keySet()) {
            System.out.println("Tara este" + key);
            System.out.println("oraselesunt" + tariorase.get(key));
        }
    }
 }



