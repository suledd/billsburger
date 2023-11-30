package pricing;

public class DrinkPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice, Size size) {
        return basePrice + getExtraPrice(size);
    }

    private double getExtraPrice(Size size) {
        return switch (size) {
            case SMALL  -> .00;
            case MEDIUM -> .80;
            case LARGE  -> 1.00;
        };
    }
}
