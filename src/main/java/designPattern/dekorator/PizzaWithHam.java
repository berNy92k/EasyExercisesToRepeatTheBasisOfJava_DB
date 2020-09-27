package designPattern.dekorator;

import java.math.BigDecimal;

public class PizzaWithHam extends Pizza {
    private static final BigDecimal PRICE = new BigDecimal(5);
    private final Pizza pizza;

    public PizzaWithHam(Pizza pizza) {
        this.pizza = pizza;
    }

    public BigDecimal getPrice() {
        return pizza.getPrice().add(PRICE);
    }
}
