package Ex_from_1_to_5;

public class LabeledPoint extends Point {
    private String label;

    public LabeledPoint(String label, double x,double y){
        super(x,y);
        this.label=label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label+" "+super.toString();
    }
}
