import java.util.ArrayList;

public class HamburgerMenu extends BurgerMenu{
    public HamburgerMenu(SideDish side, Drink drink, ArrayList<Topping> toppings) {
        super(new Hamburger(toppings), side,drink);
    }
}
