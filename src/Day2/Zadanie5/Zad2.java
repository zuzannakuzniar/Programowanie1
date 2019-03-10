package Day2.Zadanie5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zad2 {

    public List<String> addSufix(List<String> list){
        List<String> endList = new ArrayList<>();

        endList = list.stream().map(wyraz->wyraz+"*").collect(Collectors.toList());
        return endList;
    }

    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Ala","Kot");
        Zad2 zad2 = new Zad2();
        zad2.addSufix(lista).forEach(System.out::println);
    }
}
