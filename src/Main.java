public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom

        */

        Budynek.Dom dom1 = new Budynek.Dom(125.3,"Dolne Migowo 23B",11,2,3);
        Budynek.Dom dom2 = new Budynek.Dom(225.3,"Gorskie Sniegi 12 C",22,4,1);
        System.out.println("DOM 1");
        System.out.println(dom1); // zrozumialem, po co bylo toString(); w poprzednich cwiczeniach ;)
        dom1.setPow(132.4);
        dom1.setAdres("Gdanska 15G");
        dom1.setValue(14);
        dom1.setAntenaSAT(1);
        dom1.setAntenaLTE(3);
        System.out.println();
        System.out.println("Po zmianach:");
        System.out.println(dom1); // po zmianach
        System.out.println("DOM 2");
        System.out.println(dom2);
        dom2.setPow(252.4);
        dom2.setAdres("Warszawska  73/2G");
        dom2.setValue(18);
        dom2.setAntenaSAT(5);
        dom2.setAntenaLTE(2);
        System.out.println();
        System.out.println("Po zmianach:");
        System.out.println(dom2);

    }
}

interface Budynek {

    double powierzchniaBudynku(double pow);
    String adresBudynku(String adres);
    int liczbaOkien(int value);
    void liczbaMieszkancow(int value);
    void kolorDomu(KolorEnum kolor);
    void antenyBudynku(int antenaSAT, int antenaLTE); // wlasna metoda z dwoma parametrami

    enum KolorEnum{
        Niebieski, Czerwony, Czarny, Zielony
    }

    class Dom implements Budynek {
    private double pow;
    private String adres;
    private int value, antenaSAT,antenaLTE;

        public Dom(){

        }
        public Dom(double pow, String adres, int value, int antenaSAT, int antenaLTE){
            this.pow = pow;
            this.adres = adres;
            this.value = value;
            this.antenaSAT = antenaSAT;
            this.antenaLTE = antenaLTE;

        }

        public String getAdres(){
            return adres;
        }

        public double getPow() {
            return pow;
        }

        public int getValue() {
            return value;
        }

        public int getAntenaSAT() {
            return antenaSAT;
        }

        public int getAntenaLTE() {
            return antenaLTE;
        }

        public void setPow(double pow) {
            this.pow = pow;
        }

        public void setAdres(String adres) {
            this.adres = adres;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setAntenaSAT(int antenaSAT) {
            this.antenaSAT = antenaSAT;
        }

        public void setAntenaLTE(int antenaLTE) {
            this.antenaLTE = antenaLTE;
        }

        @Override
        public double powierzchniaBudynku(double pow) {
            return getPow();
        }

        @Override
        public String adresBudynku(String adres) {
            return getAdres();
        }

        @Override
        public int liczbaOkien(int value) {
            return getValue();
        }

        @Override
        public void liczbaMieszkancow(int value) {
            System.out.println("Liczba mieszkancow :"+" "+getValue());
        }

        @Override
        public void kolorDomu(KolorEnum kolor) {
            System.out.println("Kolor budynku :"+" "+kolor);
        }

        @Override
        public void antenyBudynku(int antenaSAT, int antenaLTE) {
            System.out.println("Liczba anten :"+" "+"SATELITARNE:"+" "+getAntenaSAT()+" "+"LTE:"+" "+getAntenaLTE());
        }

        @Override
        public String toString() {
            return  "\n"+"Adres:"+" "+getAdres()+" "+"\n"
                    +"Powierzchnia:"+" "+getPow()+"m^2"+"\n"+"Liczba okien:"+" "+getValue()+"\n"
                    +"Liczba anten Satelitarnych:"+" "+getAntenaSAT()+"\n"+"Liczba anten LTE:"+" "+getAntenaLTE()+"\n";
        }
    }


}