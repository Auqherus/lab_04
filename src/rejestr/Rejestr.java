package rejestr;

import czlowiek1.Czlowiek1;
import pracownik1.Pracownik1;
import student1.Student1;

public class Rejestr implements Student1, Pracownik1, Czlowiek1 {
    @Override
    public void wzrost(double height) {

    }

    @Override
    public void kolorOczu(String eyeColor) {

    }

    @Override
    public double wyplata(double salary) {
        return 0;
    }

    @Override
    public String lataPracy(String experience) {
        return null;
    }

    @Override
    public String stanowisko(String position) {
        return null;
    }

    @Override
    public void nrIndeksu(int indexNr) {

    }

    @Override
    public void imie(String name) {

    }

    @Override
    public void wiek(int age) {

    }
}
