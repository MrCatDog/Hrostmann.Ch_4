import Ex_from_1_to_5.*;

/**
 * Main class for demonstrating all exercises one by one.
 * Ex.1: Make Point class and a subclass LabledPoint.
 * Ex.2: Define methods toString(), equals() and hashCode() for previous methods.
 * Ex.3: Define variables x and y from Point class as protected, try to access them from another package.
 * Ex.4: Define abstract class Shape with Point variable, constructor, method moveBy(double x, double y)
 * and abstract method public Point getCenter(). Provide implementation classes: Circle, Rectangle, Line.
 * Ex.5: Define clone() methods for previous classes.
 * Ex.6: Realize method equals() in DiscountItem class for comparing superclass only with Item class parameters,
 * and with discount in case of DiscountedItem. Show symmetry property and lack of transitivity property.
 * Ex.7: Define enum for 8 base colors with methods getRed(), getGreen(), getBlue().
 */
public class Chapter_4 {
    public static void main(String[] args) {
        System.out.println("\nEx. 1-3:");
        Ex_1_3();
        System.out.println("\nEx. 4-5:");
        Ex_4_5();
        System.out.println("\nEx. 6:");
        Ex_6();
        System.out.println("\nEx. 7:");
        Ex_7();
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

    private static void Ex_6() {
        Item second = new Item("second",100);
        DiscountedItem dSecond = new DiscountedItem("second",100,30);
        Item second2 = new Item("second",100);
        System.out.println("Symmetry check:");
        System.out.println(second.equals(dSecond));
        System.out.println(dSecond.equals(second));
        System.out.println("\nTransitivity check:");
        System.out.println("second=second2? "+second.equals(second2)+"\nSecond2=dSecond? "+second2.equals(dSecond));
        //Чёрт пойму как я покажу отсутствие транзитивности, если в книге написанно делать вызов x-y, y-z, но не x-z.
        // Ну ладно, вот вызов x-z и он тоже true, но это не потому что до этого мы могли бы самостоятельно сделать такой вывод.
        System.out.println("second=dSecond? "+dSecond.equals(second));
    }

    private static void Ex_7() {
        for (ColorsEnum i: ColorsEnum.values()) {
            System.out.println(i.toString() + "\nR:" + i.getRed() + " G:" + i.getGreen() + " B:" + i.getBlue());
        }
    }

    private static void Ex_8() {

    }
}