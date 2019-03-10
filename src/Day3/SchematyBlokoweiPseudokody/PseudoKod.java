package Day3.SchematyBlokoweiPseudokody;

import java.util.Scanner;

public class PseudoKod {
    public static void main(String[] args) {
        int suma=0;
        int i=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz zsumować: ");
        int n= scanner.nextInt();

        while(i<n){
            System.out.println("Podaj liczbę: ");
            int a = scanner.nextInt();
            suma+=a;
            i++;
        }

        System.out.println(suma);
    }

}
