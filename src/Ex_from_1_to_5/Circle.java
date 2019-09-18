package Ex_from_1_to_5;

public class Circle extends Shape {
    private double radius;
    public Circle(Point center, double radius) {
        super(center);
        this.radius=radius;
    }

    @Override
    public Point getCenter() {
        return this.point;
    }

    @Override
    protected Circle clone() {
        return new Circle(new Point(this.point.getX(),this.point.getY()),radius);
    }
}
