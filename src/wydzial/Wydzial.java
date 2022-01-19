package wydzial;

import osoba.Osoba;

public class Wydzial extends Osoba {



    public enum wydzialEnum{
        Pierwszy, Drugi, Trzeci
    }


    @Override
    public String getInfo() {
        System.out.println("Imie :"+" "+getImie());
        System.out.println("Nazwisko :"+" "+getNazwisko());
        System.out.println("Nr Indeksu :"+" "+getIndex());
        System.out.println("Wydzial:"+" "+ Wydzial.wydzialEnum.Pierwszy);

        return "******************************************";
    }

}
