import org.junit.jupiter.api.Test;
import pricing.Size;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BurgerMenuUnitTest {
    Topping cheese  = new Topping(Topping.ToppingType.CHEESE);
    Topping onion   = new Topping(Topping.ToppingType.ONION);
    Topping tomato  = new Topping(Topping.ToppingType.TOMATO);
    Topping lettuce = new Topping(Topping.ToppingType.LETTUCE);
    Topping bacon   = new Topping(Topping.ToppingType.BACON);
    Topping egg     = new Topping(Topping.ToppingType.EGG);
    ArrayList<Topping> toppings = new ArrayList<>();

    @Test
    void testCreateBurgerMenu() {
        Drink drink = new Drink(Drink.DrinkType.SPRITE, Size.LARGE);
        toppings.add(cheese);
        toppings.add(onion);
        toppings.add(tomato);
        BurgerMenu defaultMenu = BurgerMenuFactory.createBurgerMenu(drink, toppings);
        assertNotNull(defaultMenu, "Default burger menu should not be null");
        assertNotNull(defaultMenu.getBurger(), "Burger should not be null in the default menu");
        assertNotNull(defaultMenu.getSide(), "Side dish should not be null in the default menu");
        assertNotNull(defaultMenu.getDrink(), "Drink should not be null in the default menu");
    }

    @Test
    void testTooManyToppingsThrowsException() {
        Drink drink = new Drink(Drink.DrinkType.SPRITE, Size.LARGE);
        toppings.add(cheese);
        toppings.add(onion);
        toppings.add(tomato);
        BurgerMenu defaultMenu = BurgerMenuFactory.createBurgerMenu(drink, toppings);
        assertThrows(IllegalArgumentException.class, () -> defaultMenu.getBurger().addTopping(bacon));
    }
}
