package Day1.Zadanie3;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst");
        String tekst = scanner.nextLine();

        char[] tablica = tekst.toCharArray();
        for(int i=tablica.length-1;i>=0;i--){
            System.out.print(tablica[i]);
        }


    }
}
