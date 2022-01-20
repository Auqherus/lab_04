package kierownik;

import pracownik1.Pracownik1;

public class Kierownik implements Pracownik1 {

    private double height, salary, experience;
    private String eyeColor,position;

    public Kierownik(double height, double salary, double experience, String eyeColor, String position) {
        this.height = height;
        this.salary = salary;
        this.experience = experience;
        this.eyeColor = eyeColor;
        this.position = position;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getExperience() {

        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

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
    public String toString() {
            return "Pracownik{" +
                    "Wzrost = " + getHeight() +
                    ", Wypłata = " + getSalary() +
                    ", Kolor oczu = '" + getEyeColor() + '\'' +
                    ", Doświadczenie = '" + getExperience()+" "+"lat"+ '\'' +
                    ", Stanowisko =  '" + getPosition() + '\'' +
                    '}'+"\n";
        }
}

