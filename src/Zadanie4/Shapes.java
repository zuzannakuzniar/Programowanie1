package Zadanie4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shapes {
    public static void main(String[] args) {
        Shape square = new Square(5, 2, 2);
        Shape triangle = new Triangle(6, 4, 1, 6);
        Shape circle = new Circle(4, 6, 8);
        Shape rectangle = new Rectangle(3, 4, 3, 9);

        List<Shape> movable = new ArrayList<>();
        movable.add(square);
        movable.add(triangle);
        movable.add(circle);
        movable.add(rectangle);

        for (Shape s : movable
        ) {
            s.resize(-1.0);
            s.moveRight(100);
            s.moveDown(100);
            System.out.println(s);
        }

        /*
        Obsłóż sytuacje wyjątkowe np. próbę zmiant rozmiaru powodującą, że figura miałaby pole ujemne.


         */
    }

}
