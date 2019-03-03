package Day1.Zadanie1;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = scanner.nextInt();



        for(int i=0; i<11;i++){
            int wynik = liczba*i;
            System.out.println(liczba+"*"+i+": "+ wynik);
        }



        }
    }

