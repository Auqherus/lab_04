import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 21,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

        // zad1
    /*Metoda1 zad1 = new Metoda1();*/
    /*    System.out.print("Podaj wielkosc tablicy :" +" ");
        Metoda1(TryMe.nextInt());*/

        //zad 2
   /*     System.out.print("Podaj wielkosc tablicy :" +" ");
        Metoda2(TryMe.nextInt());*/

        //zad 3 a)
        System.out.print("Podaj imie:"+" ");
        Metoda3(TryMe.next());
    }
 /* *//*  static Scanner TryMe = new Scanner(System.in);
    int c = TryMe.nextInt();

    public static int [] Metoda1(int c){int [] tab = new int[c];for (int i = 0; i <tab.length ; i++) {tab[i] = i+21;System.out.println(tab[i]);}
        return tab;
    }*/
  /*static Scanner TryMe = new Scanner(System.in);
    static Scanner TryMe2 = new Scanner(System.in);

    int c = TryMe.nextInt();
    public static String[] Metoda2(int c) {
        String[] tab2 = new String[c];
        System.out.println("Podaj liste imion:" +" ");
        System.out.println();
        for (int i = 0; i < tab2.length; i++) {tab2[i] = TryMe2.next();}
        System.out.println();
        System.out.println("Lista imion:"+" ");
        System.out.println();
        for (int i = 0; i < tab2.length; i++) {System.out.println("Nr"+" "+(i+1)+" "+tab2[i]);}
        return tab2;
    }*/

    static Scanner  TryMe = new Scanner(System.in);

    public static void Metoda3(String imie){System.out.print("Imię to :"+" "+imie);}

}

/*
class Metoda1{
    public Metoda1(){
        int [] tab = new int[20];
        for (int i = 0; i <tab.length ; i++) {tab[i] = i+21;System.out.println(tab[i]);}
    }

}*/
