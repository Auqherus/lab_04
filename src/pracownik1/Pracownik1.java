package pracownik1;

import czlowiek1.Czlowiek1;

public interface Pracownik1 extends Czlowiek1 {
     double wyplata(double salary);

     String lataPracy(String experience);

     String stanowisko(String position);


    class Pracownik implements Pracownik1 {
        private double height, salary, experience;
        private String eyeColor,position;

        public Pracownik() {

        }

        public Pracownik(double height, double salary, String eyeColor, double experience, String position) {
            this.height = height;
            this.salary = salary;
            this.eyeColor = eyeColor;
            this.experience = experience;
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

        public String getEyeColor() {
            return eyeColor;
        }

        public void setEyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
        }

        public double getExperience() {
            return experience;
        }

        public void setExperience(double experience) {
            this.experience = experience;
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
            return salary;
        }

        @Override
        public String lataPracy(String experience) {
            return experience;
        }

        @Override
        public String stanowisko(String position) {
            return position;
        }

        @Override
        public String toString() {
            return "Pracownik{" +
                    "Wzrost = " + getHeight() +
                    ", Wypłata = " + getSalary() +
                    ", Kolor oczu = '" + getEyeColor() + '\'' +
                    ", Doświadczenie = '" + getExperience()+" "+"lat" + '\'' +
                    ", Stanowisko =  '" + getPosition() + '\'' +
                    '}'+"\n";
        }
    }
}
