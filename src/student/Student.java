package student;
import osoba.Osoba;
import wydzial.Wydzial;

public class Student extends Osoba {

    private int age;

    public Student(String imie,String nazwisko, Integer index){
        super(imie, nazwisko, index);
    }

    public Student(String imie,String nazwisko, Integer index, int age){

    super(imie, nazwisko, index);
    this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getInfo() {
        System.out.println("Imie :"+" "+getImie());
        System.out.println("Nazwisko :"+" "+getNazwisko());
        System.out.println("Nr Indeksu :"+" "+getIndex());
        System.out.println("Wydzial:"+" "+ Wydzial.wydzialEnum.Pierwszy);

        if(getAge() == 0){
            return "******************************************";
        }
        System.out.println("Wiek :"+" "+getAge());


        return "******************************************";
    }
}