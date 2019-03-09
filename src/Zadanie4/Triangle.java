package Zadanie4;

import java.util.Objects;

public class Triangle extends Shape implements Resizable {
    protected double a;
    protected double h;
    protected Position position;
    protected int x;
    protected int y;

    public Triangle(double a, double h, int x, int y) {
        this.a = a;
        this.h = h;
        this.position = new Position(x,y);
    }


    @Override
    public double getArea() {
        return (a*h)*1/2;
    }

    @Override
    public double getPerimeter() {
        return a*3;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "\nTriangle:\n" +
                "Area: " + getArea() +
                ", Perimeter: " + getPerimeter() +
                ", Position: " + getPosition();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 &&
                Double.compare(triangle.h, h) == 0 &&
                position.equals(triangle.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, h, position);
    }

    @Override
    public void resize(Double s) {
        this.a = a+s;
        this.h = h+s;

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
