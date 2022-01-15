package POLIMORFISM;

public class Animal {



        //Polimorfism= conceptul prin care o metoda poate avea implementari diferite.
        //Doua feluri: Dinamic (override) si static(overloade).
        //Polimorfismul dinamic= intr o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite.
        //Polimorfismul static= conceptul pe baza caruia o metoda are o structura diferita.


        public String rasa;
        public String talie;
        public String culoare;

        public Animal(String rasa, String talie, String culoare) {
            this.rasa = rasa;
            this.talie = talie;
            this.culoare = culoare;


        }

        //Polimorfism dinamic.

        public void scoateSunet(){
            System.out.println("Animalul scoate sunet");

        }





    }


