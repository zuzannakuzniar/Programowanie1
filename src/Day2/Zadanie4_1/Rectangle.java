package Day2.Zadanie4_1;

import java.util.Objects;

public class Rectangle extends Shape implements Resizable {
    protected double a;
    protected double b;
    protected Position position;
    protected int x;
    protected int y;

    public Rectangle(double a, double b, int x, int y){
        this.a = a;
        this.b = b;
        this.position = new Position(x,y);
    }


    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*a+2*b;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "\nRectangle:\n" +
                "Area: " + getArea() +
                ", Perimeter: " + getPerimeter() +
                ", Position: " + getPosition();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.a, a) == 0 &&
                Double.compare(rectangle.b, b) == 0 &&
                position.equals(rectangle.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, position);
    }

    @Override
    public void resize(Double s) {
        this.a = a+s;
        this.b = b+s;
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
