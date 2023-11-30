public class Topping {
    private ToppingType type;
    private double price;

    public Topping(ToppingType type) {
        this.type = type;
        this.price = getToppingPrice(type);
    }

    private double getToppingPrice(ToppingType type) {
        return switch (type) {
            case CHEESE  -> .50;
            case ONION   -> .30;
            case TOMATO  -> .15;
            case LETTUCE -> .20;
            case BACON   -> .65;
            case EGG     -> .55;
        };
    }

    public double getPrice() {
        return price;
    }

    public enum ToppingType {
        CHEESE,
        ONION,
        TOMATO,
        LETTUCE,
        BACON,
        EGG
    }

    @Override
    public String toString() {
        return type.name().toLowerCase();
    }
}
