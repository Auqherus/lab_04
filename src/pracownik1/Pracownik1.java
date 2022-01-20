package pracownik1;

import czlowiek1.Czlowiek1;

public interface Pracownik1 extends Czlowiek1 {
    public double wyplata(double salary);
    public String lataPracy(String experience);
    public String stanowisko(String position);

}
