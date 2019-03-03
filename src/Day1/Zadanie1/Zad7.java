package Day1.Zadanie1;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok 1: ");
        int a = scanner.nextInt();

        System.out.println("Podaj bok 2: ");
        int b = scanner.nextInt();
        char[][] tablica = new char[a][b];

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){

                tablica[i][j] = '*';
            }
        }
        for (char[]c:tablica
             ) {
            System.out.println(c);

        }
    }
}
