import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
         * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */

        Colors kolor1 = new Colors();



        Scanner TryMe = new Scanner(System.in);
        while(true){
            int c = TryMe.nextInt();
            switch (c) {
                case (1) -> {
                    System.out.println(Colors.LiczbyEnum.Jeden);
                    System.out.println(Colors.StatusEnum.Kontynuujemy);
                    continue;
                }
                case (2) -> {
                    System.out.println(Colors.LiczbyEnum.Dwa);
                    System.out.println(Colors.StatusEnum.Kontynuujemy);
                    continue;
                }
                case (3) -> {
                    System.out.println(Colors.LiczbyEnum.Trzy);
                    System.out.println(Colors.StatusEnum.Kontynuujemy);
                    continue;
                }
                case (4) -> {
                    System.out.println(Colors.LiczbyEnum.Cztery);
                    System.out.println(Colors.StatusEnum.Kontynuujemy);
                    continue;
                }
                case (5) -> {
                    System.out.println(Colors.LiczbyEnum.Piec);
                    System.out.println(Colors.StatusEnum.Kontynuujemy);
                    continue;
                }
                case (6) -> {
                    System.out.println(Colors.LiczbyEnum.Szesc);
                    System.out.println(Colors.StatusEnum.Kontynuujemy);
                    continue;
                }
                default -> System.out.println(Colors.StatusEnum.Liczba_spoza_zakresu);
            }

            if(c == 0){System.out.println(Colors.StatusEnum.Koniec_programu);break;}
        }


    }
}

class Colors {
    // zad 1 a)
    enum LiczbyEnum {
        Jeden, Dwa, Trzy, Cztery, Piec, Szesc
    }
    //zad 1 b)
    enum StatusEnum {
        Kontynuujemy, Koniec_programu, Liczba_spoza_zakresu
    }

}
