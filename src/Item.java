import java.util.Objects;

public class Item {
    private String description;
    private double price;

    Item(String description,double price)
    {
        this.price=price;
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Item)) return false;
        Item iObj = (Item) obj;
        return Objects.equals(this.description,iObj.getDescription()) && ((Double)this.price).equals(iObj.getPrice());
    }
}
