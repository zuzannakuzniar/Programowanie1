package Day3.ZadaniaTablice;

import java.util.Random;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość tablicy: ");
        int n = scanner.nextInt();
        int[] tablica = new int[n];
        System.out.println("Przedział liczb do:");
        int l=scanner.nextInt();
        Random random = new Random();


        for(int i=0;i<tablica.length;i++){
            tablica[i]= random.nextInt(l);
        }

        for (int a :
                tablica) {
            System.out.print(" "+a);
        }
    }
}
