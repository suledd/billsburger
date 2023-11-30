import java.util.ArrayList;

public class DeluxeBurgerMenu extends BurgerMenu {
    public DeluxeBurgerMenu(SideDish side, Drink drink, ArrayList<Topping> toppings) {
        super(new DeluxeBurger(toppings), side, drink);
    }
}
