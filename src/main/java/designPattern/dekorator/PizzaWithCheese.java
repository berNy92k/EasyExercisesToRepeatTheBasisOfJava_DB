package designPattern.dekorator;

import java.math.BigDecimal;

public class PizzaWithCheese extends Pizza {
    private static final BigDecimal PRICE = new BigDecimal(2);
    private final Pizza pizza;

    public PizzaWithCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    public BigDecimal getPrice() {
        return pizza.getPrice().add(PRICE);
    }
}
