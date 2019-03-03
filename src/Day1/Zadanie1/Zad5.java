package Day1.Zadanie1;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int s = scanner.nextInt();
        int suma = 0;
        while (s > 0) {
            int cyfra = s % 10;
            s = s / 10;
            suma += cyfra;
        }
        System.out.println(suma);
    }
}
