package Day3.ZadaniaTablice;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość ciągu: ");
        int n = scanner.nextInt();
        Long[] tablica = new Long[n];

        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(0+" "+1+" "+1);
        } else if (n == 0) {
            System.out.println(0);
        } else {
            for (int i = 3; i < tablica.length; i++) {
                tablica[0] = Long.valueOf(0);
                tablica[1] = Long.valueOf(1);
                tablica[2] = Long.valueOf(1);
                tablica[i] = tablica[i - 1] + tablica[i - 2];
            }
            for (Long a :
                    tablica) {
                System.out.print(" " + a);
            }
        }
    }
}
