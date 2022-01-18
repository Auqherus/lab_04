
import student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Student [] diary = new Student[3];
        Student s1 = new Student("Endriu","John",21,true);
        Student s2 = new Student("Arek","Wess",22,false);
        Student s3 = new Student("Marcin","Kostowski",23,true);

        diary[0] = s1;
        diary[1] = s2;
        diary[2] = s3;

        /*for (int i = 0; i <diary.length; i++) {
            System.out.println(diary[i].getInfo());
        }*/
        for (Student spr: diary) {

            System.out.println(spr.getInfo());
        }

     /*
        s1.getInfo();
        s2.getInfo();
        s3.getInfo();*/

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
    }
}
class Tab {

    public Tab(){

    }


}