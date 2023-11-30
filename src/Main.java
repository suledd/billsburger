import pricing.Size;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Topping cheese  = new Topping(Topping.ToppingType.CHEESE);
        Topping onion   = new Topping(Topping.ToppingType.ONION);
        Topping tomato  = new Topping(Topping.ToppingType.TOMATO);
        Topping lettuce = new Topping(Topping.ToppingType.LETTUCE);
        Topping bacon   = new Topping(Topping.ToppingType.BACON);
        Topping egg     = new Topping(Topping.ToppingType.EGG);

        ArrayList<Topping> toppings3 = new ArrayList<>();
        toppings3.add(cheese);
        toppings3.add(onion);
        toppings3.add(tomato);
        ArrayList<Topping> toppings5 = new ArrayList<>(toppings3);
        toppings5.add(lettuce);
        toppings5.add(bacon);
        ArrayList<Topping> toppings6 = new ArrayList<>(toppings5);
        toppings6.add(egg);


        Drink drink = new Drink(Drink.DrinkType.FANTA, Size.MEDIUM);

        SideDish side = new SideDish(SideDish.SideDishType.NUGGERS, Size.MEDIUM);

        BurgerMenu bm = BurgerMenuFactory.createBurgerMenu(drink, toppings3);
        System.out.println(bm);

        BurgerMenu cbm = BurgerMenuFactory.createCheeseburgerMenu(side, drink, toppings5);
        System.out.println(cbm);

        BurgerMenu dbm = BurgerMenuFactory.createDeluxeBurgerMenu(side, drink, toppings5);
        System.out.println(dbm);



        ArrayList<Topping> toppings = new ArrayList<>();

        toppings.add(cheese);
        toppings.add(onion);
        toppings.add(tomato);
        BurgerMenu defaultMenu = BurgerMenuFactory.createBurgerMenu(drink, toppings);
        toppings.add(bacon);
        BurgerMenu defaultMenu2 = BurgerMenuFactory.createBurgerMenu(drink, toppings);
    }
}