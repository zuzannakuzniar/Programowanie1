package Day1.Zadanie1;

import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień");
        int r = scanner.nextInt();

        Zad2 zad = new Zad2();

        double pole = Math.PI * r * r;
        System.out.println("Pole koła o promieniu " + r + ": " + pole);

        double obwod = Math.PI * 2 * r;
        System.out.println("Obwód koła o promieniu " + r + ": " + obwod);

    }

}
