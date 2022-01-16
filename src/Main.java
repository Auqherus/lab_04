import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */


         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */



       /* List<String>list1 = new ArrayList<>();

        Scanner TryMe = new Scanner(System.in);
        System.out.print("Podaj wielkosc listy:"+" ");
        int c = TryMe.nextInt();
        for (int i = 0; i < c; i++) {
            System.out.print("Podaj nazwe"+" "+(i+1)+" "+"zwierzecia:"+" ");
            list1.add(TryMe.next());
        }

        System.out.println(list1);*/

        Metoda M1 = new Metoda();
        M1.getInf();



    /*    *//* Przyklad_6 Listy
           operują na typach objektowych *//*
                List<Integer> lista1 = new ArrayList<>();
                List<BigInteger> lista2 = new ArrayList<>();
                List<String> lista3 = new ArrayList<>();
                List<BigDecimal> lista4 = new ArrayList<>();
                List<Character> lista5 = new ArrayList<>(); // objektowy char
                List<Object> lista6 = new ArrayList<>();

                *//* przypisanie wartości *//*
                lista1.add(1);
                lista1.add(5);
                lista1.add(12);
                lista1.add(3);
                lista1.add(7);
                lista1.add(9);
                lista1.add(2);
                System.out.println(lista1 + ", wielkość listy - " + lista1.size()); // [1, 5, 12, 3, 7, 9, 2]

                *//* iterowanie za pomocą forEach i for *//*
                for (Integer x : lista1) {
                    System.out.print(x + ", ");
                }
                System.out.println();

                for (int i = lista1.size() - 1; i >= 0; i--) {
                    System.out.print(lista1.get(i) * 13 + ", ");
                }

                System.out.println("\n");

                *//* odczytanie wartości elementu *//*
                System.out.println("Pierwszy element: " + lista1.get(0) +
                        "\nDrugi element listy: " + lista1.get(1));

                *//* usówanie wartości, element o indeksie 2 został usunięty z listy *//*
                lista1.remove(2);
                System.out.println(lista1 + ", wielkość listy - " + lista1.size()); // [1, 5, 3, 7, 9, 2]

                *//* stworzenie listy z tablicy *//*
                Integer[] tablica1 = new Integer[]{1, 5, 6, 8, 90, 3};
                lista1 = Arrays.stream(tablica1).toList();
                System.out.println(lista1); // [1, 5, 6, 8, 90, 3]

                *//* dynamiczna inicjalizacja listy *//*
                lista1 = Arrays.asList(1, 4, 6, 9, 8, 3, 2);
                System.out.println(lista1); // [1, 4, 6, 9, 8, 3, 2]

                *//* Sortowanie *//*
                Collections.sort(lista1);
                System.out.println(lista1); // [1, 2, 3, 4, 6, 8, 9]

                *//* Sortowanie od końca *//*
                Collections.sort(lista1, Collections.reverseOrder());
                System.out.println(lista1); // [9, 8, 6, 4, 3, 2, 1]


                *//* Przykład tworzenia Set-a *//*
                Set<String> imiona = new TreeSet<>();
                imiona.add("Kasia");
                imiona.add("Ania");
                imiona.add("Ania");
                imiona.add("Wojtek");
                imiona.add("Zuza");
                imiona.add("Zuza");

                System.out.println("imiona: " + imiona); // [Ania, Kasia, Wojtek, Zuza]
                System.out.println(imiona.size()); // 4*/


            }

        }

class Metoda{
    List<String>list1 = new ArrayList<>();
    String a;
    public Metoda(){

    }

    public void getInf(){

        Scanner TryMe = new Scanner(System.in);
        /*System.out.print("Podaj wielkosc listy:"+" ");
        int c = TryMe.nextInt();*/
        for (int i = 0; i < 6; i++) {
            System.out.print("Podaj nazwe"+" "+(i+1)+" "+"zwierzecia:"+" ");
            list1.add(TryMe.next());

        }
        System.out.println();
        /*list1.remove(3);
        list1.remove(4);*/


        for (String zmienna:list1) {

            System.out.println("Nazwa"+" "+"zwierzecia:"+" "+zmienna);

        }

       /* list1.add("Koliber");
        list1.add("Rosomak");*/
        System.out.println();
        for (String zmienna:list1) {

            System.out.println("Nazwa"+" "+"zwierzecia:"+" "+zmienna);

        }
        System.out.println("Wielkosc listy :"+" "+list1.size());
        System.out.println();
        System.out.println("Lista po sortowaniu :");
        Collections.sort(list1,Collections.reverseOrder());
        System.out.println();
        for (String zmienna:list1) {

            System.out.println("Nazwa"+" "+"zwierzecia:"+" "+zmienna);

        }


    }
}
