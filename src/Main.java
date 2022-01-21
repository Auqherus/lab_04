import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

        Scanner TryMe = new Scanner(System.in);
        while(true){
            System.out.println("======================");
            System.out.println("Wybierz dzialanie :");
            System.out.println("1. Kwadrat");
            System.out.println("2. Prostokat");
            System.out.println("3. '3', by zakonczyc");
            System.out.println("======================");
            int i = TryMe.nextInt();
            if(i == 3){
                System.out.println("KONIEC PROGRAMU");
                break;
            }
            else
            if(i == 1){                           //wybrano kwadrat
                System.out.println("Wybrano KWADRAT!");
                System.out.println("Co chcesz obliczyc?");
                System.out.println("1. Obwod");
                System.out.println("2. Pole");
                int j = TryMe.nextInt();
                if(j == 1) {
                    System.out.println("Wybrano Obwod!");
                    System.out.print("Podaj dlugosc boku A:");
                    Kwadrat k1 = new Kwadrat("Kwadrat", TryMe.nextDouble());
                    System.out.println(k1.obwod());
                }
                    if(j == 2){
                        System.out.println("Wybrano Pole!");
                        System.out.print("Podaj dlugosc boku A:");
                        Kwadrat k2 = new Kwadrat("Kwadrat", TryMe.nextDouble());
                        System.out.println(k2.pole());

                    }

            }
            if(i == 2){                           //wybrano prostokat
                System.out.println("Wybrano PROSTOKAT!");
                System.out.println("Co chcesz obliczyc?");
                System.out.println("1. Obwod");
                System.out.println("2. Pole");
                int j = TryMe.nextInt();
                if(j == 1) {
                    System.out.println("Wybrano Obwod!");
                    System.out.print("Podaj dlugosc boku A:");
                    double A = TryMe.nextDouble();
                    System.out.print("Podaj dlugosc boku B:");
                    double B = TryMe.nextDouble();
                    Prostokat p1 = new Prostokat("Prostokat",A,B);
                    System.out.println(p1.obwod());
                }
                    if(j == 2){
                        System.out.println("Wybrano Pole!");
                        System.out.print("Podaj dlugosc boku A:");
                        double A = TryMe.nextDouble();
                        System.out.print("Podaj dlugosc boku B:");
                        double B = TryMe.nextDouble();
                        Prostokat p1 = new Prostokat("Prostokat",A,B);
                        System.out.println(p1.pole());

                    }

            }
        }

    }
}

abstract class Figura{

    String figura;
    double a,b;

    public Figura(){

    }

    public Figura(String figura, double a){ //dla kwadratu
        this.figura = figura;
        this.a = a;
    }
    public Figura(String figura, double a, double b){ //dla prostokata
        this.figura = figura;
        this.a = a;
        this.b = b;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public abstract String pole();
    public abstract String obwod();

    public String nazwaFigury(String figura){
        return "To jest figura : "+ figura;
    }

}

class Kwadrat extends Figura {

    public Kwadrat() {
    }

    public Kwadrat(String figura, double a) {
        super(figura, a);
    }

    @Override
    public String pole() {
        return "Obwod kwadratu wynosi : "+getA()*getA();
    }

    @Override
    public String obwod() {
        return "Obwod kwadratu wynosi : "+4*getA();
    }
}

class Prostokat extends Figura{

    public Prostokat() {
    }

    public Prostokat(String figura, double a, double b) {
        super(figura, a, b);
    }

    @Override
    public String pole() {
        return "Pole prostokatu wynosi : "+getA()*getB();
    }

    @Override
    public String obwod() {
        return "Obwod prostokatu wynosi : "+2*(getA()+getB());
    }
}