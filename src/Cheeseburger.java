import java.util.ArrayList;

public class Cheeseburger extends Burger {
    public Cheeseburger(ArrayList<Topping> toppings) {
        super(4.69,3, toppings);
    }

    @Override
    public String toString() {
        return String.format(
                "Cheeseburger: %n price: %.2f %n toppings: %s",
                getPrice(),
                getToppingsToString());
    }
}
