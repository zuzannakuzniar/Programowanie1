package Day2.Zadanie4_1;


import java.util.Objects;

public class Circle extends Shape implements Resizable {

    protected double r;
    protected Position position;
    protected int x;
    protected int y;

    public Circle(double r, int x, int y){
        this.r = r;
        this.position = new Position(x,y);
    }
    @Override
    public double getArea() {
        return Math.PI*r*r;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0 &&
                position.equals(circle.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, position);
    }

    @Override
    public String toString() {
        return "\nCircle:\n" +
                "Area: " + getArea() +
                ", Perimeter: " +getPerimeter() +
                ", Position: " +getPosition();
    }

    @Override
    public void resize(Double s) {
        this.r = r+s;
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
