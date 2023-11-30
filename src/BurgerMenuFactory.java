import pricing.Size;

import java.util.ArrayList;

public class BurgerMenuFactory {
    public static BurgerMenu createBurgerMenu(Drink drink, ArrayList<Topping> toppings) {
        SideDish side = new SideDish(SideDish.SideDishType.FRIES, Size.SMALL);
        return new HamburgerMenu(side, drink, toppings);
    }

    public static CheeseburgerMenu createCheeseburgerMenu(SideDish side, Drink drink, ArrayList<Topping> toppings) {
        return new CheeseburgerMenu(side, drink, toppings);
    }

    public static DeluxeBurgerMenu createDeluxeBurgerMenu(SideDish side, Drink drink, ArrayList<Topping> toppings) {
        return new DeluxeBurgerMenu(side, drink, toppings);
    }
}
