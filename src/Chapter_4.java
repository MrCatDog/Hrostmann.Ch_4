public class Chapter_4 {
    public static void main(String[] args) {
        Ex_1();
    }

    private static void Ex_1() {
        LabeledPoint first = new LabeledPoint("first",3,4.5);
        Point second = new LabeledPoint("second",3,4.5);
        System.out.println(first.toString());
        System.out.println(second.equals(first));
        System.out.println(first.equals(second));
    }
}
