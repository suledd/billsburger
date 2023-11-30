public class BurgerMenu {
    private Burger burger;
    private SideDish side;
    private Drink drink;
    private double price;

    public BurgerMenu(Burger burger, SideDish side, Drink drink) {
        this.burger = burger;
        this.side   = side;
        this.drink  = drink;
        this.price  = burger.getPrice() + side.getPrice() + drink.getPrice();
    }

    public Burger getBurger() {
        return burger;
    }

    public SideDish getSide() {
        return side;
    }

    public Drink getDrink() {
        return drink;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format(
                "BURGER MENU:%n %s%n %s%n %s%n total price: %.2f%n",
                this.getBurger().toString(),
                this.getSide().toString(),
                this.getDrink().toString(),
                this.getPrice());
    }
}
