package Day2.Zadanie5;

import java.util.HashMap;
import java.util.Map;

public class Zad3 {
    public Map<Character,Integer> chain(String wyraz) {
        char[] tablica = wyraz.toCharArray();
        Map<Character, Integer> mapa = new HashMap<>();
        for (char a : tablica
        ) {
            if (!mapa.containsKey(a)) {
                mapa.put(a, 1);
            } else {
                mapa.put(a,mapa.get(a)+1);
            }
        }
        return mapa;
    }

    public static void main(String[] args) {
        String wyraz = "zuzia";
        Map<Character,Integer> mapa;
        Zad3 zad3 = new Zad3();
        mapa = zad3.chain(wyraz);

        mapa.entrySet().forEach(System.out::println);


    }
}
