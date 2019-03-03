package Day1.Zadanie1;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok 1: ");
        int a = scanner.nextInt();

        System.out.println("Podaj bok 2: ");
        int b = scanner.nextInt();

        int pole = a*b;
        System.out.println("Pole prostokąta: "+pole);

        int obwod = 2*a+2*b;
        System.out.println("Obwód prostokąta: "+obwod);
    }
}
