package Ex_from_1_to_5;

public abstract class Shape {
    Point point;

    Shape(Point p) {
        this.point=p;
    }

    public void moveBy(double dx, double dy) {
        this.point=new Point(point.getX()+dx,point.getY()+dy);
    }

    public abstract Point getCenter();

    public Point getPos() {
        return point;
    }
}
