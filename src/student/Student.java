package student;
import osoba.Osoba;

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

    @Override
    public boolean getInfo() {
        super.getInfo();
        if(getAge() == 0){
            return false;
        }
        System.out.println("Wiek :"+" "+getAge());

        return true;
    }
}