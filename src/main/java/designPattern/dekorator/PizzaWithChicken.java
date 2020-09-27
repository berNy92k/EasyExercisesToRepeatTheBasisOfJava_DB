package designPattern.dekorator;

import java.math.BigDecimal;

public class PizzaWithChicken extends Pizza {
    private static final BigDecimal PRICE = new BigDecimal(7);
    private final Pizza pizza;

    public PizzaWithChicken(Pizza pizza) {
        this.pizza = pizza;
    }

    public BigDecimal getPrice() {
        return pizza.getPrice().add(PRICE);
    }
}
