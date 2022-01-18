import osoba.Osoba;
import student.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)
            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */


        Student s1 = new Student("Adrian","Kwietniewski",20);
        Student s2 = new Student("Marek","Strozik",14,22);
        Student s3 = new Student("Karol","Slawski",17,21);
        Student s4 = new Student("Wiktor","Krum",11,19);
        Student s5 = new Student("Oliwier","Maskowski",15,23);
        List<Student> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);
        list1.add(s5);
        IntStream.range(0, 5).mapToObj(i -> list1.get(i).getInfo()).forEach(System.out::println);

        /*Student [] list = new Student[5];*/
       /* Arrays.stream(list).toList();
        System.out.println(Arrays.stream(list).toList());*/

    }
}

