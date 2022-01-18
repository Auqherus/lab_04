package student;

public class Student {
    private final int  a;
    private final String name,surname;
    private final boolean question;
    public Student(String name,String surname, int a, boolean question){
        this.name = name;
        this.surname = surname;
        this.a = a;
        this.question = question;
    }

    public int getAge() {
        return a;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isQuestion() {
        return question;
    }

    public void getInfo(){
        System.out.println("Imie :"+" "+getName());
        System.out.println("Nazwisko :"+" "+getSurname());
        System.out.println("Wiek :"+" "+getAge());
        System.out.println("Zaliczenie :"+" "+isQuestion());
        System.out.println();

    }
}
