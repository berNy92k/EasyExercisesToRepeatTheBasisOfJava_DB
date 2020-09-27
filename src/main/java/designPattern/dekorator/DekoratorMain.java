package designPattern.dekorator;

public class DekoratorMain {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Pizza pizzaWithCheese = new PizzaWithCheese(pizza);
        Pizza pizzaWithChicken = new PizzaWithChicken(pizzaWithCheese);
        Pizza pizzaWithHam = new PizzaWithHam(pizzaWithChicken);

        System.out.println(pizzaWithHam.getPrice());
    }

}
