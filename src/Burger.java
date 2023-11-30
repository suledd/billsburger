import java.util.ArrayList;
import java.util.stream.Collectors;

public class Burger {
    private double price;
    private int maxToppings;
    private ArrayList<Topping> toppings;

    public Burger(double price, int maxToppings, ArrayList<Topping> toppings) {
        this.maxToppings = maxToppings;
        this.price       = price;
        this.toppings    = new ArrayList<>();
        addToppings(toppings);
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public ArrayList<Topping> getToppings() {
        return toppings;
    }
    public void addToppings(ArrayList<Topping> toppings) {
        for (Topping t : toppings) {
            addTopping(t);
        }
    }

    public void addTopping(Topping t) {
        if (toppings.size() < this.maxToppings) {
            this.toppings.add(t);
            addToppingPrice(t.getPrice());
        } else {
            throw new IllegalArgumentException(
                    String.format("Max number of toppings: %d", this.maxToppings)
            );
        }
    }

    protected void addToppingPrice(double price) {
        this.price += price;
    }
    public String getToppingsToString() {
        return this.toppings.stream()
                .map(Topping::toString)
                .collect(Collectors.joining(", "));
    }

//    public String getToppingsToString() {
//        List<String> toppings = new ArrayList<>();
//        for(Topping t : this.toppings) {
//            toppings.add(t.toString());
//        }
//        return String.join(", ", toppings);
//    }
}
