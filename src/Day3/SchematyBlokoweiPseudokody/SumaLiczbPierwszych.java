package Day3.SchematyBlokoweiPseudokody;

import java.util.Scanner;

public class SumaLiczbPierwszych {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb pierwszych chesz obliczyć?");
        int n = scanner.nextInt();

        int i = 0;
        int licznik = 0;
        int suma = 0;

        SumaLiczbPierwszych wynik = new SumaLiczbPierwszych();

        do {
            boolean p = wynik.isPrime(i);
            if (p==true) {
                suma = suma + i;
                System.out.println(i);
                licznik++;
            }
            i++;


        } while (licznik != n);

        System.out.println("Suma "+n+" pierwszych liczb pierwszych wynosi: "+suma);
    }


    static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }

        boolean flag = false;
        for (int i = 2; i <= num/2; ++i) { // num/2 ponieważ żadna liczba nie jest podzielna przez więcej niż połowę swojej wartości
            if (num % i == 0) { // warunek na stwierdzenie, że liczba NIE JEST pierwszą
                flag = true;
                break; // nie ma sensu sprawdzać dalej
            }
        }

        if (flag) { // podniesiona flaga oznacza, że liczba ma więcej dzielników niż dwa
            return false; // a zatem nie jest liczbą pierwsza wiec zwracam false
        }
        return true;
    }
}
