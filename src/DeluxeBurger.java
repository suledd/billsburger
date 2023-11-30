import java.lang.reflect.Array;
import java.util.ArrayList;

public class DeluxeBurger extends Burger {
    public DeluxeBurger(ArrayList<Topping> toppings){
        super(6.99, 5, toppings);
    }

    @Override
    public String toString() {
        return String.format(
                "DeluxeBurger: %n price: %.2f %n toppings: %s",
                getPrice(),
                getToppingsToString());
    }

    @Override
    // Deluxe Burger price includes the toppings
    protected void addToppingPrice(double price) {}
}
