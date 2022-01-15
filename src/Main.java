public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        for (int i = 0; i <= 3; i++) {
            System.out.println("Numer :"+" "+i);
            break;
        }
        for (int i = 0; i <= 3; i++) {
            System.out.println("Numer :"+" "+i);
            continue;
        }
        for (int i = 0; i <= 3; i++) {
            System.out.println("Numer :"+" "+i);
            return;
        }

    }
}