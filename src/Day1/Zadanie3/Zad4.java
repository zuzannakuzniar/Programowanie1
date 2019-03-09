package Day1.Zadanie3;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst");
        String tekst = scanner.nextLine();
        String bezSpacji = tekst.replace(" ","");

        char[] tablica = bezSpacji.toCharArray();
        char[] tablica2 = new char[tablica.length];

        for(int i=tablica.length-1;i>=0;i--){
            for(int j=0;j<tablica2.length;j++){
                tablica2[j]=tablica[i];
            }
        }
        System.out.println(tablica2);

        System.out.println();

        for(int i=0; i<tablica2.length;i++) {
            if (tablica[i]==tablica2[i]){
                System.out.println("To jest palindrom.");
            }
            }
        }

}
