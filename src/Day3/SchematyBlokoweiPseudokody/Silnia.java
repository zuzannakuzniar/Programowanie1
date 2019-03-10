package Day3.SchematyBlokoweiPseudokody;

import java.util.Scanner;

public class Silnia {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int n = scanner.nextInt();
        int suma = 1;

        if(n>0){
            for(int i=1;i<=n;i++){
                suma = suma*i;
            }
        } else { suma =1;}

        System.out.println(suma);
    }
}
