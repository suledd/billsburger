package pricing;

public class SideDishPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice, Size size) {
        return basePrice + getExtraPrice(size);
    }

    private static double getExtraPrice(Size size) {
        return switch (size) {
            case SMALL  -> .00;
            case MEDIUM -> .85;
            case LARGE  -> 1.55;
        };
    }
}
