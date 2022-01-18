import student.Student;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek> */


        // Wykonujac zadania z cw 4 zrobilem w sumie przy okazji cw 5, wiec je daje do grupy


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
        System.out.println("<<======================PO ZMIANIE STUDENTOW========================>>");
        s1.setImie("Tomek");s1.setNazwisko("Marowski");s1.setIndex(33);s1.setAge(24);
        s2.setImie("Kevin");s1.setNazwisko("Ackoski");s2.setIndex(4);s2.setAge(0);
        s3.setImie("Bartek");s1.setNazwisko("Rajtak");s3.setIndex(8);s3.setAge(19);
        s4.setImie("Filip");s1.setNazwisko("Wazowski");s4.setIndex(42);s4.setAge(18);
        s5.setImie("Eugieniusz");s1.setNazwisko("Cieskalowski");s5.setIndex(2);s5.setAge(32);
        IntStream.range(0, 5).mapToObj(i -> list1.get(i).getInfo()).forEach(System.out::println);

    }
}