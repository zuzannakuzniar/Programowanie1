package Day3.SchematyBlokoweiPseudokody;

import java.util.Scanner;

public class Suma2Liczb {
    public static void main(String[] args) {

        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a");
        int a = scanner.nextInt();
        System.out.println("Podaj b");
        int b = scanner.nextInt();
        suma = b + a;

        System.out.println(suma);
    }
}
