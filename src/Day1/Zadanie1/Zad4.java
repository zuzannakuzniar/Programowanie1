package Day1.Zadanie1;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość boku: ");
        int s = scanner.nextInt();

        double pole = (6 * s^2)/(4*Math.tan(Math.PI/6));
        System.out.println("Pole sześciokąta wynosi: "+pole);

    }
}

