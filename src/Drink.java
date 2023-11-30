import pricing.DrinkPricingStrategy;
import pricing.PricingStrategy;
import pricing.Size;

public class Drink {
    private Size size;
    private DrinkType type;
    private double basePrice = 1.55;
    private double totalPrice;

    public Drink (DrinkType type, Size size) {
        this.type = type;
        this.size = size;
        PricingStrategy pricingStrategy = new DrinkPricingStrategy();
        this.totalPrice = pricingStrategy.calculatePrice(this.basePrice, size);
    }

    public double getPrice() {
        return this.totalPrice;
    }

    @Override
    public String toString() {
        return String.format(
                "DRINK:%n type: %s%n size: %s%n price: %.2f",
                this.type.name().toLowerCase(),
                this.size.name().toLowerCase(),
                this.totalPrice);
    }

    public enum DrinkType {
        COLA,
        FANTA,
        SPRITE,
        WATER
    }
}
