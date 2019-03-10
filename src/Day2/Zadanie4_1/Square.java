package Day2.Zadanie4_1;

import java.util.Objects;

public class Square extends Shape implements Resizable {
    protected double a;  // dlugosc boku
    protected Position position;
    protected int x;
    protected int y;

    public Square(double a, int x, int y) {
        this.a = a;
        this.position = new Position(x, y);
    }


    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.a, a) == 0 &&
                position.equals(square.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, position);
    }

    @Override
    public String toString() {
        return "\nSquare:\n" +
                "Area: " + getArea() +
                ", Perimeter: " + getPerimeter() +
                ", Position: " + getPosition();
    }

    @Override
    public void resize(Double s) {
        this.a = a + s;
    }

    @Override
    public void moveLeft(int l) {
        getPosition().setX(getPosition().getX() - l);
    }

    @Override
    public void moveRight(int t) {
        getPosition().setX(getPosition().getX() + t);

    }

    @Override
    public void moveUp(int u) {
        getPosition().setY(getPosition().getY() + u);

    }

    @Override
    public void moveDown(int d) {
        getPosition().setY(getPosition().getY() - d);
    }
}
