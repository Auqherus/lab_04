import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */

        //zad 1
        /*Scanner TryMe = new Scanner(System.in);
        System.out.print("Podaj liczbe: " + " "); int a = TryMe.nextInt();
        switch (a % 2) {case 0 -> System.out.println("Liczba parzysta!");case 1 -> System.out.println("Nieparzysta!");}*/

        //zad 2
        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int[] tablica = {0, 0, 0 ,0 ,0 ,0 ,0 ,0 ,0 ,0};
        /* toCharArray() - metoda zamienia String na tablicę char[] */
        for (char zmiennaChar : text.toCharArray()) {
            switch (zmiennaChar) {
                case 'o':
                    ++tablica[0];
                    break;
                case 'p':
                    ++tablica[1];
                    break;
                case 'x':
                    ++tablica[2];
                    break;
                case 'z':
                    ++tablica[3];
                    break;
                case 'q':
                    ++tablica[4];
                    break;
                case 'n':
                    ++tablica[5];
                    break;
                case 'm':
                    ++tablica[6];
                    break;
                case 'i':
                    ++tablica[7];
                    break;
                case 't':
                    ++tablica[8];
                    break;
                case 'j':
                    ++tablica[9];
                    break;
            }
        }
        System.out.printf("\nLiczba występuje\no: %d - razy\nz: %d - razy\nj: %d - razy,\nx: %d - razy\nt: %d - razy\nn: %d - razy," +
                        "\nm: %d - razy\ni: %d - razy\np: %d - razy\nq: %d - razy",
                tablica[0], tablica[1], tablica[2],tablica[3], tablica[4], tablica[5],tablica[6], tablica[7], tablica[8],tablica[9]);

    }
}
