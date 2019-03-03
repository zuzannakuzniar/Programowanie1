package Day1.Zadanie1;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę gwiazdek: ");
        int liczba = scanner.nextInt();
        char[] tablica = new char[liczba];

        for(int i=0;i<liczba;i++){
            tablica[i] = '*';
        }
        System.out.println(tablica);
    }
}
