package student1;

import czlowiek1.Czlowiek1;

public interface Student1 extends Czlowiek1 {

    void nrIndeksu(int indexNr);
    void imie(String name);
    void wiek(int age);


class Student implements Student1{
    private int age;
    private double height,indexNr;
    private String eyeColor,name;

    public Student(){

    }
    public Student(int age,double height, double indexNr, String eyeColor, String name) {
        this.age = age;
        this.height = height;
        this.indexNr = indexNr;
        this.eyeColor = eyeColor;
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getIndexNr() {
        return indexNr;
    }

    public void setIndexNr(double indexNr) {
        this.indexNr = indexNr;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void wzrost(double height) {
    }

    @Override
    public void kolorOczu(String eyeColor) {
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

    @Override
    public String toString() {
        return "Student{" +
                "Wiek = " + getAge() +
                ", Wzrost = " + getHeight() +
                ", Numer indeksu = " + getIndexNr() +
                ", Kolor oczu = '" + getEyeColor() + '\'' +
                ", Imie = '" + getName() + '\'' +
                '}'+"\n";
    }
}
}

