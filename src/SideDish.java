import pricing.PricingStrategy;
import pricing.SideDishPricingStrategy;
import pricing.Size;

public class SideDish {
    private Size size;
    private SideDishType type;
    private double basePrice;
    private double totalPrice;

    public SideDish(SideDishType type, Size size) {
        this.size      = size;
        this.type      = type;
        this.basePrice = getBasePriceWithType(type);
        PricingStrategy pricingStrategy = new SideDishPricingStrategy();
        this.totalPrice = pricingStrategy.calculatePrice(basePrice, size);
    }

    private double getBasePriceWithType(SideDishType type) {
        return switch (type) {
            case FRIES   -> 2.55;
            case NUGGERS -> 3.65;
            case BROWNIE -> 4.65;
        };
    }

    public double getPrice() {
        return this.totalPrice;
    }

    @Override
    public String toString(){
        return String.format(
                "SIDE:%n type: %s%n size: %s%n price: %s",
                this.type.name().toLowerCase(),
                this.size.name().toLowerCase(),
                this.totalPrice);
    }

    public enum SideDishType {
        FRIES,
        NUGGERS,
        BROWNIE
    }
}
