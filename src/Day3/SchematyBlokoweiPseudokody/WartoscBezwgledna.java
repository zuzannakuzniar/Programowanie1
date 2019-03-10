package Day3.SchematyBlokoweiPseudokody;

import java.util.Scanner;

public class WartoscBezwgledna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int x = scanner.nextInt();
        int wynik;

        if (x >= 0) {
            wynik = x;
        } else {
            wynik = -1 * x;
        }

        System.out.println(wynik);
    }
}
