package Day1.Zadanie3;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst");
        String tekst = scanner.nextLine();

        char[] tablica = tekst.toCharArray();
        int licznikDuzych=0;
        int licznikMalych=0;
        int licznikCyfr=0;
        int licznikSpacji=0;
        int licznikSpecjalnych=0;

        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] >64 && tablica[i]<91){
                licznikDuzych++;
            }
            if (tablica[i] >96 && tablica[i]<123){
                licznikMalych++;
            }
            if (tablica[i] >47 && tablica[i]<58){
                licznikCyfr++;
            }
            if (tablica[i] ==32){
                licznikSpacji++;
            }
            if (tablica[i] >32 && tablica[i]<48 || tablica[i]>57 && tablica[i]<65){
                licznikSpecjalnych++;
            }
        } System.out.println("Duże: "+licznikDuzych+"| Małe: "+licznikMalych+ "| Cyfry: "
                +licznikCyfr +"| Spacje: "+licznikSpacji+"| Specjalne: "+licznikSpecjalnych);
    }
}