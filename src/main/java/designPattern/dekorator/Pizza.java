package designPattern.dekorator;

import java.math.BigDecimal;

public class Pizza {
    private static final BigDecimal PRICE = new BigDecimal(30);

    public BigDecimal getPrice() {
        return PRICE;
    }

    @Override
    public String toString() {
        return "Pizza";
    }
}
