import java.util.Objects;

public class DiscountedItem extends Item{
    private double discount;

    DiscountedItem(String description, double price, double discount) {
        super(description,price);
        this.discount=discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null) return false;
        if(obj instanceof Item) {
            if (obj instanceof DiscountedItem) {
                DiscountedItem second = (DiscountedItem) obj;

                return Objects.equals(this.getDescription(),second.getDescription()) &&
                        ((Double)(this.getPrice()*(this.getDiscount()/100))).equals(second.getPrice()*(second.getDiscount()/100));
            } else {
                return super.equals(obj);
            }
        }
        else return false;
    }
}
