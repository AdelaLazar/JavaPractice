package Protected;

public class Copil {

    //Public= vizibil peste tot in proiect.
    //Privat= vizibil doar in clasa in care l ai declarat.
    //Protected vizibil in clasa Parinte+ clasa Copil indiferent daca se afla sau nu in acelasi pachet.
    //Default vizibil in clasa Parinte+Copil cu conditia sa fie in acelasi pachet.
    //Protected = daca declaram un obiect este vizibil in orice clasa din pachet.
    //Default= daca declaram un obiect este vizibil in orice clasa din pachet.



    public void metodaPublica(){
        System.out.println("Public");
    }

    public void metodaPrivata(){
        System.out.println("Private");
    }

    public void metodaProtected(){
        System.out.println("Protected");
    }

    public void metodaDefault(){
        System.out.println("Default");
    }

}
