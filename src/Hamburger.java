import java.util.ArrayList;

public class Hamburger extends Burger{
    public Hamburger(ArrayList<Topping> toppings) {
        super(3.99, 3, toppings);
    }

    @Override
    public String toString() {
        return String.format(
                "Hamburger: %n price: %.2f %n toppings: %s",
                getPrice(),
                getToppingsToString());
    }
}
