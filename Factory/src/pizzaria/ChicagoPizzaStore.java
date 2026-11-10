package pizzaria;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        Pizza pizza;

        if ("cheese".equalsIgnoreCase(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if ("clam".equalsIgnoreCase(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else {
            return null;
        }

        return pizza;
    }
}