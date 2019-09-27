package Ex_from_1_to_5;

import java.util.Objects;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        return "X: "+this.x+" Y: "+y;
    }

    @Override
    public final boolean equals(Object anotherObj) {
        if(this == anotherObj) return true;
        if(anotherObj == null) return false;
        if(!(anotherObj instanceof Point)) return false;
        Point another = (Point) anotherObj;
        Double x = this.x;//packing
        Double y = this.y;
        return x.equals(another.getX()) && y.equals(another.getY());
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.x,this.y);
    }
}
