import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */


        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

         // zad 1 a) nr indeksu 60725

        /*for (int i = 100; i >= 0; i--) {if(i%5 == 0){System.out.println(i);}}*/

        //zad 2

        Scanner TryMe = new Scanner(System.in);
        System.out.println("PROGRAM TABLICA");
        System.out.println();

        int[] tab = new int [5];
        for (int i = 0; i <tab.length ; i++) {System.out.print("Podaj"+" "+i+" "+ "liczbe :" +" ");tab[i] = TryMe.nextInt();System.out.println();}
        System.out.println("Dane w tablicy :");
        for (int j : tab) {System.out.println(j);}

        System.out.println();
        //sortowanie
        System.out.println("Dane w tablicy po sortowaniu :");
        Arrays.sort(tab);
        for (int j : tab) {System.out.println(j);}
    }
}





