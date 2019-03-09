package Day1.Zadanie3;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {

        char[] tablica1 = new char[3];
        int licznik =1;

        for (int i=1;i<=4;i++){

            for(int j=1; j<+4;j++) {

                for(int k=1;k<=4;k++){

                    if(i!=j && j!=k && i!=k){
                        licznik ++;
                        System.out.println(licznik+": "+i + ""+j+"" +k);

                    }
                }
            }
        }

    }
}
