import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */



        // zad 3 b)
        String tab [] = new String [5];

        tab[0] = "Tadeusz";
        tab[1] = "Adrian";
        tab[2] = "Ignacy";
        tab[3] = "Juliusz";
        tab[4] = "Werter";
        Arrays.sort(tab);
        int i = 4;
        while(false)
        { System.out.println(tab[i]);i--;} // dzialanie zawsze nieprawdziwe


    }
}
