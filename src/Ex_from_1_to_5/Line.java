package Ex_from_1_to_5;

public class Line extends Shape {
    private Point point2;

    public Line(Point from, Point to) {
        super(from);
        this.point2=to;
    }

    public Point getPoint2() {
        return point2;
    }

    @Override
    public Point getCenter() {
        return new Point((point2.getX()+point.getX())/2,(point2.getY()+point.getY())/2);
    }

    @Override
    public void moveBy(double dx,double dy) {
        super.moveBy(dx,dy);
        this.point2=new Point(this.point2.getX()+dx,this.point2.getY()+dy);
    }

    @Override
    protected Line clone() {
        return new Line(new Point(this.point.getX(),this.point.getY()),new Point(this.point2.getX(),this.point2.getY()));
    }
}
