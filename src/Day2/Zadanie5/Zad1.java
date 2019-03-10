package Day2.Zadanie5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zad1 {
    public List<Integer> square(List<Integer> list){
        List<Integer> squareOfList = new ArrayList<>();

        squareOfList = list.stream().map(number -> number*number).collect(Collectors.toList());
        return squareOfList;
    }

    public static void main(String[] args) {
        List<Integer> lista =Arrays.asList(2,3,4);
        Zad1 zad1 = new Zad1();
        zad1.square(lista).forEach(System.out::println);

    }

}
