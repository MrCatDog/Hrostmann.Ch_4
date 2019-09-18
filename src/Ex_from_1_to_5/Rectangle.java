package Ex_from_1_to_5;

public class Rectangle extends Shape {
    private double height, width;

    public Rectangle(Point topLeft, double height, double width) {
        super(topLeft);
        this.height=height;
        this.width=width;
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX()+width/2, point.getY()+height/2);
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(new Point(this.point.getX(),this.point.getY()),this.height,this.width);
    }
}
