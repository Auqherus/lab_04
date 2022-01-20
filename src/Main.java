

import kierownik.Kierownik;
import pracownik1.Pracownik1;
import student1.Student1;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody
        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody
        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów
        zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */

        List<Pracownik1> listaPracownikow = new ArrayList<>();


        Student1.Student s1 = new Student1.Student(24,175,14,"Niebieski","Adam");
        Student1.Student s2 = new Student1.Student(21,183,11,"Brazowy","Tomek");

        Pracownik1.Pracownik p1 = new Pracownik1.Pracownik(177,4456.56,"Szare",8,"Brygadzista");
        Pracownik1.Pracownik p2 = new Pracownik1.Pracownik(175,3456.6,"Zielone",5,"Technik");

        Pracownik1 k1 = new Kierownik(169,5675.23,9,"Piwne","Kierownik");
        Pracownik1 k2 = new Kierownik(177,6435.23,11,"Amalgatowe","Kierownik");

        listaPracownikow.add(p1);
        listaPracownikow.add(p2);
        listaPracownikow.add(k1);
        listaPracownikow.add(k2);

        for (int i = 0; i < 1; i++) {
            System.out.println(listaPracownikow);
        }

        /*listaPracownikow.add((Pracownik1.Pracownik)k1);
        listaPracownikow.add((Pracownik1.Pracownik)k2);*/


   /*     System.out.println(k1);
        System.out.println(k2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(p1);
        System.out.println(p2);*/

    }
}

