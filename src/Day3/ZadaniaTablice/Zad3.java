package Day3.ZadaniaTablice;

public class Zad3 {

    public int[] zwraca(int[] tab1, int[] tab2, int n){
        int[] zwrotna = new int[n];
        for(int i=0;i<tab1.length;i++){
            zwrotna[i]=tab1[i]+tab2[i];
        }
        return zwrotna;
    }
    public int dlugosc(int[]tab1,int[]tab2){
        if(tab1.length>tab2.length){
            return tab2.length;
        } else {return tab1.length;}
    }

    public static void main(String[] args) {
        Zad3 zad3 = new Zad3();
        int[] tab1 = new int[]{1,3,6,8,5};
        int[] tab2 = new int[]{3,4,9,1,0,2,1};
        int n = zad3.dlugosc(tab1,tab2);
        int[]zwrotna = zad3.zwraca(tab1,tab2,n);
        for (int a :zwrotna
             ) {

        System.out.print(" "+a);
        }



    }
}
