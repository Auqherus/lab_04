package osoba;
import student.Student;
import wydzial.Wydzial;
public class Osoba  {

    private String imie;
    private String nazwisko;
    private Integer index;

    public Osoba (){

    }
    public Osoba(String imie, String nazwisko, Integer index){
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.index = index;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Integer getIndex() {
        return index;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public void getInfo(){
        System.out.println();
        System.out.println("Imie :"+" "+getImie());
        System.out.println("Nazwisko :"+" "+getNazwisko());
        System.out.println("Nr Indeksu :"+" "+getIndex());
        System.out.println("Wydzial:"+" "+Wydzial.wydzialEnum.Pierwszy);



    }
}
