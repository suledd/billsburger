import java.util.ArrayList;

public class CheeseburgerMenu extends BurgerMenu{
    public CheeseburgerMenu(SideDish side, Drink drink, ArrayList<Topping> toppings) {
        super(new Cheeseburger(toppings), side, drink);
    }
}
