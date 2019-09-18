import Ex_from_1_to_5.*;

public class Chapter_4 {
    public static void main(String[] args) {
        System.out.println("\nEx. 1-3:");
        Ex_1_3();
        System.out.println("\nEx. 4-5:");
        Ex_4_5();
    }

    private static void Ex_1_3() {
        LabeledPoint first = new LabeledPoint("first",3,4.5);
        Point second = new LabeledPoint("second",3,4.5);
        System.out.println(first.toString());
        System.out.println(second.equals(first));
        System.out.println(first.equals(second));
        System.out.println(first.hashCode());
        System.out.println(second.hashCode());
    }

    private static void Ex_4_5() {
        Line line = new Line(new Point(1,2),new Point(3,1));
        Circle circle = new Circle(new Point(1.4,2),4.5);
        Rectangle rectangle = new Rectangle(new Point(1.6,1),5,4);

        System.out.println(line.getCenter().toString());
        System.out.println(circle.getCenter().toString());
        System.out.println(rectangle.getCenter().toString());

        System.out.println("\n"+line.getPos().toString()+" "+line.getPoint2().toString());
        System.out.println("Shift by 1 on 0x");
        line.moveBy(1,0);
        System.out.println(line.getPos().toString()+" "+line.getPoint2().toString());

        System.out.println("\n"+circle.getPos().toString());
        System.out.println("Shift by 1 on 0y");
        circle.moveBy(0,1);
        System.out.println(circle.getPos().toString());

        Rectangle rectangle2 = rectangle.clone();
        System.out.println("\n"+rectangle.getPos().toString()+" "+rectangle2.getPos().toString());
        System.out.println("Shift by 1 on 0y");
        rectangle2.moveBy(0,1);
        System.out.println(rectangle.getPos().toString()+" "+rectangle2.getPos().toString());
    }
}
